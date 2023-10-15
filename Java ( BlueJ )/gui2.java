import javax.swing.*;
import java.awt.*;

public class gui2
{
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        JPanel panel0=new JPanel();
        JPanel panel1=new JPanel();
        JLabel label=new JLabel();
        ImageIcon image=new ImageIcon("D:\\BlueJ\\icons\\java.png");
        
        //properties of label
        label.setText("java");
        label.setIcon(image);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setVerticalAlignment(JLabel.BOTTOM);
        
        //properties of panel0
        panel0.setBackground(new Color(250,100,125));
        panel0.setOpaque(true);
        panel0.setBounds(0,0,500,500);
        
        //properties of panel1
        panel1.setBackground(new Color(200,0,100));
        panel1.setOpaque(true);
        panel1.setBounds(500,0,500,500);
        
        //properties of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1366,768);
        frame.setLayout(null);
        frame.setVisible(true);
        //ImageIcon image=new ImageIcon("D:\\BlueJ\\icons\\java.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(150,100,150));
        
        panel0.add(label);
        frame.add(panel0);
        frame.add(panel1);
        
    }
}