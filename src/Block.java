
import java.awt.Rectangle;
import java.util.ArrayList;

/**
 * Blocked
 *
 * @author Brig-H-town LOOOOOOOOOOOOOOOO
 */
public class Block {

    private Rectangle bounds;
    public final int place;
    private ArrayList<Piece> pices;

    public Block(Rectangle bounds, int place) {
        this.bounds = bounds;
        this.place = place;
    }

}
