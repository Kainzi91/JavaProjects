import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileReader;

public class Verzeichnis extends JFrame {
    private JTextField PfadTextfield;
    private JPanel PanelMail;
    private JList DateiListe;
    private JButton BeendenButton;
    private JPanel ButtonPanel;

    FileLister file =new FileLister(".\\");

    public Verzeichnis() {

        DateiListe.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5));

        PfadTextfield.setText(file.getPath());
        DateiListe.setListData(file.getOutput());


        PfadTextfield.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                file.setPath(PfadTextfield.getText());
                System.out.println("im in");

                System.out.println(PfadTextfield.getText());
                DateiListe.setListData(file.getOutput());
            }
        });
        /*
        DateiListe.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (DateiListe.getSelectedValue().toString().endsWith(".java")) {
                    FileReaderGUI gui=new FileReaderGUI(file.getAbsolutePath()+"\\" +DateiListe.getSelectedValue().toString());
                    System.out.println();
                    gui.setBounds(getX()+getWidth(),getY(),getWidth(),getHeight());
                }
                else {
                    file.setPath(file.getPath()+DateiListe.getSelectedValue());
                    DateiListe.setListData(file.getOutput());
                    System.out.println(file.getPath()+DateiListe.getSelectedValue().toString());
                    PfadTextfield.setText(file.getPath()+DateiListe.getSelectedValue());


                }

            }
        });

*/

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("1.Test Sommersemester Kainz Alexander");
        setBounds(300,200,300,400);
        add(PanelMail);
        setVisible(true);

        BeendenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(-1);
            }
        });

        DateiListe.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    // Doppelklick-Ereignis
                    if (DateiListe.getSelectedValue().toString().endsWith(".java")) {
                        FileReaderGUI gui = new FileReaderGUI(file.getAbsolutePath() + "\\" + DateiListe.getSelectedValue().toString());
                        gui.setBounds(getX() + getWidth(), getY(), getWidth(), getHeight());
                    } else {
                        file.setPath(file.getPath() + DateiListe.getSelectedValue());
                        DateiListe.setListData(file.getOutput());

                        PfadTextfield.setText(file.getPath() + DateiListe.getSelectedValue());

                    }
                }
            }
        });
    }
}
