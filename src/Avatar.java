import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
public class Avatar {
    public static void print() {
        Path path = Path.of("task_01/avatar.txt");
        try {
            String asciiArt = Files.readString(path);
            System.out.println(asciiArt);
        } catch (IOException e) {
            System.err.println("Error reading the file " + path);
        }
    }


}

