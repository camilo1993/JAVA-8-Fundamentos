
import java.awt.*;
import javax.swing.*;


public class Applet_Multimedia extends JApplet {
    
    public void init(){
        
        
        
        logo = getImage (getDocumentBase(),"fallout.jpg");
        
        
        
        
    }
    public void paint (Graphics g){
        
        
        g.drawImage(logo, 50, 50, this);
        
        
    }
    Image logo;
}
