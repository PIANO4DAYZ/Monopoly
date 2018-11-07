import javax.swing.JFrame;
import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

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
        
        new Thread(graph).start();
    }

}
