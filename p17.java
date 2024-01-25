/*
    <html>
        <applet code = p17 height = 400 width = 400></applet>
    </html>
*/

import java.awt.*;
import java.applet.*;

public class p17 extends Applet {
    
    int x[] = {200, 0, 200, 400};
    int y[] = {0, 200, 400, 200};
    public void paint(Graphics e) {

        e.setColor(Color.red);
        e.fillPolygon(x, y, 4);

        e.setColor(Color.blue);
        e.fillRoundRect(100, 100, 200, 200, 50, 50);

        e.setColor(Color.black);
        e.fillArc(170, 170, 60, 60, 0, 360);


    }
}