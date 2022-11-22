package src.edu.yana.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textEmail;
    private JButton buttonSave;
    private JPanel rootP;
    private JLabel labelHasil;
    private JTextField textHp;
    private JTextField textJurusan;

    public FormBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengambil data dri textNama
                String nama = textNama.getText();
                //mengambil data dri textNim
                String email = textEmail.getText();
                //mengambil data dri textHP
                String nomor = textHp.getText();
                //mwngambil data dri textJurusan
                String jurusan = textJurusan.getText();

                //diproses
                Mahasiswa mhs = new Mahasiswa();
                mhs.setNama(nama);
                mhs.setEmail(email);
                mhs.setNomor(nomor);
                mhs.setJurusan(jurusan);
                //tampilkan output ke FORM
                labelHasil.setText(mhs.toString());
            }
        });
    }

    public JPanel getRootP() {
        return rootP;
    }
}
