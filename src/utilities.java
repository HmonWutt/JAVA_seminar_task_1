import java.util.Scanner;

public class utilities {
    public static String getChoice(Scanner scanner){
        System.out.print("Select rock ✊ [r], scissor ✂ [s], paper ✋ [p] or quit [q]: ");
        return scanner.nextLine();
    }
}
