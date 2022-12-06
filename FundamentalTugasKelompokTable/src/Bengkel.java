import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class Bengkel {
    private JTextField textNama;
    private JComboBox comboService;
    private JComboBox comboMekanik;
    private JComboBox comboTanggalmasuk;
    private JComboBox comboBulanmasuk;
    private JComboBox comboTanggalkeluar;
    private JComboBox comboBulankeluar;
    private JButton simpanButton;
    private JTable tableOutput;
    private JLabel Jumlah;
    private JPanel rootPanel;
    private JComboBox comboKeterangan;
    private JComboBox comboTahunmasuk;
    private JComboBox comboTahunkeluar;
    private JLabel totalmasuk;

    private DefaultTableModel tableModel;


    private Bengkel1 obj;

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public Bengkel() {
        this.obj = new Bengkel1();
        this.initComponents();
        simpanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String getTextNama = textNama.getText();
                String getcomboService = comboService.getSelectedItem().toString();
                String getcomboMekanik = comboMekanik.getSelectedItem().toString();
                String tanggalmasuk = comboTanggalmasuk.getSelectedItem().toString()+"/"+comboBulanmasuk.getSelectedItem().toString()+"/"+comboTahunmasuk.getSelectedItem().toString();
                String getcomboTanggalmasuk = comboTanggalmasuk.getSelectedItem().toString();
                String getcomboBulanmasuk = comboBulanmasuk.getSelectedItem().toString();
                String getcomboTahunmasuk = comboTahunmasuk.getSelectedItem().toString();
                String tanggalkeluar = comboTanggalkeluar.getSelectedItem().toString()+"/"+comboBulankeluar.getSelectedItem().toString()+"/"+comboTahunkeluar.getSelectedItem().toString();
                String getcomboTanggalkeluar = comboTanggalkeluar.getSelectedItem().toString();
                String getcomboBulankeluar = comboBulankeluar.getSelectedItem().toString();
                String getcomboTahunkeluar = comboTahunkeluar.getSelectedItem().toString();

                obj.setNamaPelanggan(textNama.getText());
                obj.setJenisService(comboService.getSelectedItem().toString());
                obj.setMekanik(comboMekanik.getSelectedItem().toString());
                obj.setTanggalMasuk(tanggalmasuk);
                obj.setTanggalKeluar(tanggalkeluar);
                obj.setKeterangan(comboKeterangan.getSelectedItem().toString());

                tableModel.addRow(new Object[]{obj.getNamaPelanggan(), obj.getJenisService(), obj.getMekanik(), obj.getTanggalMasuk(), obj.getTanggalKeluar(),obj.getKeterangan()});

                String result = "\n\nNama Pelanggan : "+obj.getNamaPelanggan()+"\nJenis Service : "+obj.getJenisService()+"\nMekanik : "+obj.getJenisService()+"\nTanggal Masuk : "+obj.getTanggalMasuk()+"\nTanggal Keluar : "+obj.getTanggalKeluar()+"\nKeterangan : "+obj.getKeterangan();
                try {
                    FileWriter myWriter = new FileWriter("bengkel.txt", true);
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

    private void initComponents() {

        Object[] tableColumn = {"Nama Pelanggan", "Jenis Service", "Mekanik", "Tanggal Masuk", "Tanggal Keluar", "Keterangan"};
        Object[][] tableColumn2 = {{}};
        tableModel = new DefaultTableModel(tableColumn2, tableColumn);
        tableOutput.setModel(tableModel);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}

