import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class GUIDatei extends  JFrame{
    private JPanel panelMain;
    private JButton buttonOpen;
    private JButton buttonExit;
    private JTextField textFieldDatei;
    private JTextArea textAreaInhalt;
    private DateiLesen datei=new DateiLesen();

    public GUIDatei() {
        //default File darstellen
        textFieldDatei.setText(datei.getPfadUndName());
        //immer notwendig
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(300,200);
        add(panelMain);//anzeigen aller Inhalte
        pack();
        setVisible(true);

        //Die Oberflächen Bedienung
        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //was soll passieren
                System.exit(0);//beenden
            }
        });

        buttonOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //öffnen der Anzeigen/GUI für die Datei
                //pfad und Name übergeben
                datei.setPfadUndName(textFieldDatei.getText());
                //Datei Inhalt in testarea darstellen
                textAreaInhalt.setText(datei.getInhalt());

                GUIDateiAnzeigen guiAnzeigen=new GUIDateiAnzeigen(datei.getPfadUndName());
                guiAnzeigen.setLocation(getX()+getWidth(),getY());
                //ins Fenster übergeben
                //guiAnzeigen.setPathDateiName(datei.getPfadUndName());
                guiAnzeigen.setDateiInhalt(datei.getInhalt());
            }
        });
        textFieldDatei.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //pfad und Name übergeben
                datei.setPfadUndName(textFieldDatei.getText());
                //Datei Inhalt in testarea darstellen
                textAreaInhalt.setText(datei.getInhalt());
            }
        });
    }
}
