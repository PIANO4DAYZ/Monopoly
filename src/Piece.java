
import java.awt.image.BufferedImage;

public class Piece {
    private BufferedImage image = null;
    private int place = -1;
    int timesJ;
    public Piece(int place, BufferedImage image) {
        this.place = place;
        this.image = image;
        timesJ = 0;
    }
    
    public Piece(int place) {
        this(place, null);
    }
    
    public Piece(BufferedImage image) {
        this(-1, image);
    }
    
    public Piece() {
        this(-1, null);
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public int getPlace() {
        return place;
    }
    public void addJail() {
    
        timesJ++;
        
    }
    public int getJail() {
    
        return timesJ;
        
    }
}
