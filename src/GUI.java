import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.*;
import javax.print.attribute.standard.PageRanges;
public class GUI extends DogFood{
    public GUI(String brand, int quantity,String name,int age) {
        super(brand,quantity,name,age);
        JFrame frame = new JFrame();
        JButton button,Confirm,back;
        Confirm = new JButton("Confirm");
        back = new JButton("back");
        java.net.URL pic = getClass().getResource("Dogg.jpg");
        ImageIcon imageicon = new ImageIcon(pic);
        JLabel image = new JLabel(imageicon);
        frame.add(image,BorderLayout.WEST);

        ImageIcon realbackground = new ImageIcon("C:/Users/Dell/Desktop/52D86803-095D-4938-A6CF-C222FE55FC0A.jpg");
        JLabel background = new JLabel(realbackground);
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panelmain = new JPanel();
        panel.setLayout(new GridLayout(0,1));
        JLabel label = new JLabel("   Name", SwingConstants.LEFT);
        label.setPreferredSize(new Dimension(50,30));
        label.setForeground(Color.BLACK);
 
        JLabel labelback = new JLabel();
        labelback.setPreferredSize(new Dimension(50,30));
        labelback.setForeground(Color.BLACK);
        panel1.add(labelback);  

        JTextField text = new JTextField("", 8);
        panel.add(label);
        panel.add(text);
        CardLayout c1 = new CardLayout();
        panelmain.setLayout(c1);
        Confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                c1.show(panelmain, "2");
                
            }
        });
        back.addActionListener(new ActionListener() {
        @Override   
        public void actionPerformed(ActionEvent e){
                c1.show(panelmain,"1");
              
            
            }
    });
    
        text.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
               String name = text.getText();
               text.setName(name);
               text.setText("");
               labelback.setText(text.getName());    
        }
    });
        panel.add(text);


        JLabel label1 = new JLabel("   Age", SwingConstants.LEFT);
        label1.setPreferredSize(new Dimension(50,30));
        label1.setForeground(Color.BLACK);

        JLabel labelback1 = new JLabel();
        JTextField text1 = new JTextField("", 8);
        text1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
               String name = text1.getText();
               text1.setName(name);
               text1.setText("");
               labelback1.setText(text1.getName());    
        }
    });
        panel1.add(text1);
        panel.add(label1);
        panel.add(text1);
       
        JLabel label3 = new JLabel("Test");
        panel1.add(label3);
       
       
        JLabel label2 = new JLabel("   Spoon", SwingConstants.LEFT);
        label2.setPreferredSize(new Dimension(50,30));
        label2.setForeground(Color.BLACK);

        JLabel labalback2 = new JLabel();
        JTextField text2 = new JTextField("", 8);
        text2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String name = text2.getText();
                text2.setName(name);
                text2.setText("");
                labalback2.setText(text2.getName());
                panel1.add(labalback2);
                
                
        
            }
            
            
        });
        panel.add(label2);
        panel.add(text2);
       
        
         ImageIcon icon = new ImageIcon("C:/Users/Dell/Desktop/52D86803-095D-4938-A6CF-C222FE55FC0A.jpg");



    // Create label with image
    JLabel labell = new JLabel();
    panel1.add(back,BorderLayout.SOUTH);
    panel1.add(labelback);
    panel1.add(labelback1);
    panel.add(Confirm,BorderLayout.SOUTH);
    panel.setBackground(Color.PINK);
    panel1.setBackground(Color.PINK);
    panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    panelmain.add(panel,"1");
    panelmain.add(panel1,"2");
    labell.setIcon(icon);
        frame.setSize(500,400);
        panel.add(labell);
        frame.add(panelmain);
        c1.show(panelmain, "1");
        frame.setLocation(500, 50);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        labell.setIcon(icon);
        
    }
    public static void main(String[] args){
        new GUI(null, 0, null, 0);

}
}
