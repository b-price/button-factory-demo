import javax.swing.*;
import java.awt.event.ActionListener;

public class WindowsButton implements Button{
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton button = new JButton("Click me");

    @Override
    public void render() {
        frame.add(panel);
        frame.add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        onClick();
    }

    @Override
    public void onClick() {
        button.doClick();
    }
}
