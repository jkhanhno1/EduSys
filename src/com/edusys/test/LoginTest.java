package com.edusys.test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

import com.edusys.ui.LoginJDialog;
import com.edusys.utils.Auth;
import com.edusys.utils.MsgBox;

public class LoginTest {

	// Đăng nhập với thông tin đăng nhập chính xác
	@Test
	public void LoginWithPermitAccount() {
		LoginJDialog logdia = new LoginJDialog(null, true);
		logdia.txtUser.setText("NoPT");
		logdia.txtPassword.setText("123456");
		logdia.login();

		// Kiểm tra xem AuthUser đã được thiết lập chưa
		assertEquals("NoPT", Auth.user.getMaNV());
	}

	// Đăng nhập với username sai
	@Test
	public void WrongUsernameLoginTest() {
		LoginJDialog logdia = new LoginJDialog(null, true);
		logdia.txtUser.setText("wrongusername");
		logdia.txtPassword.setText("123456");
		logdia.login();

		// Kiểm tra thông báo lỗi có xuất hiện hay không
		assertEquals("Wrong username!", MsgBox.message);
	}

	// Đăng nhập với password sai
	@Test
	public void WrongPasswordLoginTest() {
		LoginJDialog logdia = new LoginJDialog(null, true);
		logdia.txtUser.setText("NoPT");
		logdia.txtPassword.setText("55555");
		logdia.login();

		// Kiểm tra thông báo lỗi có xuất hiện hay không
		assertEquals("Wrong password!", MsgBox.message);
	}

	// Đăng nhập với username để trống
	@Test
	public void NullUserLoginTest() {
		LoginJDialog logdia = new LoginJDialog(null, true);
		logdia.txtUser.setText("");
		logdia.txtPassword.setText("123456");
		logdia.login();

		// Kiểm tra thông báo lỗi có xuất hiện hay không
		assertEquals("Wrong username!", MsgBox.message);
	}

	// Đăng nhập với password để trống
	@Test
	public void NullPasswordLoginTest() {
		LoginJDialog logdia = new LoginJDialog(null, true);
		logdia.txtUser.setText("NoPT");
		logdia.txtPassword.setText("");
		logdia.login();

		// Kiểm tra thông báo lỗi có xuất hiện hay không
		assertEquals("Wrong password!", MsgBox.message);
	}
}
