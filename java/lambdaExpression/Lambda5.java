package lambdaExpression;

//public class Lambda5 {
//
//}
import javax.swing.*;
import java.awt.event.*;

public class Lambda5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Lambda Example");
        JButton button = new JButton("Click me");

        button.addActionListener(e -> System.out.println("Button clicked!"));

        frame.add(button);
        frame.setSize(200, 100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

