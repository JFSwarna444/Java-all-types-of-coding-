

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLOutput;

public class EventTest implements ActionListener {
    JButton b1;
    JButton b2;
    JButton b3;
    JTextField t1;
    EventTest(){
        JFrame jf=new JFrame("grid Layout");
        jf.getContentPane().setBackground(Color.RED);
        jf.setSize(500,200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());

        b1=new JButton("UP");
        b1.setBackground(Color.YELLOW);
        b1.setForeground(Color.BLUE);
        b2=new JButton("Down");
        b2.setBackground(Color.green);
        b2.setForeground(Color.BLACK);
        b3=new JButton("Clear");
        b3.setBackground(Color.GRAY);
        b3.setForeground(Color.MAGENTA);
        t1=new JTextField(10);
    t1.setBackground(Color.MAGENTA);
        t1.setText("0");

        jf.add(b1); jf.add(b2);jf.add(b3);jf.add(t1);

        b1.addActionListener(new ActionListener(){  //anonymous inner class
            public void actionPerformed(ActionEvent e) {
                String s=t1.getText();
                int num=Integer.parseInt(s);
                num+=1;
                if(num<=20){
                    t1.setText(String.valueOf(num));
                }
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                int num=Integer.parseInt(t1.getText());
                num--;
                if(num>=0){
                    t1.setText(String.valueOf(num));
                }
            }
        });
        //b1.addActionListener(this);
        //b2.addActionListener(this);
        b3.addActionListener(this);

        jf.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            int num=Integer.parseInt(t1.getText());
            num++;
            if(num<=20){
                t1.setText(String.valueOf(num));
            }
        }
        else if(e.getSource()==b2){
            int num=Integer.parseInt(t1.getText());
            num--;
            if(num>=0){
                t1.setText(String.valueOf(num));
            }

        }
        else{
            t1.setText("0");
        }
    }
    public static void main(String args[]){
        new EventTest();
    }
}
