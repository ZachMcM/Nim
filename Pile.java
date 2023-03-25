public class Pile {
    private int numMarbles;

    public Pile() {
        numMarbles = (int)(Math.random() * 91) + 10;
    }

    public int getMarbles() {
        return numMarbles;
    }

    public void takeAwayMarbles(int x) {
        numMarbles -= x;
    }
}
