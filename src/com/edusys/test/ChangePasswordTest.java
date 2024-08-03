//package com.edusys.test;
//
//import org.junit.Before;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//import com.edusys.entity.NhanVien;
//import com.edusys.ui.ChangePasswordJDialog;
//import com.edusys.utils.Auth;
//import com.edusys.utils.MsgBox;
//
//public class ChangePasswordTest {
//
//    @Before
//    public void setUp() {
//        // Giả lập quá trình đăng nhập thành công
//        Auth.user = new NhanVien("NoPT", "123456", Boolean); // Giả định đây là một quản lý (vaiTro = true)
//    }
//
//    // Thay đổi mật khẩu với thông tin chính xác
//    @Test
//    public void changePasswordWithCorrectInfo() {
//        ChangePasswordJDialog changePassDialog = new ChangePasswordJDialog(null, true);
//        changePassDialog.txtCurrentPass.setText("123456");
//        changePassDialog.txtNewPass.setText("1234567");
//        changePassDialog.txtConfirmPass.setText("1234567");
//        changePassDialog.changePassword();
//
//        // Kiểm tra xem mật khẩu đã được thay đổi thành công hay không
//        assertEquals("newPassword", Auth.user.getMatKhau());
//    }
//
//    // Các test case khác ở đây...
//}
//
