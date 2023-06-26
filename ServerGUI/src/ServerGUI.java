import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.net.Socket;

public class ServerGUI extends JFrame{
    private JPanel panel1;
    private JTextArea textArea;
    private JButton button;

    public ServerGUI() throws HeadlessException, IOException {
        add(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(400,200);
        setSize(300,300);
        setVisible(true);

        textArea.setText("warte....");
        // Object server anlegen
        Server server = new Server(12349);
        setTitle("Verbunden :"+server.getIp_adresse()+":"+server.getPort_nummer());

        textArea.append("\nVerbunden\n");


        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
            do {

                String empfangen =new String();
                empfangen=server.getGelesen();
                if (empfangen!=null)
                {
                textArea.append(empfangen);
                server.setGelesen();
                textArea.append((server.getGelesen()));
                }
            }while(1==1);



    }
}
