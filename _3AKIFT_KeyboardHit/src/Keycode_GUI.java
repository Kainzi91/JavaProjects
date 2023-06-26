import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Keycode_GUI extends JFrame {
    private JButton exitButton;
    private JTextField textField1;
    private JPanel PanelMain;
    private JLabel ausgabe;


    public Keycode_GUI() {

        add(PanelMain);
        setVisible(true);
        pack();





        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.getActionCommand());
                ausgabe.setText(textField1.getText());

            }
        });

        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
               // System.out.println("e.getKeyCode() = " + e.getKeyCode());
               // System.out.println("e.getExtendedKeyCode() = " + e.getExtendedKeyCode());
            }
        });
        textField1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);



                if(e.isShiftDown())
                {  ausgabe.setText("SHIFT + "+KeyEvent.getKeyText(e.getKeyCode()));
                }
                else if (e.isAltDown()) {
                    ausgabe.setText("ALT + "+KeyEvent.getKeyText(e.getKeyCode()));
                }
                else if (e.isControlDown())
                {
                    ausgabe.setText("STRG + "+KeyEvent.getKeyText(e.getKeyCode()));

                } else
                {
                    ausgabe.setText(""+KeyEvent.getKeyText(e.getKeyCode()));
                }
                    ;






            }

        });
    }
}
