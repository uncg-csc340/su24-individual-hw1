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
                
                                
                Sunny Ntini
                -----------------------------------------------------------------------
                I am a lecturer of Computer Science. I have a MS in Comp Sci from UNCG, and a \s
                BS in Computer Science from Indiana University of Pennsylvania.\s
                I like (some) superheroes and puzzles. I solve my Wordle at 12:01 am every day.
                Just like most basic people, I like hiking. I also like history tidbits so I listen to\s
                Behind The Bastards, The Dollop, Well There's Your Problem, Ridiculous History and the like. I'm\s
                currently reading "Rogues: True Stories of Grifters, Killers, Rebels, and Crooks".
                This is the way.""";

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