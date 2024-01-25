/*
    <html>
        <applet code = p11 width = 500 height = 250></applet>
    </html>
*/

import java.applet.*;
import java.awt.*;

public class p11 extends Applet {
    
        public void paint(Graphics e) {
            
            e.setColor(Color.red);
            e.fillArc(0,0,500,500,0,180);
            
            e.setColor(Color.orange);
            e.fillArc(20,20,460,460,0,180);
            
            e.setColor(Color.yellow);
            e.fillArc(40,40,420,420,0,180);
            
            e.setColor(Color.green);
            e.fillArc(60,60,500 - 2*60,500 - 2*60,0,180);
            
            e.setColor(Color.blue);
            e.fillArc(80,80,500 - 160,500 - 160,0,180);
            
            e.setColor(new Color(75, 0, 130));
            e.fillArc(100,100,500 - 200,500 - 200,0,180);
            
            e.setColor(new Color(238, 130, 238));
            e.fillArc(120,120,500 - 240,500 - 240,0,180);
            
            e.setColor(new Color(255, 255, 255));
            e.fillArc(140,140,500 - 280,500 - 280,0,180);
            
        }
}