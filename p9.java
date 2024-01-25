/*
    <html>
        <applet code = p9 width = 500 height = 300></applet>
    </html>
*/

import java.applet.*;
import java.awt.*;

public class p9 extends Applet {
    
        public void paint(Graphics e) {
            
            e.setColor(Color.red);
            e.fillRect(0,0,500,300);
            e.setColor(Color.blue);
            e.fillArc(150,50,200,200,0,360);

        }
}