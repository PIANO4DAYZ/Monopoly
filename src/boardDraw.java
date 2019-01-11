import javax.swing.JFrame;
import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class boardDraw extends JFrame {

    public static final int WIDTH = 1320;
    public static final int HEIGHT = 1020;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        new boardDraw(); 
    }

    public boardDraw() throws FileNotFoundException, IOException {
        super("game");

        setSize(WIDTH, HEIGHT);

        monopoly graph = new monopoly();
        
        ((Component) graph).setFocusable(true);
        MonopolyMouseAdapter.toAlert = graph;
        getContentPane().add(graph);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        JPopupMenu pm = new JPopupMenu("lmao");
        JMenuItem iiii = new JMenuItem("Ben Shapiro destroys LIBTARDS with FACTS and LOGIC", new ImageIcon(monopoly.god));
        JFrame _this = this;
        iiii.setAction(new AbstractAction() {
            {
                putValue(SHORT_DESCRIPTION, "11 Tips to Destroy Your Opponents");
            }
            
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(_this, 
                        "You\'re not a liberal. Good job!", 
                        "Ben Shapiro congradulates you for being a good citizen", 
                        JOptionPane.ERROR_MESSAGE, new ImageIcon(monopoly.god));
            }
        });
        iiii.setText("Ben Shapiro destroys LIBTARDS with FACTS and LOGIC");
        iiii.setIcon(new ImageIcon(monopoly.god.getScaledInstance(15, 15, Image.SCALE_SMOOTH)));
        pm.add(iiii);
        
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                lmao(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                lmao(e);
            }
            
            private void lmao(MouseEvent e) {
                if(e.isPopupTrigger()) {
                    pm.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });
        
        new Thread(graph).start();
    }

}
