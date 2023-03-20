import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.ThreadLocalRandom;
public class Canvas extends JPanel implements MouseListener {
    Player player;
    public Canvas(Player p, Color color){ //Det här gör rektanglarna som ska föreställa healthbars.
        player=p;
        this.setBackground(color);
        addMouseListener(this);
        this.setSize(new Dimension(player.getHealth(),200));
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }

    //is run when repaint() is called
    @Override
    public void paintComponent(Graphics g) { //Repainting the healthbar
        super.paintComponent(g);
        System.out.println(player.getHealth());
        this.setSize(new Dimension(player.getHealth(),183));
    }

    @Override
    public void mouseClicked(MouseEvent e) { //A random number that decides the amount of damage the player takes, when you click, it decides the damage.
        System.out.println("CLICK");
        System.out.println(e.getButton());
        int randomNumber = ThreadLocalRandom.current().nextInt(1,10+1);
        System.out.println(randomNumber/100.0*600);
        player.damage((int) (randomNumber/100.0*600));
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
