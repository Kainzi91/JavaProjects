import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIDateiAnzeigen extends JFrame{
    private JPanel panelMain;
    private JTextArea textAreaDaeiInhalt;
    private JButton buttonSchliessen;
    private JLabel labelPafadDateiName;
    private String DateiInhalt=new String();
    private String PathDateiName=new String();
    //Default Konstruktor
    public GUIDateiAnzeigen() throws HeadlessException {
        frameAnzeigen();
    }

    public GUIDateiAnzeigen(String pathDateiName) throws HeadlessException {
        setPathDateiName(pathDateiName);
        frameAnzeigen();

        buttonSchliessen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //setVisible(false);
                dispose(); //Destroy the JFrame object
            }
        });
    }

    public GUIDateiAnzeigen(String pathDateiName,String dateiInhalt) throws HeadlessException {
        setDateiInhalt(dateiInhalt);
        setPathDateiName(pathDateiName);
        frameAnzeigen();
    }

    public String getPathDateiName() {
        return PathDateiName;
    }

    public void setPathDateiName(String pathDateiName) {
        PathDateiName = pathDateiName;
        //setzen des Textes im label
        labelPafadDateiName.setText(pathDateiName);
    }

    public void setDateiInhalt(String dateiInhalt) {
        DateiInhalt = dateiInhalt;
        //setzen des Textes im label
        textAreaDaeiInhalt.setText(DateiInhalt);
    }

    private void frameAnzeigen(){
        //dazufügen vom panel ins Frame
        add(panelMain);
       // textAreaDaeiInhalt.setPreferredSize(new Dimension(300,200));
        setLocation(300,200);
        pack();
        setVisible(true);
    }
}
