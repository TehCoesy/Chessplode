package Core;

import java.awt.*;

public class Game extends MyCanvas {
    @Override
    protected void renderElements(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(10,10,100,100);
    }
}
