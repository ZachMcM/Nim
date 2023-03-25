import java.util.Scanner;

class Nim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pile marblePile = new Pile();
        Player playerOne;
        Player playerTwo;
        boolean computerStatus = true;

        System.out.println("");
        System.out.println("Welcome to Nim!");
        System.out.println("Enter 1 for a two player game");
        System.out.println("Enter 2 for a single player game");
        int userChoice = input.nextInt();
        while (!(userChoice == 1 || userChoice == 2)) {
            System.out.println("Enter 1 for a single player game");
            System.out.println("Enter 2 for a two player game");
            userChoice = input.nextInt();
        }
        input.nextLine();
        if (userChoice == 1) {
            System.out.println("");
            System.out.println("You chose single player mode");
            System.out.println("");
            System.out.println("Please enter your name");
            String oneName = input.nextLine();
            playerOne = new Human(oneName);
            System.out.println("You chose a name of " + playerOne.getName());
            playerTwo = new Computer("Computer");
        } else {
            computerStatus = false;
            System.out.println("");
            System.out.println("You chose two player mode");
            System.out.println("");
            System.out.println("Please enter player one name");
            String oneName = input.nextLine();
            playerOne = new Human(oneName);
            System.out.println("Player 1 chose name " + playerOne.getName());
            System.out.println("Please enter player two name");
            String twoName = input.nextLine();
            playerTwo = new Human(twoName);
            System.out.println("Player 2 chose name " + playerTwo.getName());
        }
        System.out.println("");
        System.out.println("The game has started with " + marblePile.getMarbles() + " marbles");
        System.out.println("");
        boolean playerOneWins = false;
        while(marblePile.getMarbles() > 1) {
            System.out.println(playerOne.getName() + "'s turn");
            ((Human)(playerOne)).takeTurn(marblePile);
            if (marblePile.getMarbles() > 1) {
                System.out.println(playerTwo.getName() + "'s turn");
                if (computerStatus) {
                    ((Computer)(playerTwo)).takeTurn(marblePile);
                } else {
                    ((Human)(playerTwo)).takeTurn(marblePile);
                }
            } else {
                playerOneWins = true;
            }
        }
        if (playerOneWins) {
            System.out.println("Player " + playerOne.getName() + " wins!");
        } else {
            System.out.println("Player " + playerTwo.getName() + " wins!");
        }
        input.close();
    }
}