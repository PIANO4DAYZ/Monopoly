import java.util.*;
import java.io.*;
import javax.swing.JPanel;

public class Board extends JPanel{
  public static void main(String[] args) throws FileNotFoundException{
    
      ArrayList<String> board = new ArrayList <>();
    Scanner b = new Scanner(new File("src/b.txt"));
            
    while(b.hasNext())
       board.add(b.nextLine());
    }
}
