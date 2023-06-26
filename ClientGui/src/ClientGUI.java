import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ClientGUI extends JFrame{
    private JButton sendenButton;
    private JTextField textfield;
    private JTextArea textArea1;
    private JPanel PanelMain;
    private Client  client= new Client("172.16.85.62",12349);



    public ClientGUI() throws HeadlessException {
        add(PanelMain);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(400,200);
        setSize(300,300);
        setVisible(true);

        sendenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                client.setProtokoll(textfield.getText());
            }
        });


        do {
            this.client =new Client("172.16.85.62",12349);
        }while(client==null);



    }
}
