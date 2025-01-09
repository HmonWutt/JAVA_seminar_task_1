import java.util.Scanner;

public class RockPaperScissor {
   public static void start(){
       String choice;
       Player robot = new Player("R2D2");
       Player you = new Player("you");
       System.out.println("Welcome to a game of rock ✊, scissor ✂, paper ✋! \nYou will play against R2D2 and we keep score.");
       Dice dice = new Dice(3);
       Scanner scanner = new Scanner(System.in);
       String myChoice = "-";
       while (!myChoice.equals("q") && !myChoice.equals("Q")){
           printMenu();
           robot.playRandomly(dice);
           myChoice = utilities.getChoice(scanner);
           try {
               if (myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
                   you.playLikeSimpleton(myChoice);
                   decidesWinner(robot, you);
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

    private static void decidesWinner(Player robot, Player me) {
        String robotStrategy = robot.getStrategy();
        String myStrategy = me.getStrategy();
        if (myStrategy.equals(robotStrategy)) {
            System.out.println(String.format("Score: %s, 0 - 0 %s", me.name, robot.name));
        } else if ((myStrategy.equals("r") && robotStrategy.equals("s")) ||
                (myStrategy.equals("p") && robotStrategy.equals("r")) ||
                (myStrategy.equals("s") && robotStrategy.equals("p"))) {
            System.out.println(String.format("Score: %s, 1 - 0 %s", me.name, robot.name));
        } else {
            System.out.println(String.format("Score: %s, 0 - 1 %s", me.name, robot.name));
        }
    }

}
