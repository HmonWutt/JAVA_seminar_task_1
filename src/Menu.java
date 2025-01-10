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
            choice = getChoice();
            //System.out.println("You entered: " + choice);
            switch (choice) {
                case "1":
                    Avatar.print();
                    break;
                case "2":
                    Today.print();
                    break;
                case "3A", "3":
                    RockPaperScissor.start();
                    break;
                case "m":
                    printMenu();
                    break;
                case "q","Q":
                    break;
                default:
                    System.err.println("Bad menu choice, use 'm' to get the menu.");
            }
        } while (!(choice.equals("q") || choice.equals("Q")));

    }
    public String getChoice(){
        System.out.print("Enter your choice: ");
        return scanner.nextLine();
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
