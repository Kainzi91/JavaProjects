import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class GUI extends JFrame {
    private JPanel PanelMain;
    private JButton buttonExit;
    private JLabel Filename;
    private JFrame dialog=new JFrame();
    public GUI() {


        setLocation(300,200);
        setSize(300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);;
        setVisible(true);
        createMenu();
        add(PanelMain);

    }
    private void createMenu(){

        JMenuBar menuebar=new JMenuBar();

        this.setJMenuBar(menuebar);

        JMenu menueDatei= new JMenu("Datei");
        JMenu menueBearbeiten= new JMenu("Bearbeiten");
        JMenuItem Exit=new JMenuItem("Beenden");
        JMenuItem Oeffnen=new JMenuItem("Öffnen");
        menueDatei.add(Exit);
        menueDatei.add(Oeffnen);
        Oeffnen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser  dateiAuswahl =new JFileChooser();
                // Startverzeichniss setzen
                dateiAuswahl.setCurrentDirectory(new File(System.getProperty("user.home")));
                //verknüpfen mit einem JFrame zum Anzeigen
                int auswahl=dateiAuswahl.showOpenDialog(dialog);
                System.out.println("auswahl = " + auswahl);
                if(auswahl==JFileChooser.APPROVE_OPTION){
                    File file =dateiAuswahl.getSelectedFile();
                    Filename.setText(file.getAbsolutePath());


                }
                if (auswahl==JFileChooser.CANCEL_OPTION) System.out.println("Keine Auswahl");
            }
        });

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

    private  File read (){
        JFileChooser  dateiAuswahl =new JFileChooser();
        // Startverzeichniss setzen
        dateiAuswahl.setCurrentDirectory(new File(System.getProperty("user.home")));
        //verknüpfen mit einem JFrame zum Anzeigen
        int auswahl=dateiAuswahl.showOpenDialog(dialog);
        System.out.println("auswahl = " + auswahl);
        if(auswahl==JFileChooser.APPROVE_OPTION){
            File file =dateiAuswahl.getSelectedFile();
            Filename.setText(file.getAbsolutePath());


        }
        if (auswahl==JFileChooser.CANCEL_OPTION) System.out.println("Keine Auswahl");
    return dateiAuswahl.getSelectedFile();

    }

}
