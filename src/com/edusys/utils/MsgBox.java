package com.edusys.utils;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author balis
 */
public class MsgBox {

    public static String message; // Thêm biến message để lưu thông báo

    public static void alert(Component parent, String message) {
        MsgBox.message = message; // Gán giá trị cho biến message
        JOptionPane.showMessageDialog(parent, message, "EduSys", JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean confirm(Component parent, String message) {
        MsgBox.message = message; // Gán giá trị cho biến message
        int result = JOptionPane.showConfirmDialog(parent, message, "EduSys", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }

    public static String prompt(Component parent, String message) {
        MsgBox.message = message; // Gán giá trị cho biến message
        return JOptionPane.showInputDialog(parent, message, "EduSys", JOptionPane.INFORMATION_MESSAGE);
    }
}
