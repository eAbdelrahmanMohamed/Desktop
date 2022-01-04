import java.applet.*;
import java.awt.*;

public class applet extends Applet {
    public void paint(Graphics g){
        g.drawString("hello from applet",
                50,
                100);
    }
}
