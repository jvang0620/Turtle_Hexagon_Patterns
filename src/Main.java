package src;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        World w = new World(500, 500);
        Turtle tom = new Turtle(w);

        tom.hexagon(100);
        tom.setVisible(false);
        tom.setPenColor(Color.CYAN);

        // tom drew a hexagon

        tom.turnLeft();
        tom.hexagon(100);
        tom.setVisible(false);
        tom.setPenColor(Color.BLUE);

        tom.turnLeft();
        tom.turnLeft();
        tom.hexagon(100);
        tom.setVisible(false);
        tom.setPenColor(Color.BLACK);

        tom.turnLeft();
        tom.turnLeft();
        tom.turnLeft();
        tom.hexagon(100);
        tom.setVisible(false);
        tom.setPenColor(Color.RED);
        tom.setPenWidth(10);

        tom.hexagon(50);
        tom.setVisible(false);
        tom.setPenColor(Color.BLACK);

        tom.turnLeft();
        tom.hexagon(50);
        tom.setVisible(false);
        tom.setPenColor(Color.YELLOW);

        tom.turnLeft();
        tom.turnLeft();
        tom.hexagon(50);
        tom.setVisible(false);
        tom.setPenColor(Color.BLUE);

        tom.turnLeft();
        tom.turnLeft();
        tom.turnLeft();
        tom.hexagon(50);
        tom.setVisible(true);
        tom.setPenColor(Color.CYAN);

    }

}
