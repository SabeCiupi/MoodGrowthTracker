import javax.swing.*;
import java.awt.*;

public class WelcomeWindow extends JFrame {
    public WelcomeWindow() {
        setTitle("Pink GreenHouse - Welcome :D");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center it

        // background
        getContentPane().setBackground(new Color(255,209,220));
        setLayout(new GridBagLayout());

        // welcome message
        JLabel welcomeLabel = new JLabel("Welcome Back, Little Fairy!");
        welcomeLabel.setFont(new Font("Serif", Font.ITALIC, 22));
        welcomeLabel.setForeground(new Color(100, 50,50));

        JLabel questionLabel = new JLabel("What do you choose today?");
        questionLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

        // buttons
        JButton autoBtn = new JButton("Auto-scan my mood");
        JButton manualBtn = new JButton("Manual entry");

        // style for buttons
        styleButton(autoBtn);
        styleButton(manualBtn);

        // arrange on page
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0;

        gbc.gridy = 0; add(welcomeLabel, gbc);
        gbc.gridy = 1; add(questionLabel, gbc);
        gbc.gridy = 2; add(autoBtn, gbc);
        gbc.gridy = 3; add(manualBtn, gbc);
    }

    private void styleButton(JButton button) {
        button.setBackground(Color.WHITE);
        button.setFocusPainted(false);
        button.setBorder(BorderFactory.createLineBorder(new Color(255, 150, 180), 2));
        button.setPreferredSize(new Dimension(200, 40));
    }

    public void showWindow() {
        setVisible(true);
    }
}

