import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        try {
            Files.writeString(
                    Path.of("test.txt"),
                    "hello java"
            );

            String text = Files.readString(
                    Path.of("test.txt")
            );

            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}