import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Appends an introduction paragraph to a text file.
 */
public class Main {
    public static void main(String[] args) {
        String filePath = "./about-me.txt";
        String appendText = """
                
                                
                Hamza Ahmed
                -----------------------------------------------------------------------
                I am currently pursuing a Bachelor's of Computer Science at UNCG.
                but I plan to do one next year. I plan on becoming a software
                engineer, stack developer, or data scienctist as a potential
                future career. """;

        appendUsingFileWriter(filePath, appendText);
    }


    /**
     * Use FileWriter to append text to a file.
     *
     * @param filePath the text file.
     * @param text     the content to be appended.
     */
    private static void appendUsingFileWriter(String filePath, String text) {
        File file = new File(filePath);
        FileWriter fr = null;
        try {
            // Below constructor argument decides whether to append or override
            fr = new FileWriter(file, true);
            fr.write(text);
            System.out.println("File Written Successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}