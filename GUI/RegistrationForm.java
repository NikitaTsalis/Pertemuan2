package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame {
    private JTextField nameField, nimField, emailField, phoneField, addressField, dobField, regNumberField;

    public RegistrationForm() {
        setTitle("Formulir Pendaftaran Ulang Mahasiswa Baru");
        setSize(450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2, 10, 10));

        panel.add(new JLabel("Nama Lengkap:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("NIM:"));
        nimField = new JTextField();
        panel.add(nimField);

        panel.add(new JLabel("Tanggal Lahir (YYYY-MM-DD):"));
        dobField = new JTextField();
        panel.add(dobField);

        panel.add(new JLabel("Nomor Pendaftaran:"));
        regNumberField = new JTextField();
        panel.add(regNumberField);

        panel.add(new JLabel("Alamat Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Nomor Telepon:"));
        phoneField = new JTextField();
        panel.add(phoneField);

        panel.add(new JLabel("Alamat:"));
        addressField = new JTextField();
        panel.add(addressField);

        add(panel, BorderLayout.CENTER);

        JButton submitButton = new JButton("Submit");
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(submitButton);
        add(buttonPanel, BorderLayout.SOUTH);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isFormValid()) {
                    int response = JOptionPane.showConfirmDialog(
                            null,
                            "Apakah anda yakin data yang Anda isi sudah benar?",
                            "Konfirmasi",
                            JOptionPane.OK_CANCEL_OPTION
                    );
                    if (response == JOptionPane.OK_OPTION) {
                        showData();
                    }
                } else {
                    JOptionPane.showMessageDialog(
                            null,
                            "Semua kolom harus diisi!",
                            "Peringatan",
                            JOptionPane.WARNING_MESSAGE
                    );
                }
            }
        });
    }

    private boolean isFormValid() {
        return !nameField.getText().isEmpty() &&
                !nimField.getText().isEmpty() &&
                !dobField.getText().isEmpty() &&
                !regNumberField.getText().isEmpty() &&
                !emailField.getText().isEmpty() &&
                !phoneField.getText().isEmpty() &&
                !addressField.getText().isEmpty();
    }

    private void showData() {
        JFrame dataFrame = new JFrame("Data Pendaftaran");
        dataFrame.setSize(400, 400);
        dataFrame.setLocationRelativeTo(null);
        dataFrame.setLayout(new GridLayout(8, 2, 10, 10));

        dataFrame.add(new JLabel("Nama Lengkap:"));
        dataFrame.add(new JLabel(nameField.getText()));

        dataFrame.add(new JLabel("NIM:"));
        dataFrame.add(new JLabel(nimField.getText()));

        dataFrame.add(new JLabel("Tanggal Lahir:"));
        dataFrame.add(new JLabel(dobField.getText()));

        dataFrame.add(new JLabel("Nomor Pendaftaran:"));
        dataFrame.add(new JLabel(regNumberField.getText()));

        dataFrame.add(new JLabel("Alamat Email:"));
        dataFrame.add(new JLabel(emailField.getText()));

        dataFrame.add(new JLabel("Nomor Telepon:"));
        dataFrame.add(new JLabel(phoneField.getText()));

        dataFrame.add(new JLabel("Alamat:"));
        dataFrame.add(new JLabel(addressField.getText()));

        dataFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RegistrationForm().setVisible(true);
            }
        });
    }
}