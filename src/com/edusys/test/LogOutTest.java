package com.edusys.test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertNull;

import com.edusys.entity.NhanVien;
import com.edusys.ui.LoginJDialog;
import com.edusys.ui.MainJFrame;
import com.edusys.utils.Auth;

public class LogOutTest {
	private LoginJDialog loginDialog = new LoginJDialog(null, true);
	private NhanVien nv;

	@Before
	public void setUp() {
		// Đặt mật khẩu và tài khoản cho đối tượng giả mạo của loginDialog
		String username = "NoPT";
		String password = "123456";
		loginDialog.txtUser.setText(username);
		loginDialog.txtPassword.setText(password);

		// Gọi phương thức đăng nhập
		loginDialog.login();
		System.out.println(Auth.user.getMaNV());
		nv = Auth.user;
		System.out.println(nv.getMaNV());
	}

	@Test
	public void testLogOutAfterLogin() {
		MainJFrame mainFrame = new MainJFrame();

		Auth.user = nv;
		// Đăng xuất
		if (Auth.user != null) {
			mainFrame.LogOut();
			// Kiểm tra xem Auth.user đã được xóa chưa
			assertNull(Auth.user);
		} else {
			System.out.println("Ko có User");
		}

	}

}