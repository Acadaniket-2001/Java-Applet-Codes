/*
    <html>
        <applet code = p15 width = 172 height = 200></applet>
    </html>
*/

import java.applet.*;
import java.awt.*;

public class p15 extends Applet {
    
    int tx1[] = {0,86,86};
    int ty1[] = {50, 0, 100};
    
    int tx2[] = {0,0,86};
    int ty2[] = {150, 50, 100};
    
    int tx3[] = {0,86,86};
    int ty3[] = {150, 100, 200};
    
    int tx4[] = {86,86*2,86};
    int ty4[] = {100, 50, 0};
    
    int tx5[] = {86, 86*2, 86*2};
    int ty5[] = {100, 50, 150};
    
    int tx6[] = {86, 86*2, 86};
    int ty6[] = {200, 150, 100};
    
        public void paint(Graphics e) {
            
            e.setColor(Color.red);
            e.fillPolygon(tx1, ty1, 3);
            
            e.setColor(Color.green);
            e.fillPolygon(tx2, ty2, 3);
            
            e.setColor(Color.yellow);
            e.fillPolygon(tx3, ty3, 3);

            e.setColor(Color.yellow);
            e.fillPolygon(tx4, ty4, 3);

            e.setColor(Color.green);
            e.fillPolygon(tx5, ty5, 3);

            e.setColor(Color.blue);
            e.fillPolygon(tx6, ty6, 3);

        }
}