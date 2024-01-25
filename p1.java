/*
    <html>
        <applet code = p1 width = 500 height = 500></applet>
    </html>
*/

import java.applet.*;
import java.awt.*;

public class p1 extends Applet {
    
        public void paint(Graphics e) {
            e.setColor(Color.red);
            e.drawArc(10,10,400,400,0,90);
            e.setColor(Color.blue);
            e.drawArc(10,10,400,400,90,90);
            e.setColor(Color.green);
            e.drawArc(10,10,400,400,180,90);
            e.setColor(Color.magenta);
            e.drawArc(10,10,400,400,270,90);
        }
}