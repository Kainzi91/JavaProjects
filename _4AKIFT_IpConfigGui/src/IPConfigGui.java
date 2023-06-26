import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IPConfigGui extends JFrame{
    private JPanel panelMain;
    private JButton buttonExit;
    private JComboBox Dropdown;
    private JTextArea AktAdapter;
    private JList listFonts;


    public IPConfigGui() throws HeadlessException {
        add(panelMain);
        setBounds(200,300,100 ,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();

        String [] fonts= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        listFonts.setListData(fonts);
        setVisible(true);


        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
