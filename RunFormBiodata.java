package src.edu.yana.gui;

import javax.swing.*;

public class RunFormBiodata {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Form Biodata");
         jFrame.setContentPane(new FormBiodata().getRootP());
         jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         jFrame.setLocationRelativeTo(null);
         jFrame.setSize(500,400);
         jFrame.setVisible(true);
    }
}
