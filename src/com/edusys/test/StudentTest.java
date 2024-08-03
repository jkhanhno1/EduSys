package com.edusys.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import javax.swing.JComboBox;

import org.junit.Before;
import org.junit.Test;

import com.edusys.entity.NhanVien;
import com.edusys.ui.CourseJDialog;
import com.edusys.ui.LoginJDialog;
import com.edusys.ui.MainJFrame;
import com.edusys.ui.StudentJDialog;
import com.edusys.utils.Auth;

public class StudentTest {

    private LoginJDialog loginDialog;
    private NhanVien nv;

    @Before
    public void setUp() {
        // Khởi tạo một đối tượng LoginJDialog
        loginDialog = new LoginJDialog(null, true);
        
        // Thiết lập tên người dùng và mật khẩu
        String username = "NghiemN";
        String password = "songlong";
        loginDialog.txtUser.setText(username);
        loginDialog.txtPassword.setText(password);
        
        // Gọi phương thức đăng nhập từ lớp LoginJDialog
        loginDialog.login();

        
        // Lấy thông tin người dùng đăng nhập thành công từ Auth.user
        nv = Auth.user;
        MainJFrame frame = new MainJFrame();
    }
    
    @Test
    public void tableNguoiHoc_insertKH() {
        // Tạo một đối tượng StudentJDialog để kiểm thử
        StudentJDialog stdDialog = new StudentJDialog(null, true);
        stdDialog.setSize(400, 300);
        
        
        
        // Thực hiện các bước kiểm thử
        // Ví dụ: stdDialog.doSomething();
    }
}
