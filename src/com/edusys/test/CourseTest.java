package com.edusys.test;

//import static org.junit.Assert.*;
//
//import org.junit.Before;
//import org.junit.Test;
//
//import com.edusys.entity.NhanVien;
//import com.edusys.ui.CourseJDialog;
//import com.edusys.ui.LoginJDialog;
//import com.edusys.utils.Auth;
//
//public class CourseTest {
//
//    private LoginJDialog loginDialog = new LoginJDialog(null, true);
//    private NhanVien nv;
//
//    @Before
//    public void setUp() {
//        // Thiết lập đối tượng giả mạo của cửa sổ đăng nhập
//        String username = "NoPT";
//        String password = "123456";
//        loginDialog.txtUser.setText(username);
//        loginDialog.txtPassword.setText(password);
//
//        // Đăng nhập bằng đối tượng giả mạo
//        loginDialog.login();
//        nv = Auth.user;
//    }
//
//    @Test
//    public void addCourseTest() {
//        CourseJDialog courseDialog = new CourseJDialog(null, true);
//        courseDialog.txtCreator.setText(nv.getMaNV());
//        courseDialog.txtCreator.setEditable(false); // Đảm bảo rằng trường MaNV không thể chỉnh sửa
//        courseDialog.lblSubject.setText("KH001");
//        courseDialog..setText("Khóa học kiểm thử");
//        courseDialog.txtMoTa.setText("Đây là một khóa học kiểm thử.");
//        courseDialog.txtHocPhi.setText("1000000");
//        courseDialog.txtThoiLuong.setText("30");
//
//        courseDialog.insert(); // Thêm khóa học vào cơ sở dữ liệu
//
//        // Thêm các phần kiểm tra ở đây để đảm bảo rằng việc thêm đã thành công
//        // Ví dụ:
//        // assertTrue("Thêm khóa học thất bại!", /* thêm điều kiện kiểm tra của bạn ở đây */);
//    }
//}
