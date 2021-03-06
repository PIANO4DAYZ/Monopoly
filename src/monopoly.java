
import java.io.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

public class monopoly extends JPanel implements Runnable {

    private int testTotal = 0;
    private int testTotal2 = 0;
    private int testTotal3 = 0;
    int pieceCounter = 1;
    int pX = 793;
    int pY = 775;
    int pX2 = 793;
    int pY2 = 775;
    int pX3 = 793;
    int pY3 = 775;
    private final BufferedImage piece;
    private final BufferedImage piece2;
    private final BufferedImage piece3;
    private final BufferedImage cc;
    private final BufferedImage put;
    private final BufferedImage q;
    private final BufferedImage bored;
    private final BufferedImage[] dies;
    private final BufferedImage cigar;
    private boolean twice = false;
    private final ArrayList<Block> board = new ArrayList<>();
    private int dice2 = 0;
    private int dice = 0;
    private final Block jel = new Block(138, 773, 72, 70);
    private boolean cl = false;

    private Map<String, Integer> place;

    public monopoly() throws IOException {
        int x = 793;
        int y = 795;
        for (int i = 0; i < 11; i++) {

            if (i == 0) {

                board.add(new Block(793, 775, 100, 97));
                y = y - 23;
            } else if (i == 10) {
                board.add(new Block(107, 774, 30, 94));

            } else {

                board.add(new Block((x - 65), y, 60, 73));
                x = x - 65;
            }
            //ArrayList.add(new Block(, i, WIDTH, HEIGHT, dice));
            System.out.println("Block SIZE : " + board.size());

        }
        x = 107;
        y = 714;
        for (int a = 11; a < 21; a++) {
            if (a == 20) {

                board.add(new Block(108, 133, 100, 100));
            } else {
                board.add(new Block(x, y, 73, 60));
                y = y - 63;
            }
        }
        x = 212;
        y = 131;
        for (int b = 21; b < 31; b++) {
            if (b == 30) {

                board.add(new Block(795, 132, 100, 100));
            } else {

                board.add(new Block(x, y, 60, 73));
                x += 65;
            }

        }
        x = 817;
        y = 228;
        for (int c = 31; c < 40; c++) {
            board.add(new Block(x, y, 73, 60));
            y += 60;

        }
        board.add(jel);
        dies = new BufferedImage[13];
        for (int i = 0; i < dies.length; i++) {
            dies[i] = ImageIO.read(new File("d" + i + ".png"));
        }
        cc = ImageIO.read(new File("cc.png"));
        put = ImageIO.read(new File("why.png"));
        bored = ImageIO.read(new File("bb.jpg"));
        q = ImageIO.read(new File("question.png"));
        piece = ImageIO.read(new File("hell.png"));
        piece2 = ImageIO.read(new File("egg.png"));
        piece3 = ImageIO.read(new File("categg.png"));
        cigar = ImageIO.read(new File("cigar revise.png"));

        place = new TreeMap<>();

        ArrayList<Image> pieces = new ArrayList<>();

    }

    public static void main(String[] args) throws FileNotFoundException, InterruptedException, IOException {

        //<editor-fold defaultstate="collapsed" desc="Introduction crap">
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
//</editor-fold>
        boardDraw bd = new boardDraw();
        bd.addMouseListener(new MonopolyMouseAdapter());

    }

    @Override
    public void paint(Graphics window) {
        window.setColor(getBackground());

        window.fillRect(0, 0, getWidth(), getHeight());

        window.setFont(new Font("Comic Sans", Font.ITALIC, 50));
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
        // window.drawImage(worm, 797, 761, 25, 25, null);
        //window.drawImage(cigar, 797, 761, 30, 30, null);
        window.drawImage(q, 580, 580, 190, 100, null);
        //window.drawImage(piece, 300, 300, 100, 100, null);
        window.setColor(Color.WHITE);
        window.fillRect(1200, 200, 100, 100);
        window.setColor(Color.BLACK);
        window.setFont(new Font("Calibri", Font.BOLD, 52));

        window.setColor(cl ? Color.GRAY : Color.WHITE);
        window.fillRect(1200, 200, 100, 100);
        window.setColor(Color.BLACK);
        window.drawString("Roll", 1209, 270);

        window.drawImage(dies[dice + dice2], 982, 374, 200, 200, null);

        if (testTotal == 40) {

            if (twice) {

            }
        }
        if (testTotal == 30) {
            testTotal = 40;

        } else if (testTotal > 39 && testTotal != 40) {
            testTotal = testTotal % 40;
        }
        
        Block temp = board.get(testTotal);
        Block temp2 = board.get(testTotal2);
        Block temp3 = board.get(testTotal3);
        
            window.drawImage(cigar, temp.getX(), temp.getY(), 30, 30, null);  
            window.drawImage(piece2, temp2.getX() + 40, temp2.getY(), 30, 30, null);
            window.drawImage(piece3, temp3.getX(), temp3.getY() + 40, 30, 30, null);
       
        
        if (pieceCounter > 3) {

            pieceCounter = 1;
        }
        if (twice) {

            window.drawString("yo   mom where my hec MILK AHHHHHHHHHHHHHHHHHHHHHHHHHH", 600, 600);
        }
        window.setColor(getBackground());
        window.fillRect(982, 600, 500, 110);
        window.setColor(Color.BLACK);
        window.drawString("You got " + (dice + dice2), 982, 700);
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
        pieceCounter++;
        Cursor c = Toolkit.getDefaultToolkit().createCustomCursor(god,
                new Point(getX(), getY()), "god");
        setCursor(c);

        System.out.println("xPos: " + p.x + " " + "yPos: " + p.y);
        if ((p.x <= 1310 && p.x >= 1200) && (p.y <= 330 && p.y >= 230)) {
            dice2 = dice();
            dice = dice();
            if (dice2 == dice) {

                twice = true;
            } else {
                twice = false;
            }
            cl = true;
            if(pieceCounter == 1)
            testTotal += dice + dice2;
            if(pieceCounter == 2)
                testTotal2 += dice + dice2;
            if(pieceCounter == 3)
                testTotal3 += dice + dice2;
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
