
import java.awt.image.BufferedImage;


public class Piece {
    boolean took = false;
    BufferedImage x = null;
    public Piece(BufferedImage n) {
    
    took = false;
    x = n;
        
    }
    public void took() {
    
    took = true;
    
    }
    
    
}
