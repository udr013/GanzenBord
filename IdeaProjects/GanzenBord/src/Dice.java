

/**
 * Created by udr013 on 18-1-2016.
 * just a simple dice
 */
public class Dice {
    public int throwDice() {
        int dice = (int) (Math.random() * 6) + 1;
        return dice;

    }
}
