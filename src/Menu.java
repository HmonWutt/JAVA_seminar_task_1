import java.util.Scanner;

public class Menu {
   Scanner scanner;
    public Menu(Scanner scanner){
        this.scanner = scanner;
    }
    public void run(){
        //System.out.println("Hello World!");
        String choice;
        do {
            printMenu();
            choice = utilities.getChoice(this.scanner);
            //System.out.println("You entered: " + choice);
            switch (choice) {
                case "1":
                    Avatar.print();
                    break;
                case "2":
                    Today.print();
                    break;
                case "3A":
                    RockPaperScissor game = new RockPaperScissor();
                    game.start();
                    break;
                case "m":
                    printMenu();
                    break;
                case "q":
                    break;
                case "Q":
                    break;
                default:
                    System.err.println("Bad menu choice, use 'm' to get the menu.");
            }
        } while (!(choice.equals("q") || choice.equals("Q")));

    }
    private void printMenu() {
        String menuText = """
                 -----------------
                | 1) Menu choice 1
                | 2) Menu choice 2
                | 3) Menu choice 3
                | m) Print menu
                | qQ) Quit
                 -----------------""";

        System.out.println(menuText);
    }


}
