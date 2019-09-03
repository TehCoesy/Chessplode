package Container;

import javax.swing.*;
import java.awt.*;

public class ContainerPanel extends JPanel {
    //Elements

    public ContainerPanel() {
        setLayout(new BorderLayout());
        setVisible(true);
        setPreferredSize(new Dimension(400,400));
        setFocusable(true);
    }

    public void tick() {

    }

    public void updateElements() {

    }
}
