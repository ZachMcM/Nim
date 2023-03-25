import java.util.Scanner;

public class Computer extends Player {
    Scanner input = new Scanner(System.in);

    public Computer (String name) {
        super(name);
    }

    public void takeTurn(Pile marblePile) {
        int numTake = (int)(Math.random() * marblePile.getMarbles() / 2) + 1;
        System.out.println("");
        marblePile.takeAwayMarbles(numTake);
        System.out.println("");
        System.out.println("Player " + getName() +  " took " + numTake + " marbles");
        System.out.println("There are now " + marblePile.getMarbles() + " Marbles left");
        System.out.println("");
        System.out.println("Type 1 to continue");
        int next = input.nextInt();
        while (next != 1) {
            System.out.println("Type 1 to continue");
            next = input.nextInt();
        }
    }    
}
