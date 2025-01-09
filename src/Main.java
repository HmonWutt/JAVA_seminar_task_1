import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dice die = new Dice(6);
        int roll1 = die.roll();
        int roll2 = die.roll();
        int sum = roll1 + roll2;
        System.out.print("You rolled: " + roll1 + " and " + roll2);
        System.out.println(". The sum is: " + sum);
        String input;
        Scanner scanner = new Scanner(System.in);
        do {
            die.roll();
            System.out.println("Dice rolled: " + die + " (" + die.getValue() + ")");
            System.out.println("Enter 'Y' to roll once more. Enter any other key to go back to the main menu.");
            try{
            input = scanner.nextLine();
            }
            catch (Exception e){
                System.out.println("Invalid input! Enter Y/N");
                input = "";
            }
        } while (input.equals("y") || input.equals(""));


    Menu menu = new Menu(scanner);
        menu.run();
        scanner.close();
    }

}
