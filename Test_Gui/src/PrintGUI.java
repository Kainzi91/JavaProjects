import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class PrintGUI  extends JFrame{
    private JPanel panelPrint;
    private JList list1;



    private ArrayList<Person> Liste = new ArrayList<Person>();

    StringBuilder ganzerText= new StringBuilder();
    String [] wholeText ;


    public PrintGUI(ArrayList<Person> liste) {
        this.Liste = liste;
        setPlattform();

        for (Person p :Liste
             ) {

            ganzerText.append(p.getFirstname()+" "+p.getLastname()+" "+p.getEmail()+"\n");

        }
        wholeText= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        list1.setListData(wholeText);
        list1.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting())
                System.out.println(list1.getSelectedValue());
            }
        });

        System.out.println(list1.getSelectedValue());
        createMenu();

        setBounds(300,300 ,500,300);
        add(panelPrint);
        setVisible(true);


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
    private void setPlattform(){

        String plaf="";

        plaf="com.sun.java.swing.plaf.motif.MotifLookAndFeel";
        System.out.println("Platform= " + UIManager.getSystemLookAndFeelClassName().toString());

        try {
            UIManager.setLookAndFeel(plaf);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }



    }

}


