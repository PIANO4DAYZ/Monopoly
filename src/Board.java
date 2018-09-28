import java.util.*;
import java.io.*;
import java.io.*;
import java.util.*;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class Board extends JPanel{
  public static void main(String[] args) throws FileNotFoundException{
    
      ArrayList<String> board = new ArrayList <>();
    Scanner b = new Scanner(new File("src/b.txt"));
            
    while(b.hasNext())
       board.add(b.nextLine());
    }
}
