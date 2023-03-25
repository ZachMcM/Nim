import java.util.Scanner;

public class Human extends Player {
    Scanner input = new Scanner(System.in);

    public Human (String name) {
        super(name);
    }

    public void takeTurn(Pile marblePile) {
        int max = marblePile.getMarbles() / 2;
        System.out.println("");
        System.out.println("Please input how many marbles you would like to take");
        System.out.println("You can take between 1 and " + max + " marbles");
        int numTake = input.nextInt();
        while (!(numTake > 0 || numTake <= max)) {
            System.out.println("You can't take that amount of marbles");
            System.out.println("You can take between 1 and " + max + " marbles");
            numTake = input.nextInt();
        }
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
