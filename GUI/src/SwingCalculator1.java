import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class SwingCalculator1 implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    JTextField tf;
    JFrame jf;
    JPanel p;
    String s1,s2,s3,s4,s5;
    int n;
    int res,a,b;
   SwingCalculator1(){
        jf=new JFrame("Swing Calculator");
        jf.setSize(200,230);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // tf.setText("0");
       p=new JPanel();
        tf=new JTextField(16);
        jf.setVisible(true);
        b1=new JButton("1");
       // b1.setActionCommand("b1");
       b2=new JButton("2");
       //b2.setActionCommand("b2");
       b3=new JButton("3");
       //b3.setActionCommand("b3");
       b4=new JButton("4");
       //b4.setActionCommand("b4");
       b5=new JButton("5");
       //b5.setActionCommand("b5");
       b6=new JButton("6");
       //b6.setActionCommand("b6");
       b7=new JButton("7");
       //b7.setActionCommand("b7");
       b8=new JButton("8");
       //b8.setActionCommand("b8");
        b9=new JButton("9");
       //b9.setActionCommand("b9");
       b10=new JButton("0");
       b10.setActionCommand("b10");
       b11=new JButton("+");
       b11.setActionCommand("b11");
       b12=new JButton("-");
       b12.setActionCommand("b12");
       b13=new JButton("*");
       b13.setActionCommand("b13");
       b14=new JButton("/");
       b14.setActionCommand("b14");
       b15=new JButton("=");
       b15.setActionCommand("b15");
       b16=new JButton("C");
       b16.setActionCommand("b16");

       jf.add(tf, BorderLayout.NORTH);
        p.setLayout(new GridLayout(4,4));
       jf.add(tf, BorderLayout.NORTH);
       p.add(b1);
       p.add(b2);
       p.add(b3);
       p.add(b4);
       p.add(b5);
       p.add(b6);
       p.add(b7);
       p.add(b8);
       p.add(b9);
       p.add(b10);
       p.add(b11);
       p.add(b12);
       p.add(b13);
       p.add(b14);
       p.add(b15);
       p.add(b16);
       jf.add(p);
       jf.setBackground(Color.CYAN);
       tf.setBackground(Color.WHITE);
       tf.setForeground(Color.BLACK);
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
    }
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("b1")) {
            tf.setText(tf.getText().concat("1"));
        }
        if (e.getActionCommand().equals("b2")) {
            tf.setText(tf.getText().concat("2"));
        }
        if (e.getActionCommand().equals("b3")) {
            tf.setText(tf.getText().concat("3"));
        }
        if (e.getActionCommand().equals("b4")) {
            tf.setText(tf.getText().concat("4"));
        }
        if (e.getActionCommand().equals("b5")) {
            tf.setText(tf.getText().concat("5"));
        }
        if (e.getActionCommand().equals("b6")) {
            tf.setText(tf.getText().concat("6"));
        }
        if (e.getActionCommand().equals("b7")) {
            tf.setText(tf.getText().concat("7"));
        }
        if (e.getActionCommand().equals("b8")) {
            tf.setText(tf.getText().concat("8"));
        }
        if (e.getActionCommand().equals("b9")) {
            tf.setText(tf.getText().concat("9"));
        }
        if (e.getActionCommand().equals("b10")) {
            tf.setText(tf.getText().concat("0"));
        }
        if (e.getActionCommand()==("b11")) {

//            String s1 = tf.getText();
//            a = Integer.parseInt(s1);
//            s1=a+"";
//            tf.setText(s1);
//            int n = 1;
           String s1 = tf.getText();
            tf.setText("");
            n = 1;
        }
        if (e.getActionCommand()==("b12")) {

//            String s1 = tf.getText();
//            a = Integer.parseInt(s1);
//            s1=a+"";
//            tf.setText(s1);
//            int n = 2;
            String s1 = tf.getText();
            tf.setText("");
            n = 2;
        }
        if (e.getActionCommand()==("b13")) {

//            String s1 = tf.getText();
//            a = Integer.parseInt(s1);
//            s1=a+"";
//            tf.setText(s1);
//            int n = 3;
            String s1 = tf.getText();
            tf.setText("");
            n = 3;
        }
        if (e.getActionCommand()==("b14")) {
//            String s1 = tf.getText();
//            a = Integer.parseInt(s1);
//            s1=a+"";
//            tf.setText(s1);
//            int n = 4;
            String s1 = tf.getText();
            tf.setText("");
            n = 4;
        }
//        if(e.getSource()==b1){
//            s1=tf.getText();
//            s2="1";
//            String str=s1+s2;
//            tf.setText(str);
//        }
       if(e.getSource()==b2){
            s1=tf.getText();
            s2="2";
            String str=s1+s2;
            tf.setText(str);
        }
//        if(e.getSource()==b3){
//            s1=tf.getText();
//            s2="3";
//            String str=s1+s2;
//            tf.setText(str);
//        }
//        if(e.getSource()==b4){
//            s1=tf.getText();
//            s2="4";
//            String str=s1+s2;
//            tf.setText(str);
//        }
//        if(e.getSource()==b5){
//            s1=tf.getText();
//            s2="5";
//            String str=s1+s2;
//            tf.setText(str);
//        }
//        if(e.getSource()==b6){
//            s1=tf.getText();
//            s2="6";
//            String str=s1+s2;
//            tf.setText(str);
//        }
        if(e.getSource()==b7){
            s1=tf.getText();
            s2="7";
            String str=s1+s2;
            tf.setText(str);
        }
        if(e.getSource()==b8){
            s1=tf.getText();
            s2="8";
            String str=s1+s2;
            tf.setText(str);
        }
        if(e.getSource()==b9){
            s1=tf.getText();
            s2="9";
            String str=s1+s2;
            tf.setText(str);
        }
        if (e.getActionCommand()==("b15")) {
//            String s1 = tf.getText();
//            b = Integer.parseInt(s1);
//            tf.setText(s1);
            String s5 = tf.getText();

            if (n == 1) {
                n = Integer.parseInt(s1) + Integer.parseInt(s2);
                tf.setText(s1 + "+" + s2 + "=" + String.valueOf(n));
            }  else if (n == 2) {
                n = Integer.parseInt(s1) - Integer.parseInt(s2);
                tf.setText(s1 + "-" + s2 + "=" + String.valueOf(n));
            }
             else if (n == 3) {
            n = Integer.parseInt(s1) * Integer.parseInt(s2);
            tf.setText(s1 + "*" + s2 + "=" + String.valueOf(n));
        }
            } else if (n == 4) {
            n = Integer.parseInt(s1) / Integer.parseInt(s2);
            tf.setText(s1 + "/" + s2 + "=" + String.valueOf(n));

            }
        if(n==4){
            try{
                n=Integer.parseInt(s3);
                if(n!=0){
                    n=Integer.parseInt(s3)/Integer.parseInt(s4);
                    tf.setText(s3+"/"+s4+"="+String.valueOf(n));
                }else{
                    tf.setText("infinity");
                }
            }catch (Exception r){
                r.getStackTrace();
            }
        }
        if(e.getActionCommand()=="b16"){
            tf.setText("");
        }
//            String s = res + "";
//            tf.setText(s);
//             s=tf.getText();
//             tf.setText("");
//            for(int i=0;i<s.length()-1;i++)
//            tf.setText(tf.getText()+s.charAt(i));
//       }
//        else{
//            tf.setText("0");
//        }
    }

    public static void main(String[] args) {
         SwingCalculator1 sc;
        sc = new SwingCalculator1();
    }
}


