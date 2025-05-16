package tinp1;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame {

    private JPanel contentPane;
    private JTextField tfNum1, tfNum2;
    private JLabel lblResult;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Test frame = new Test();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Test() {
        setTitle("Phép cộng 2 số");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 180);
        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        setContentPane(contentPane);

        contentPane.add(new JLabel("Số 1:"));
        tfNum1 = new JTextField(10);
        contentPane.add(tfNum1);

        contentPane.add(new JLabel("Số 2:"));
        tfNum2 = new JTextField(10);
        contentPane.add(tfNum2);

        JButton btnCalculate = new JButton("Tính");
        contentPane.add(btnCalculate);

        lblResult = new JLabel("Kết quả: ");
        contentPane.add(lblResult);

        btnCalculate.addActionListener(e -> {
            try {
                int num1 = Integer.parseInt(tfNum1.getText().trim());
                int num2 = Integer.parseInt(tfNum2.getText().trim());
                int sum = num1 + num2;
                lblResult.setText("Kết quả: " + sum);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
}
