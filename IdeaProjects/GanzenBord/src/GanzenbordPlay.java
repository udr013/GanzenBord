

import javax.swing.*;

/**
 * Created by udr013 on 18-1-2016.
 */

public class GanzenbordPlay {

    static boolean winner;


    public boolean play(int position, String name, boolean start, int temp) {
        if (start == false) {
            System.out.println(name + "Je ligt uit het spel, volgende speler is aan de beurt");
        } else {
            System.out.println(name + ", you threw: " + temp);
            System.out.println(name + " Your current position is: " + position);

            if (position == 23) {
                start = false;
                System.out.println(name + " You're in the slammer, you loose, GAME OVER!");
            }
            if (position == 25) {
                position = 0;
                System.out.println(name + " Bad luck position 25! Return to your start and start over");
            }
            if (position == 45) {
                position = 0;
                System.out.println(name + " Bad luck position 45! Return to your start and start over");
            }
            if (position == 10) {
                position = position + temp;
                System.out.println(name + " You're in luck!, enjoy your free walk! Your new position: " + position);
            }
            if (position == 20) {
                position = position + temp;
                System.out.println(name + " You're in luck!, enjoy your free walk! Your new position: " + position);
            }
            if (position == 30) {
                position = position + temp;
                System.out.println(name + " You're in luck!, enjoy your free walk! Your new position: " + position);
            }
            if (position >= 63) {
                start = false;
                winner = true;
                System.out.println("************************************");
                System.out.println("*  QUACK!!! 63 or more, YOU WON!!! *");
                System.out.println("*                                  *");
                System.out.println("*               __1__              *");
                System.out.println("           _____|   |____          *");
                System.out.println("*          |            |          *");
                System.out.println("************************************");
                System.out.println("");
                System.out.println("Restart to play a new game!");
            }
        }

        return start;
    }
}



