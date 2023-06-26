import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class GUIDatei extends JFrame {
    private JPanel panelMain;
    private JButton exitButton;
    private JButton öffnenButton;
    private JTextField textFieldDatei;
    private JTextArea textAreaInhalt;

   private DateiLesen datei= new DateiLesen();

    public GUIDatei() {

        textFieldDatei.setText(datei.getPfadundname());
        //immer notwendig
        setLocation(300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(panelMain);

        pack();
        setVisible(true);

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        öffnenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                datei.setPfadundname(textFieldDatei.getText());
                textAreaInhalt.setText(datei.getInhalt());
            }
        });
        textFieldDatei.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                datei.setPfadundname(textFieldDatei.getText());
                textAreaInhalt.setText(datei.getInhalt());

            }
        });


    }
    private void createMenu(){

        JMenuBar menuebar=new JMenuBar();

        this.setJMenuBar(menuebar);

        JMenu menueDatei= new JMenu("Datei");
        JMenu menueBearbeiten= new JMenu("Bearbeiten");
        JMenuItem Exit=new JMenuItem("Beenden");

        menueDatei.add(Exit);

        Exit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                dispose();
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        menuebar.add(menueDatei);
        menuebar.add(menueBearbeiten);


    }


}
