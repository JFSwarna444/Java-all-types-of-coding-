import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class imageviewer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("image viewer");
        frame.setSize(512,512);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // frame.setLayout(null);

        try{
            BufferedImage brImage = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\Advanced OOP Lab\\src\\image\\paint.png"));
            Image sampleimage = brImage.getScaledInstance(256,256,Image.SCALE_SMOOTH);

            JLabel imagelabel = new JLabel(new ImageIcon(sampleimage));
            imagelabel.setBounds(128,128,256,256);
            frame.add(imagelabel);


            BufferedImage image = ImageIO.read(new File("C:\\Users\\USER\\IdeaProjects\\Advanced OOP Lab\\src\\image2\\paint2.png"));
            Image images= image.getScaledInstance(200,150,Image.SCALE_SMOOTH);

            JLabel s = new JLabel(new ImageIcon(images));
            s.setBounds(300,300,900,256);
            frame.add(s);

        }
        catch (IOException e){
            e.printStackTrace();
        }
        frame.setVisible(true);
    }
}
