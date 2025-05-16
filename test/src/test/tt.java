package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tt extends JFrame {
    private JTextField txtSo1, txtSo2, txtKetQua;
    private JButton btnNhan;

    public tt() {
        setTitle("Phép nhân hai số");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // canh giữa cửa sổ

        // Tạo panel để chứa các thành phần
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Các thành phần
        panel.add(new JLabel("Số thứ nhất:"));
        txtSo1 = new JTextField();
        panel.add(txtSo1);

        panel.add(new JLabel("Số thứ hai:"));
        txtSo2 = new JTextField();
        panel.add(txtSo2);

        panel.add(new JLabel("Kết quả:"));
        txtKetQua = new JTextField();
        txtKetQua.setEditable(false);
        panel.add(txtKetQua);

        btnNhan = new JButton("Nhân");
        panel.add(btnNhan);

        // Thêm listener cho nút
        btnNhan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double so1 = Double.parseDouble(txtSo1.getText());
                    double so2 = Double.parseDouble(txtSo2.getText());
                    double ketQua = so1 * so2;
                    txtKetQua.setText(String.valueOf(ketQua));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số hợp lệ!");
                }
            }
        });

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new tt();
    }
}
