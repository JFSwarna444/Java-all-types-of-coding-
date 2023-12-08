import javax.swing.*;
import java.awt.*;

public class NoLayoutTest {
    public static void main(String[] args) {
        JFrame jf=new JFrame("First GUI");
        jf.getContentPane().setBackground( Color.blue );   //whole jframe full color

        jf.setSize(600,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);
        JButton b=new JButton("click");
        //JButton b1=new JButton("close");
        b.setBackground(Color.RED);
        b.setForeground(Color.green);
        b.setBounds(30,60,100,90);
       // b1.setBounds(40,70,80,90);
        jf.add(b);
        //jf.add(b1);
        JTextField tf=new JTextField("GuiTest");
        tf.setBackground(Color.YELLOW);
        tf.setBounds(200,300,500,200);
        jf.add(tf);
    }
}
