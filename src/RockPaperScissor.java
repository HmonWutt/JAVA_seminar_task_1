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
            System.out.printf("Score: %s, 0 - 0 %s%n", you.name, robot.name);
            System.out.printf("Score: %s, 0 - 0 %s%n", you.name, robot.name);
        } else if ((myStrategy.equals("r") && robotStrategy.equals("s")) ||
                (myStrategy.equals("p") && robotStrategy.equals("r")) ||
                (myStrategy.equals("s") && robotStrategy.equals("p"))) {
            System.out.printf("Score: %s, 1 - 0 %s%n", you.name, robot.name);
        } else {
            System.out.printf("Score: %s, 0 - 1 %s%n", you.name, robot.name);
        }
    }




}
