import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class MoodManager {
    private static final String FILE_PATH = "mood_entries.txt";

    public void SaveEntry(MoodEntry entry) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            String line = entry.getDate() + "|" +
                    entry.getMoodColor() + "|" +
                    entry.getJoyScore() + "|" +
                    entry.getQuote() + "|";
            writer.write(line);
            writer.newLine();
            System.out.println("Saved with success! :D");
        } catch (IOException e) {
            System.err.println("Ups! Something went wrong: " + e.getMessage());
        }
    }
}
