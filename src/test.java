import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.DimensionUIResource;

public class test {
  public static void main(String[] args) {
    JPanel panel = new JPanel();
    JButton b = new JButton("Test");
    b.setSize(new DimensionUIResource(100, 100));
    panel.add(b);
    
    
    ImageIcon icon = new ImageIcon("C:/Users/Dell/Desktop/52D86803-095D-4938-A6CF-C222FE55FC0A.jpg");

    
    JLabel label = new JLabel();
    label.setIcon(icon);

    
    JFrame frame = new JFrame();
    
    frame.add(panel);
    frame.add(label);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
