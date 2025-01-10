import java.util.Random;

public class Dice {
    private final int sides;
    private int lastRoll;
    public Dice(int sides){
        this.sides = sides;
    }
    public int roll() {
        Random random = new Random();
        this.lastRoll = random.nextInt(this.sides) + 1;
        return  this.lastRoll;
    }
    public String toString() {
        String[] diceGraphics = {"⚀", "⚁", "⚂", "⚃", "⚄", "⚅"};
        return diceGraphics[this.lastRoll - 1];
    }
    public int getValue() {
        return this.lastRoll;
    }
}
