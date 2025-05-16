package bai1;
import javax.swing.*;
import java.awt.*;

public class tru2so extends JFrame {
    private JTextField txtNumber1;
    private JTextField txtNumber2;
    private JTextField txtResult;

    public tru2so() {
        setTitle("Trừ 2 Số");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // canh giữa màn hình

        // Panel chính với GridBagLayout
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);             // lề xung quanh mỗi component :contentReference[oaicite:0]{index=0}
        gbc.anchor = GridBagConstraints.WEST;            // canh trái các label :contentReference[oaicite:1]{index=1}

        // Label và ô số thứ nhất (hàng 0, cột 0-1)
        gbc.gridx = 0; gbc.gridy = 0;
        panel.add(new JLabel("Số thứ nhất:"), gbc);

        gbc.gridx = 1;
        txtNumber1 = new JTextField(10);                 // 10 columns, nhỏ gọn hơn :contentReference[oaicite:2]{index=2}
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;                               // chỉ cho field giãn ngang
        panel.add(txtNumber1, gbc);

        // Label và ô số thứ hai (hàng 1, cột 0-1)
        gbc.gridx = 0; gbc.gridy = 1;
        gbc.fill = GridBagConstraints.NONE; gbc.weightx = 0;
        panel.add(new JLabel("Số thứ hai:"), gbc);

        gbc.gridx = 1;
        txtNumber2 = new JTextField(10);
        gbc.fill = GridBagConstraints.HORIZONTAL; gbc.weightx = 1.0;
        panel.add(txtNumber2, gbc);

        // Nút “Trừ” (hàng 2, cột 0-2)
        gbc.gridx = 0; gbc.gridy = 2;
        gbc.gridwidth = 2; gbc.fill = GridBagConstraints.NONE; gbc.weightx = 0;
        JButton btnSubtract = new JButton("Trừ");
        panel.add(btnSubtract, gbc);

        // Label và ô kết quả (hàng 3, cột 0-1)
        gbc.gridy = 3; gbc.gridwidth = 1;
        gbc.gridx = 0;
        panel.add(new JLabel("Kết quả:"), gbc);

        gbc.gridx = 1;
        txtResult = new JTextField(10);
        txtResult.setEditable(false);
        gbc.fill = GridBagConstraints.HORIZONTAL; gbc.weightx = 1.0;
        panel.add(txtResult, gbc);

        // Xử lý sự kiện
        btnSubtract.addActionListener(e -> {
            try {
                double n1 = Double.parseDouble(txtNumber1.getText());
                double n2 = Double.parseDouble(txtNumber2.getText());
                txtResult.setText(String.valueOf(n1 - n2));
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    this, "Vui lòng nhập số hợp lệ!", "Lỗi định dạng",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        });

        add(panel);
        pack();           // tự động điều chỉnh kích thước theo nội dung :contentReference[oaicite:3]{index=3}
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(tru2so::new);
    }
}
