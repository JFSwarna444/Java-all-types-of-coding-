import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUIOnline implements ActionListener {
    JButton flip, rotate;
    JTextField text;

    public GUIOnline() {
        JFrame frame = new JFrame("EditMe");
        JPanel panel = new JPanel();
        frame.setSize(280, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        text = new JTextField(10);
        text.setText(">");
        flip = new JButton("Flip");
        panel.add(flip);
        panel.add(text);
        frame.add(panel, BorderLayout.CENTER);

        flip.addActionListener(this);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //Write your code here

       // text.setText("<");

        this.text.setText(this.text.getText().equals(">")?"<":">");
        }


    public static void main(String[] args){
        new GUIOnline();
    }
}