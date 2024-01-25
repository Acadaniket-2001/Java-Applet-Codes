/*
    <html>
        <applet code = p3 height = 400 width = 550></applet>
    </html>
*/

import java.applet.*;
import java.awt.*;

public class p3 extends Applet {
    public void paint(Graphics g) {
        
        g.setColor(Color.blue);
        g.drawOval(100, 100, 100, 100);

        g.setColor(Color.yellow);
        g.drawOval(160, 160, 100, 100);

        g.setColor(Color.black);
        g.drawOval(220, 100, 100, 100);

        g.setColor(Color.green);
        g.drawOval(280, 160, 100, 100);

        g.setColor(Color.red);
        g.drawOval(340, 100, 100, 100);
    }
}
