public class Player {
    String name;
    String strategy;
    Player(String name) {
        this.name = name;
    }
    public void playRandomly(Dice dice) {
        this.setStrategy(intToString(dice.roll()));
    }
    public String getStrategy(){
        return this.strategy;
    }
    private void setStrategy(String strategy){
        this.strategy = strategy;
    }
    public void playLikeSimpleton(String strategy) {
        this.setStrategy(strategy);
    }
    private String intToString(int choice) {
        String choiceString;
        switch (choice) {
            case 1:
                choiceString = "r";
                break;
            case 2:
                choiceString = "p";
                break;
            default:
                choiceString = "q";
        }
        return choiceString;
    }
}