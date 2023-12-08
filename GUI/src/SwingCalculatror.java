import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class SwingCalculator implements ActionListener {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    JTextField tf;
    JFrame jf;
    String s1, s2, s3, s4, st;
    int n;

    SwingCalculator() {
        jf = new JFrame("Swing Calculator");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tf = new JTextField(16);

    }

    public void MarkFrame() {
        jf.add(tf, BorderLayout.NORTH);
        jf.setLayout(new FlowLayout());
        JPanel p = new JPanel();
        p.setLayout(new GridLayout(4, 4));

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");
        b10.setActionCommand("b10");
        b11 = new JButton("+");
        b11.setActionCommand("b11");
        b12 = new JButton("-");
        b12.setActionCommand("b12");
        b13 = new JButton("*");
        b13.setActionCommand("b13");
        b14 = new JButton("/");
        b14.setActionCommand("b14");
        b15 = new JButton("=");
        b15.setActionCommand("b15");
        b16 = new JButton("C");
        b16.setActionCommand("b16");


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);

        b1.setBackground(Color.WHITE);
        b2.setBackground(Color.WHITE);
        b3.setBackground(Color.WHITE);
        b4.setBackground(Color.WHITE);
        b5.setBackground(Color.WHITE);
        b6.setBackground(Color.WHITE);
        b7.setBackground(Color.WHITE);
        b8.setBackground(Color.WHITE);
        b9.setBackground(Color.WHITE);
        b10.setBackground(Color.WHITE);
        b11.setBackground(Color.WHITE);
        b12.setBackground(Color.WHITE);
        b13.setBackground(Color.WHITE);
        b14.setBackground(Color.WHITE);
        b15.setBackground(Color.WHITE);
        b16.setBackground(Color.WHITE);

        b1.setForeground(Color.BLACK);
        b2.setForeground(Color.BLACK);
        b3.setForeground(Color.BLACK);
        b4.setForeground(Color.BLACK);
        b5.setForeground(Color.BLACK);
        b6.setForeground(Color.BLACK);
        b7.setForeground(Color.BLACK);
        b8.setForeground(Color.BLACK);
        b9.setForeground(Color.BLACK);
        b10.setForeground(Color.BLACK);
        b11.setForeground(Color.BLACK);
        b12.setForeground(Color.BLACK);
        b13.setForeground(Color.BLACK);
        b14.setForeground(Color.BLACK);
        b15.setForeground(Color.BLACK);
        b16.setForeground(Color.BLACK);

        p.setBackground(Color.cyan);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b11);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b12);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b13);
        p.add(b16);
        p.add(b10);
        p.add(b15);
        p.add(b14);

        jf.add(p);
        jf.setSize(200, 175);
        jf.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "b11") {
            s3 = tf.getText();
            tf.setText("");
            n = 1;
        }
        if (e.getActionCommand() == "b12") {
            s3 = tf.getText();
            tf.setText("");
            n = 2;
        }

        if (e.getActionCommand() == "b13") {
            s3 = tf.getText();
            tf.setText("");
            n = 3;
        }
        if (e.getActionCommand() == "b14") {
            s3 = tf.getText();
            tf.setText("");
            n = 4;
        }
        if (e.getSource() == b1) {
            s1 = tf.getText();
            s2 = "1";
            st = s1 + s2;
            tf.setText(st);
        }
        if (e.getSource() == b2) {
            s1 = tf.getText();
            s2 = "2";
            st = s1 + s2;
            tf.setText(st);
        }

        if (e.getSource() == b3) {
            s1 = tf.getText();
            s2 = "3";
            st = s1 + s2;
            tf.setText(st);
        }
        if (e.getSource() == b4) {
            s1 = tf.getText();
            s2 = "4";
            st = s1 + s2;
            tf.setText(st);
        }
        if (e.getSource() == b5) {
            s1 = tf.getText();
            s2 = "5";
            st = s1 + s2;
            tf.setText(st);
        }
        if (e.getSource() == b6) {
            s1 = tf.getText();
            s2 = "6";
            st = s1 + s2;
            tf.setText(st);
        }
        if (e.getSource() == b7) {
            s1 = tf.getText();
            s2 = "7";
            st = s1 + s2;
            tf.setText(st);
        }
        if (e.getSource() == b8) {
            s1 = tf.getText();
            s2 = "8";
            st = s1 + s2;
            tf.setText(st);
        }
        if (e.getSource() == b9) {
            s1 = tf.getText();
            s2 = "9";
            st = s1 + s2;
            tf.setText(st);
        }
        if (e.getSource() == b10) {
            s1 = tf.getText();
            s2 = "0";
            st = s1 + s2;
            tf.setText(st);
        }
        if (e.getActionCommand() == "b15") {
            s4 = tf.getText();
            if (n == 1) {
                n = Integer.parseInt(s3) + Integer.parseInt(s4);
                tf.setText(s3 + "+" + s4 + "=" + String.valueOf(n));
            } else if (n == 2) {
                n = Integer.parseInt(s3) - Integer.parseInt(s4);
                tf.setText(s3 + "-" + s4 + "=" + String.valueOf(n));
            } else if (n == 3) {
                n = Integer.parseInt(s3) * Integer.parseInt(s4);
                tf.setText(s3 + "*" + s4 + "=" + String.valueOf(n));
            }


        } else if (n == 4) {
            Double n = Integer.parseInt(s4) / Double.parseDouble(s3);
            tf.setText(s3 + "/" + s4 + "=" + String.valueOf(n));
        }
        if (n == 4) {
            try {
                n = Integer.parseInt(s4);
                if (n != 0) {
                    Double n = Integer.parseInt(s3) / Double.parseDouble(s4);
                    tf.setText(s3 + "/" + s4 + "=" + String.valueOf(n));
                } else {
                    tf.setText("Can't divide by 0");
                }

            } catch (Exception r) {
                r.getStackTrace();
            }
        }
        if (e.getActionCommand() == "b16") {
            tf.setText("");
        }
    }

    public static void main(String[] args) {
        SwingCalculator sc1 = new SwingCalculator();
        sc1.MarkFrame();
    }

}