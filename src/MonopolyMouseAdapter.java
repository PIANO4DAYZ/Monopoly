
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MonopolyMouseAdapter extends MouseAdapter {
    
    public static monopoly toAlert;

    @Override
    public void mouseClicked(MouseEvent e) {
    
    System.out.println("Yikes");
    toAlert.clicked(e.getPoint());
    } 

    @Override
    public void mousePressed(MouseEvent e) {
        super.mousePressed(e); //To change body of generated methods, choose Tools | Templates.
    }
    
}
