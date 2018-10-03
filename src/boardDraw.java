import javax.swing.JFrame;
import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;

public class boardDraw extends JFrame {

    public static final int WIDTH = 1320;
    public static final int HEIGHT = 1020;

    public static void main(String[] args) throws FileNotFoundException {
        new boardDraw(); 
    }

    public boardDraw() throws FileNotFoundException {
        super("game");

        setSize(WIDTH, HEIGHT);

        monopoly graph = new monopoly(new File("src/board.txt"));
        
        ((Component) graph).setFocusable(true);
        MonopolyMouseAdapter.toAlert = graph;
        getContentPane().add(graph);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        new Thread(graph).start();
    }

}
