import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class UI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Makeup Recommender");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Enter Skin Tone:");
        JTextField skinToneField = new JTextField(10);
        JButton recommendButton = new JButton("Get Recommendation");

        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(skinToneField);
        panel.add(recommendButton);

        frame.add(panel);
        frame.setVisible(true);

        recommendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String skinTone = skinToneField.getText();
                User user = new User("TestUser", skinTone, "Oily");

                List<Product> products = List.of(
                    new Product("Maybelline Fit Me", "Foundation", "Fair", "Maybelline"),
                    new Product("Mac Studio Fix", "Foundation", "Medium", "Mac")
                );

                Product recommendation = Recommendation.recommend(products, user);
                if (recommendation != null) {
                    JOptionPane.showMessageDialog(frame, "Recommended: " + recommendation.name);
                } else {
                    JOptionPane.showMessageDialog(frame, "No match found!");
                }
            }
        });
    }
}
