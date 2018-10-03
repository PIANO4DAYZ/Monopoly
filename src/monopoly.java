import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class monopoly extends JPanel implements Runnable {
            boolean boardOne = true;
            boolean cl = false;
            private Map<String, Integer> place;
            public monopoly(File f) throws FileNotFoundException {
            place = new TreeMap<>();
            Scanner scnr = new Scanner(f);
            while (scnr.hasNext()) {

            addWord(scnr.next());

            }

    }
     private void addWord(String w) {
        String whole = w.toLowerCase();

        if (place.containsKey(whole)) {
            place.put(whole, place.get(whole) + 1);
        } else {
            place.put(whole, 1);
        }

    }       
    public static void main(String[] args) throws FileNotFoundException, InterruptedException{
      

       /* int nop = 0;
        ArrayList<String> names = new ArrayList<>();
        Board board = new Board();
        Scanner p = new Scanner(System.in);
        
        ArrayList<String> retort = new ArrayList<String>();
            retort.add("OK! Next?");
            retort.add("Nice! Next one?");
            retort.add("OK, and the next one?");
            
        System.out.println("Hello! Welcome to Oligopoly! How many players do you have? Please pick fron 2-4 players.");
        
        String players = p.next();
        players = players.toUpperCase();
        int result = Integer.parseInt(players);
        if(result <= 1 || result >= 5) {
            System.out.println("Sorry, you must have at least 2 players, or less than 5 players");
            boolean pl = true;
        while(pl){
            if(result <= 1 || result >= 5){
            
            
            players = p.next();
                try {
                    result = Integer.parseInt(players);
                    if(result <= 1 || result >= 5)
                    System.out.println("Sorry, you must have at least 2 players, or less than 5 players");
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Sorry, not exactly a number...");
                }
            
        }else 
        pl = false;
            }
        
        }if(result == 2) 
            nop = 2;
        else if(result == 3) 
           nop = 3;
        else if(result == 4)
            nop = 4;
        
            System.out.println("Sounds good! What's your names?");
            for(int i = 0; i < nop; i++) {
            String holder = p.next();
            names.add(holder);
            if(i < (nop - 1)){
                int oof = (int) (Math.random() * retort.size());
                System.out.println(retort.get(oof));
            }else
                System.out.println("time to start the 8th crusade :                                      ^)");
        }
            */
        boardDraw bd = new boardDraw();
        bd.addMouseListener(new MonopolyMouseAdapter());
        
        
        
    }
    
    public static int dice() {
        
            int dice = (int)(Math.random() * 6 + 1);
            
            return dice;
        }

    
    public void update(Graphics window) {
        paint(window);
    }
    
    public void paint(Graphics window) {
        double start = System.currentTimeMillis();
       
        if(boardOne){
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File("house.jpg"));
        } catch (IOException ex) {
            System.err.println("sawwe");
        }
   
         BufferedImage bored = null;
        try {
            bored = ImageIO.read(new File("ok.png"));
        } catch (IOException ex) {
            System.err.println("sawwe berd");
        }
    
      window.drawImage(bored, 100,100,790,740, null);
      //window.drawImage(image, 100, 100, 10, 10, null);
      window.setFont(new Font("Comic Sans", Font.ITALIC, 50));
      window.drawString("COMMMUNISM :)", 290, 500);
      boardOne = false;
              
        }
      /*boolean game = true;
      while(game) {
      
      
          
      }
      */
        window.setColor(Color.WHITE);
        window.fillRect(1200, 200, 100, 100);
        window.setColor(Color.BLACK);
        window.setFont(new Font("Calibri", Font.BOLD, 52));
        window.drawString("Roll", 1209, 270);
        if(cl){
            window.setColor(Color.GRAY);
        window.fillRect(1200, 200, 100, 100);
        window.setColor(Color.BLACK);
        window.drawString("Roll", 1209, 270);
        cl = false;
        }else {
        window.setColor(Color.WHITE);
        window.fillRect(1200, 200, 100, 100);
        window.setColor(Color.BLACK);
        window.drawString("Roll", 1209, 270);
        
        }
        
        double total = System.currentTimeMillis() - start;
        System.out.printf("%.4f seconds%n", total/1000);
    }
    
    public void clicked(Point p) {
        if((p.x < 1300 && p.x > 1200) && (p.y < 300 && p.y > 200))       
        cl = true;
    }
   
    @Override
    public void run() {
        while(true) {
            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                System.err.println("Wow you just got cucked");
            }
        }
    }
}