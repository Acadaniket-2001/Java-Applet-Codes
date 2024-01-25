/*
    <html>
        <applet code = p19 width = 172 height = 200></applet>
    </html>
*/

import java.applet.*;
import java.awt.*;

public class p19 extends Applet {
    
    int tx[] = {0, 86, 86};
    int ty[] = {50, 50, 150};

    int tx1[] = {0,86,86};
    int ty1[] = {50, 0, 100};
    
    int tx3[] = {0,86,86};
    int ty3[] = {150, 100, 200};

    int tx4[] = {86,86*2,86};
    int ty4[] = {100, 50, 0};

    int tx6[] = {86, 86*2, 86};
    int ty6[] = {200, 150, 100};

    int tx9[] = {86, 172, 172};
    int ty9[] = {150, 50, 150};

    public void paint(Graphics e) {
                    
        e.setColor(Color.red);
        e.fillPolygon(tx1, ty1, 3);

        e.setColor(Color.yellow);
        e.fillPolygon(tx3, ty3, 3);

        e.setColor(Color.yellow);
        e.fillPolygon(tx4, ty4, 3);

        e.setColor(Color.red);
        e.fillPolygon(tx6, ty6, 3);

        e.setColor(Color.green);
        e.fillRect(0, 50, 172, 100);
        
        e.setColor(Color.blue);
        e.fillPolygon(tx, ty, 3);
        e.fillPolygon(tx9, ty9, 3);
    }

}