package src.edu.yana.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textHarga;
    private JTextField textJumlah;
    private JButton button;
    private JPanel rootP;
    private JLabel labelHasil;




    public FormBiodata() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //mengambil data dri textNama
                int harga = Integer.parseInt(textHarga.getText());
                //mengambil data dri textNim
                int jumlah = Integer.parseInt(textJumlah.getText());

                int get_total = harga*jumlah;
                //tampilkan output ke FORM
                labelHasil.setText(Integer.toString(get_total));
            }
        });
    }

    public JPanel getRootP() {
        return rootP;
    }
}
