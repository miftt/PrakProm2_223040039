package pertemuan2;

import java.awt.event.*;
import javax.swing.*;

public class BiodataLat4 extends JFrame {
    public BiodataLat4() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelInput = new JLabel("Input Nama");
        labelInput.setBounds(130, 40, 100, 10);

        JTextField textField = new JTextField();
        textField.setBounds(130, 60, 100, 30);

        JLabel labelInput2 = new JLabel("Input Nomor Telepon");
        labelInput2.setBounds(130, 100, 100, 10);

        JTextField textField2 = new JTextField();
        textField2.setBounds(130, 120, 100, 30);

        JButton button = new JButton("Klik");
        button.setBounds(130, 160, 100, 40);

        JLabel labelInput3 = new JLabel("Daftar Kontak");
        labelInput3.setBounds(130, 210, 100, 10);

        JTextArea txtOutput = new JTextArea("");
        txtOutput.setBounds(130, 230, 200, 200);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                String nomorTelepon = textField2.getText();
                txtOutput.append("Nama: " +nama + "\n" + "Nomor Telepon: " + nomorTelepon + "\n");
                txtOutput.append("==========================\n");
                textField.setText("");
                textField2.setText("");
            }
        });

        this.add(button);
        this.add(labelInput);
        this.add(textField);
        this.add(labelInput2);
        this.add(textField2);
        this.add(labelInput3);
        this.add(txtOutput);

        this.setSize(400, 500);
        this.setLayout(null);

    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                BiodataLat4 h = new BiodataLat4();
                h.setVisible(true);
            }
        });
    }
}