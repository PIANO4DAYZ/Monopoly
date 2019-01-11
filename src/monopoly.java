
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class monopoly extends JPanel implements Runnable {

    BufferedImage cc = null;
    BufferedImage put = null;
    BufferedImage q = null;
    BufferedImage worm = null;
    BufferedImage bored = null;
    BufferedImage d0 = null;
    BufferedImage d1 = null;
    BufferedImage d2 = null;
    BufferedImage d3 = null;
    BufferedImage d4 = null;
    BufferedImage d5 = null;
    BufferedImage d6 = null;

    int dice = 0;
    boolean boardOne = true;
    boolean cl = false;
    private Map<String, Integer> place;

    public monopoly() throws FileNotFoundException, IOException {
        place = new TreeMap<>();

        ArrayList<Image> pieces = new ArrayList<>();

    }

    public static void main(String[] args) throws FileNotFoundException, InterruptedException, IOException {


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

    public void update(Graphics window) {
        paint(window);
    }

    public void paint(Graphics window) {
        double start = System.currentTimeMillis();
        
        window.setColor(getBackground());
        
        window.fillRect(0, 0, getWidth(), getHeight());

        if (boardOne) {

            try {
                d0 = ImageIO.read(new File("d0.png"));
                d1 = ImageIO.read(new File("d1.png"));
                d2 = ImageIO.read(new File("d2.png"));
                d3 = ImageIO.read(new File("d3.png"));
                d4 = ImageIO.read(new File("d4.png"));
                d5 = ImageIO.read(new File("d5.png"));
                d6 = ImageIO.read(new File("d6.png"));
                cc = ImageIO.read(new File("cc.png"));
                put = ImageIO.read(new File("why.png"));
                bored = ImageIO.read(new File("bb.jpg"));
                q = ImageIO.read(new File("question.png"));
            } catch (IOException ex) {
                System.err.println("sawwe berd");
            }
            /*
            try {
                worm = ImageIO.read(new File("better.png"));
            } catch (IOException ex) {
                Logger.getLogger(monopoly.class.getName()).log(Level.SEVERE, null, ex);
            }
             */
            boardOne = false;
        }
        /*boolean game = true;
      while(game) {
      
      
          
      }
         */

        window.setFont(new Font("Comic Sans", Font.ITALIC, 50));
        window.setColor(Color.WHITE);
        window.drawImage(bored, 100, 100, 790, 740, null);
        /*
        window.fillRect((int) (-Math.random() * 40 + 280), 
              (int) (-Math.random() * 40 + 460), 
              (int) (Math.random() * 80 + 420), (int) (Math.random() * 80 + 70));
         */
        window.setColor(Color.BLACK);

        //window.drawString("COMMMUNISM :)", 290, 500);
        window.drawImage(cc, 230, 250, 190, 100, null);
        window.drawImage(put, 295, 400, 400, 100, null);
        window.drawImage(worm, 797, 761, 25, 25, null);
        window.drawImage(q, 580, 580, 190, 100, null);
        window.setColor(Color.WHITE);
        window.fillRect(1200, 200, 100, 100);
        window.setColor(Color.BLACK);
        window.setFont(new Font("Calibri", Font.BOLD, 52));
        window.drawString("Roll", 1209, 270);
        if (cl) {
            window.setColor(Color.GRAY);
            window.fillRect(1200, 200, 100, 100);
            window.setColor(Color.BLACK);
            window.drawString("Roll", 1209, 270);

        } else {
            window.setColor(Color.WHITE);
            window.fillRect(1200, 200, 100, 100);
            window.setColor(Color.BLACK);
            window.drawString("Roll", 1209, 270);

        }
        switch (dice) {
            case 0:
                window.drawImage(d0, 982, 374, 200, 200, null);
                break;
            case 1:
                window.drawImage(d1, 982, 374, 200, 200, null);
                break;
            // double total = System.currentTimeMillis() - start;
            //ystem.out.printf("%.4f seconds%n", total/1000);
            case 2:
                window.drawImage(d2, 982, 374, 200, 200, null);
                break;
            case 3:
                window.drawImage(d3, 982, 374, 200, 200, null);
                break;
            case 4:
                window.drawImage(d4, 982, 374, 200, 200, null);
                break;
            case 5:
                window.drawImage(d5, 982, 374, 200, 200, null);
                break;
            case 6:
                window.drawImage(d6, 982, 374, 200, 200, null);
                break;
            default:
                break;
        }
        window.setColor(getBackground());
        window.fillRect(982, 600, 500, 110);
        window.setColor(Color.BLACK);
        window.drawString("You got " + dice, 982, 700);
    }

    public int dice() {

        return (int) (Math.random() * 6 + 1);
    }
    
    static BufferedImage god;
    
    static {
        god = null;
        try {
            god = ImageIO.read(new File("god.png"));
        } catch (IOException ex) {
            Logger.getLogger(monopoly.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pressed(Point p) {
        Cursor c = Toolkit.getDefaultToolkit().createCustomCursor(god, new Point(getX(),
                getY()), "god");
        setCursor(c);

        System.out.println("xPos: " + p.x + " " + "yPos: " + p.y);
        if ((p.x <= 1310 && p.x >= 1200) && (p.y <= 330 && p.y >= 230)) {
            dice = dice();
            System.out.println(dice());
            cl = true;
        }
    }

    public void released(Point p) {
        setCursor(Cursor.getDefaultCursor());
        cl = false;
    }

    @Override
    public void run() {

        while (true) {

            repaint();
            try {

                Thread.sleep(50);
            } catch (InterruptedException ex) {
                System.err.println("Wow you just got cucked");
            }
        }

    }
}
