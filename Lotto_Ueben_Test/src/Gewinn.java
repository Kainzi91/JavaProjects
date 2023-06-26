import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gewinn extends JFrame{
    private JTextField textFieldGewinn;
    private JButton exitButton;
    private JPanel JPanelMain2;

    public Gewinn() {

        setTitle("Lotto");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(300, 200);
        add(JPanelMain2);
        pack();


        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    public void setTextFieldGewinn(int gewinn) {
        this.textFieldGewinn.setText(Integer.toString(gewinn));
    }

}
