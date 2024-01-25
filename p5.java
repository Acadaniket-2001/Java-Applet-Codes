/*
    <html>
        <applet code = p5 width = 500 height = 500></applet>
    </html>
*/

import java.applet.*;
import java.awt.*;

public class p5 extends Applet {
    
        public void paint(Graphics e) {
            
            e.setColor(Color.gray);
            e.fillArc(100,100,300,300,45, 270);
        }
}