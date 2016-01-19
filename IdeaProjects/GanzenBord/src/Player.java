

import javax.swing.*;

/**
 * Created by udr013 on 3-1-2016.
 * Player methods
 */
public class Player extends GanzenbordPlay {


    private String name;
    private static int position;
    static boolean start = true;

    public void setPosition(int temp) {
        position = position + temp;
    }

    public int getPosition() {
        return position;
    }

    public boolean getStart() {
        return start;
    }

    public void setStart(boolean c) {
        start = c;
    }

    public String getName() {
        return name;
    }


    public void graphics(int a) {
        System.out.println(" ");
        for (int x = 0; x < a; x++) {
            System.out.print("_");
        }
        System.out.print("o>\n");
        System.out.println("");
    }


    public void setName() {
        name = JOptionPane.showInputDialog("enter your name", "name");
    }

    public boolean getWinner() {
        return winner;
    }
}
