import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guitest {
    static  int count=0;
    public static void main(String[] args) {

        JFrame frame = new JFrame("MY APP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel1 = new JPanel();
        frame.add(panel1);
        JButton button1 = new JButton("Click");
        JButton button2 = new JButton("OK");
        panel1.add(button1);
        panel1.add(button2);
//        frame.add(button1);
//        frame.add(button2);

        frame.setSize(500,500);
        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                String text = "clciked" + count + "times";
                button1.setText(text);
            }
        });
    }
}
