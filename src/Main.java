import com.github.sarxos.webcam.Webcam;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // run on the good thread
        SwingUtilities.invokeLater(() -> {
            WelcomeWindow welcome = new WelcomeWindow();
            welcome.showWindow();
        });
    }
}