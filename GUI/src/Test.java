import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TempConvert{

    JButton convertTemp;
    JTextField textBox1, textBox2;
    JLabel l1, l2;
    public TempConvert() {

        JFrame frame = new JFrame("Temperature Convert");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(280, 150);
        frame.setLocation(300, 200);

        l1=new JLabel("Enter Temperature in Fahrenheit:");
        textBox1 = new JTextField(10);
        textBox1.setText(" ");
        convertTemp = new JButton("Convert");
        l2= new JLabel("Temperature in celsius");
        textBox2 = new JTextField(10);
        textBox2.setText(" ");

        JPanel panel = new JPanel();
        panel.add(l1);
        panel.add(textBox1);
        panel.add(convertTemp);
        panel.add(l2);
        panel.add(textBox2);

        frame.add(panel, BorderLayout.CENTER);
        frame.setVisible(true);


    }

}
public class Test {
    public static void main(String[] args) {
        new TempConvert();
        double C , F=36.2;
        C= ( 5 * (F -32)) / 9;
        System.out.println(C);

    }
}
