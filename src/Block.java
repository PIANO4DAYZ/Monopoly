
import java.awt.Rectangle;
import java.util.ArrayList;

/**
 * Blocked
 *
 * @author Brig-H-town LOOOOOOOOOOOOOOOO
 */
public class Block {

    private int x, y, width, height;
    public final int place;
    private ArrayList<Piece> pices;

    public Block(Rectangle bounds, int place) {
        x = bounds.x;
        y = bounds.y;
        width = bounds.width;
        height = bounds.height;
        this.place = place;
        this.pices = new ArrayList<>();
    }

    public Block(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.place = 0;
        this.pices = new ArrayList<>();
    
    }
    
    

}
