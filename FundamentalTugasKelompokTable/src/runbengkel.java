import javax.swing.*;

public class runbengkel{
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Bengkel");
        jFrame.setContentPane(new Bengkel().getRootPanel());
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(500,400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
}