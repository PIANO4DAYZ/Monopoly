
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MonopolyMouseAdapter extends MouseAdapter {
    
    public static monopoly toAlert;
    
    @Override
    public void mousePressed(MouseEvent e) {
        toAlert.pressed(e.getPoint());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
       toAlert.released(e.getPoint());
    }
}
