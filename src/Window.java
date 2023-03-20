import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Player p1 = new Player("Good", 600);
    public Player p2 = new Player("Bad", 600);
    public Window() {
        this.setTitle("HealthBars");
        this.setBackground(Color.gray);
        this.setPreferredSize(new Dimension(600, 400));
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setLayout(new GridLayout(2,1)); //grids the two canvas, adds them and puts them together.
            this.add(new Canvas(p1, Color.green));
            this.add(new Canvas(p2, Color.red));

        this.pack();
        this.setVisible(true);
    }
}
