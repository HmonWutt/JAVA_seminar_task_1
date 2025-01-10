import java.util.Random;

public class Dice {
    int sides;
    int lastRoll;
    Dice(int sides){
        this.sides = sides;
        //System.out.println("Constructor called with argument: " + sides);
    }
    public int roll() {
        Random random = new Random();
        this.lastRoll = random.nextInt(this.sides) + 1;
        return  this.lastRoll;
    }
    @Override
    public String toString() {
        String[] diceGraphics = {"⚀", "⚁", "⚂", "⚃", "⚄", "⚅"};
        return diceGraphics[this.lastRoll - 1];
    }
    public int getValue() {
        return this.lastRoll;
    }
}
