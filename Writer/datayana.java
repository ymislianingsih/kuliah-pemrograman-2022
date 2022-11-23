import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class datayana {
    private JTextField textNama;
    private JTextField textNim;
    private JTextField textProdi;
    private JButton buttonSave;
    private JPanel rootP;

    public datayana() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textNama.getText();
                String nim = textNim.getText();
                String prodi = textProdi.getText();

                String result = "Nama ="+nama+" \nNim ="+nim+" \nProdi ="+prodi;

                try {
                    FileWriter myWriter = new FileWriter("datayana.txt", true);
                    myWriter.write(result);
                    myWriter.close();
                    System.out.println("Successfully wrote to the file.");
                } catch (IOException ex) {
                    System.out.println("An error occurred.");
                    ex.printStackTrace();
                }
            }
        });
    }

    public JPanel getRootP() {
        return rootP;
    }
}
