import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileReader;

public class FileReaderGUI extends JFrame {
    private JPanel PanelReader;
    private JScrollPane FileScrollPan;
    private JTextArea ReadArea;
    private JButton BeendenButton;
    private JPanel ButtonPanel;

    private String Path;

    private DateiLesen file =new DateiLesen();

    public FileReaderGUI(String Path) {

        ReadArea.setForeground(new Color(5,4,65));
        ReadArea.setBorder(BorderFactory.createLineBorder(Color.WHITE, 0));
        System.out.println(Path);
        file.setPfadundname(Path);
        ReadArea.setText(file.getInhalt());
        setTitle("Jfile.iml");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        add(PanelReader);
        setVisible(true);

        BeendenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
