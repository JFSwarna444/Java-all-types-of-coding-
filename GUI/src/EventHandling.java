import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling implements ActionListener {
    JFrame jf;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JTextField tf;

    EventHandling() {
        jf = new JFrame("Design");
        jf.getContentPane().setBackground(Color.RED);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500,200);
        jf.setVisible(true);
        b1 = new JButton("click");
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.green);
        jf.add(b1, BorderLayout.NORTH);
        b2 = new JButton("up");
        b1.setBackground(Color.BLUE);
        b1.setForeground(Color.MAGENTA);
        jf.add(b2, BorderLayout.SOUTH);
        b3 = new JButton("down");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.GRAY);
        jf.add(b3, BorderLayout.EAST);
        b4 = new JButton("count");
       // b4.setBackground(Color.CYAN);
        //b4.setForeground(Color.YELLOW);
        jf.add(b4, BorderLayout.WEST);
        b5 = new JButton("exit");
        b5.setBackground(Color.DARK_GRAY);
        b5.setForeground(Color.LIGHT_GRAY);
        jf.add(b5, BorderLayout.CENTER);
        tf = new JTextField(10);
        tf.setBackground(Color.YELLOW);
        tf.setText("0");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = "click";
            }
        });
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = tf.getText();
                int a = Integer.parseInt(s);
                a++;
                if (a <= 20) {
                    tf.setText(String.valueOf(a));
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = tf.getText();
                int a = Integer.parseInt(s);
                a--;
                if (a >= 0) {
                    tf.setText(String.valueOf(a));
                }
            }
        });
        b4.addActionListener(this);
        b5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = "exit";
            }
        });
    }

    @Override
    // public void actionPerformed(ActionEvent e) {
//        if(e.getSource()==b1){
//            String s = "click";
//            }
//        }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            int num = Integer.parseInt(tf.getText());
            num++;
            if (num <= 20) {
                tf.setText(String.valueOf(num));
            }
        } else if (e.getSource() == b2) {
            int num = Integer.parseInt(tf.getText());
            num--;
            if (num >= 0) {
                tf.setText(String.valueOf(num));
            }

        } else {
            tf.setText("0");
        }
    }

    public static void main(String[] args) {
        new EventHandling();
    }
}