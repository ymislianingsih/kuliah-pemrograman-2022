import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FormImage {
    private JTextField textNomor;
    private JComboBox comboJenis;
    private JComboBox comboBank;
    private JTextField textNama;
    private JButton saveButton;
    private JButton browseImageButton;
    private JPanel rootP;
    private JTextArea textArea;
    private JLabel imageimage;

    String namaFileGambar;



    public FormImage() {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textArea.setText("");
                String nomor = textNomor.getText();
                String jenis = comboJenis.getSelectedItem().toString();
                String bank = comboBank.getSelectedItem().toString();
                String nama = textNama.getText();

                String result = String.format("\nNomor kartu:"+nomor+" \nJenis ATM:"+jenis+" \nBank:"+bank+" \nNama Pemilik:"+nama+" \nNama File :"+namaFileGambar );
                textArea.append(result);

                try {
                    FileWriter myWriter = new FileWriter("formimage.txt", true);
                    myWriter.write(result);
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException ex) {
                    System.out.println("An error occurred.");
                    ex.printStackTrace();
                }


            }
        });

        browseImageButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser browseimage = new JFileChooser();
                int open = browseimage.showOpenDialog(null);

                if (open == JFileChooser.APPROVE_OPTION){
                    File selectedImage = browseimage.getSelectedFile();
                    String selectedImagePath = selectedImage.getAbsolutePath();

                    namaFileGambar = browseimage.getSelectedFile().getName();

                    ImageIcon yana = new ImageIcon(selectedImagePath);
                    Image image = yana.getImage().getScaledInstance(imageimage.getWidth(), imageimage.getHeight(),Image.SCALE_SMOOTH);

                    imageimage.setIcon(new ImageIcon(image));



                }
            }
        });
    }


    public JPanel getRootP() {
        return rootP;
    }
}


