import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MoodEntry {
    private String date;
    private String moodColor;
    private String quote;
    private double joyScore;

    public MoodEntry(String moodColor, String quote, double joyScore) {
        this.date = LocalDate.now().format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ENGLISH));
        this.moodColor = moodColor;
        this.quote = quote;
        this.joyScore = joyScore;
    }

    // setter
    public void setDate(String date) {
        this.date = date;
    }

    public void setMoodColor(String moodColor) {
        this.moodColor = moodColor;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public void setJoyScore(double joyScore) {
        this.joyScore = joyScore;
    }

    // getter
    public String getDate() {
        return date;
    }

    public String getMoodColor() {
        return moodColor;
    }

    public String getQuote() {
        return quote;
    }

    public double getJoyScore() {
        return joyScore;
    }
}
