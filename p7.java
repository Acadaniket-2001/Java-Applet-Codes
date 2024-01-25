/*
    <html><applet code = p7 width = 300 height = 300></applet></html>
*/

import java.awt.*;
import java.applet.*;

public class p7 extends Applet {
    public void paint(Graphics e) {
        e.fillArc(0,0,300,300,0,360);
        e.setColor(Color.white);
        e.fillArc(75,75,150,150,0,360);
    }
}
