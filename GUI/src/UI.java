import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame implements ActionListener {
    JToggleButton b;
    JTextField tf;
    private Container c;

    UI() {
        components();
    }

    private void components() {
        c=this.getContentPane();
        tf = new JTextField(15);
        tf.setBounds(150,10,200,50);
        b = new JToggleButton("toggle");
        b.setBounds(200,100,80,50);
        c.setLayout(null);
        c.add(b);
        c.add(tf);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s1=tf.getText();

                if(b.isSelected()){
                    tf.setText(s1.toUpperCase());  //Here the
                                        //String will be Uppercase
                }
                else{
                    tf.setText(s1.toLowerCase());  //here the
                                        //String will be lowercase
                }
            }
         });

        b.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            String s1=tf.getText();

            if(b.isSelected()){
                tf.setText(s1.toUpperCase());
            }
            else{
                tf.setText(s1.toLowerCase());
            }
        }
   }

    public static void main(String[] args) {
         UI jfr=new UI();
        jfr.setTitle("Design a UI");
        jfr.setSize(300, 300);
        jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfr.setBounds(350,350,500,300);
        jfr.setVisible(true);
    }
}


