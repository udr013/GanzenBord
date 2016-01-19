
//drie packages //player dice gameplay//


import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by udr013 on 3-1-2016.
 * run from here
 */
public class GanzenBord extends GanzenbordPlay {

    static int nrOfPlayers;
    static int currentPlayer;

    public static void main(String[] args) {

        System.out.println(
                "*******************WELCOME!!!****************** \n" +
                        "* We bring to you the old fashion dutch game: *\n" +
                        "*                GANZENBORD!!                 *\n" +
                        "*             in digital version,             *\n" +
                        "*        with fancy progress graphics!        *\n" +
                        "*                                             *\n" +
                        "*                 Have Fun!                   *\n" +
                        "*                                             *\n" +
                        "*               Instructions:                 *\n" +
                        "*  enter 'g' in the popup to throw a Dice!    *\n" +
                        "***********************************************\n" +
                        "");
//        ArrayList players =new ArrayList();
//        getnrOfPlayers();
//
//        for (int x = 0;x<nrOfPlayers;x++){
//            players.add(new Ganzenbord.Player());
//            System.out.print(players.size());
//        }
//        for (Object x:players)
//             { Ganzenbord.Player y =(Ganzenbord.Player)x;
//                 y.setName();
//        }
        getNrOfPlayers();
        Player[] players = new Player[nrOfPlayers];
        Dice dice = new Dice();


        for (int x = 0; x < players.length; x++) {
            players[x] = new Player();
            players[x].setName();

        }


        while (players[currentPlayer].getStart()) {
            for (Player x : players) {
                if (x.getStart() == false) {
                    continue;
                } else {
                    String name = x.getName();
                    String g = getInput(name);
                    if (g.equals("g")) {
                        int worp = dice.throwDice();
                        x.setPosition(worp);
                        boolean c = x.play(x.getPosition(), name, x.getStart(), worp);
                        x.graphics(x.getPosition());
                        x.setStart(c);
                    }
                    if (players[currentPlayer].getWinner() == true) {
                        System.exit(1);
                    }
                }
            }
        }
    }


    public static void getNrOfPlayers() {
        String a = JOptionPane.showInputDialog("geef aantal spelers op", "");
        nrOfPlayers = Integer.parseInt(a);
    }

    public static String getInput(String name) {
        String input = JOptionPane.showInputDialog(name + " enter 'g' to throw Dice!", "_");
        while (!input.toLowerCase().equals("g")) {
            return "g";
        }
        if (input.toLowerCase().equals("g")) {
            input = input.toLowerCase();
        }
        return input.toLowerCase();
        //Scanner in = new Scanner(System.in);
        //System.out.println("enter 'g' to throw Dice! ");
        //return in.nextLine();
    }
}







