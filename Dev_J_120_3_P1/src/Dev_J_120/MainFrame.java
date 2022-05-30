
package Dev_J_120;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class MainFrame extends JFrame {
    
    Components myComponents = new Components();
    public void init(){
        setTitle("My calculator");
        getContentPane().setBackground(Color.BLACK); 
        setSize(500, 600);
        setLocation(200, 100);
        add(myComponents.display(),BorderLayout.NORTH);
        add(myComponents.buttons(),BorderLayout.CENTER);
        add(myComponents.equalButton(), BorderLayout.SOUTH);         
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);         
    }   
}