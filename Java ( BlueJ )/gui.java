import javax.swing.*;
import java.awt.*;

public class gui {
    public static void main(String[] args)
    {
        JFrame frame=new JFrame();
        
        JLabel label=new JLabel();
        
        ImageIcon icon2=new ImageIcon("D:\\BlueJ\\icons\\java.png");
        
        label.setIcon(icon2);
        
        label.setHorizontalTextPosition(JLabel.CENTER);
        
        label.setForeground(new Color(255,0,10));
        
        label.setText("java");
        
        label.setFont(new Font("MV Boli",Font.PLAIN,25));
        
        label.setBackground(new Color(200,100,150));
        
        label.setOpaque(true);
        
        label.setVerticalAlignment(JLabel.CENTER);
        
        label.setHorizontalAlignment(JLabel.CENTER);
        
        label.setBounds(100,100,2160,1140);
        
        
        
        frame.setTitle("JFrame");
        
        frame.setSize(2160,1140);
        
        frame.add(label);
        
        frame.setVisible(true);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ImageIcon icon=new ImageIcon("D:\\BlueJ\\icons\\java.png");
        
        frame.setIconImage(icon.getImage());
        
    }
    
}
