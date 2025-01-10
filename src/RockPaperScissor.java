import java.util.Scanner;

public class RockPaperScissor {
    static final Scanner scanner = new Scanner(System.in);
    static final Dice dice = new Dice(3);
    static final Player robot = new Player("R2D2");
    static Player you = new Player("You");
   public static void start(){
       String choice;
       System.out.println("Welcome to a game of rock ✊, scissor ✂, paper ✋! \nYou will play against R2D2 and we keep score.");
       String myChoice = "-";
       while (!myChoice.equals("q") && !myChoice.equals("Q")){
           robot.playRandomly(dice);
           myChoice = utilities.getChoice(scanner);
           try {
               if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
                   you.playLikeSimpleton(myChoice);
                   decidesWinner();
               } else if(myChoice.equals("q")) {
                  break;
               }
               else{
                   System.out.println("Invalid strategy!");
               }
           }
           catch (Exception e){
               System.out.println("Invalid strategy!");
           }
       }
       System.out.println("Redirecting to the main menu......");
   }
    private static void printMenu(){
        System.out.println("Select rock ✊ [r], scissor ✂ [s], paper ✋ [p] or quit [q]:");
    }

    private static void decidesWinner() {
        String robotStrategy = robot.getStrategy();
        String myStrategy = you.getStrategy();
        if (myStrategy.equals(robotStrategy)) {
            printScore(0,0);
            printTie();
        } else if ((myStrategy.equals("r") && robotStrategy.equals("s")) ||
                (myStrategy.equals("p") && robotStrategy.equals("r")) ||
                (myStrategy.equals("s") && robotStrategy.equals("p"))) {
            printScore(1,0);
            printWin();
        } else {
            printScore(0,1);
            printLoss();
        }
    }
private static String stringToEmoji(String string){
    return switch (string) {
        case "r" -> "✊";
        case "s" -> "✂";
        case "p" -> "✋";
        default -> "";
    };
}
private static void printScore(int yourScore, int robotScore){
    System.out.printf("Score: You %d - %s %d%n", yourScore,robot.name, robotScore);
}
private static void printTie(){
   String yourEmoji = stringToEmoji(you.strategy);
   String robotEmoji = stringToEmoji(robot.strategy);
    System.out.printf("You did: %s and %s did %s. You are equal! No points!%n%n", yourEmoji, robot.name,robotEmoji);
}
    private static void printWin(){
        String yourEmoji = stringToEmoji(you.strategy);
        String robotEmoji = stringToEmoji(robot.strategy);
        System.out.printf("You did: %s and %s did %s. You won \uD83C\uDF89!%n%n", yourEmoji, robot.name,robotEmoji);
    }
    private static void printLoss(){
        String yourEmoji = stringToEmoji(you.strategy);
        String robotEmoji = stringToEmoji(robot.strategy);
        System.out.printf("You did: %s and %s did %s. You lost \uD83D\uDE14.%n%n", yourEmoji, robot.name,robotEmoji);
    }

}
