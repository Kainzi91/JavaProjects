import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        showGui();
    }
    private static void showGui()
    {
        JFrame frameMain= new JFrame("GUI Demo");
        frameMain.setTitle("GUI Demo");

        frameMain.setBounds(200,100,250,90);
        frameMain.setLocation(200,100);
        frameMain.setSize(250,90);

        //schließe die ablikation durch x tippen

        frameMain.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //Einen button ins Fenster ---> JPanel

        JPanel panelMain= new JPanel();

        BorderLayout layoutMain = new BorderLayout();

        panelMain.setLayout(layoutMain);

        //Button 1
        JButton buttonExit =new JButton("Beenden");
        buttonExit.setPreferredSize(new Dimension(100,40));
       // panelMain.add(buttonExit, BorderLayout.WEST);

        //Button 2
        JButton buttonCanel =new JButton("Abbruch");
      //  panelMain.add(buttonCanel, BorderLayout.WEST);
        buttonCanel.setPreferredSize(new Dimension(100,40));
        JPanel panelWest =new JPanel();
        panelWest.setPreferredSize(new Dimension(80,100) );
        FlowLayout layoutWest= new FlowLayout();
       // FLowLayout zuweisen
        panelWest.setLayout(layoutWest);

        panelMain.add(panelWest, BorderLayout.WEST);

        panelWest.add(buttonExit, FlowLayout.LEFT);
        panelWest.add(buttonCanel, FlowLayout.LEFT);

        frameMain.add(panelMain);
        frameMain.pack();


        frameMain.setVisible(true);



    }
}