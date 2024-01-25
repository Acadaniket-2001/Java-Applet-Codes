/*
    <html>
        <applet code = p13 width = 500 height = 300></applet>
    </html>
*/

import java.applet.*;
import java.awt.*;

public class p13 extends Applet {
    
        public void paint(Graphics e) {
            
            e.setColor(Color.red);
            e.fillRect(0,150,500,300/2);
            
            e.setColor(Color.green);
            e.fillArc(150,50,200,200,0,360);
            
            e.setColor(new Color(0, 100, 0));
            e.fillArc(250-60,150+60,20,20,0,360);
            
        }
}