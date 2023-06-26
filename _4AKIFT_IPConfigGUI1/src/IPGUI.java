import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class IPGUI extends JFrame {
    private JPanel panelMain;
    private JComboBox comboBoxAdapter;
    private JTextArea textAreaInformation;
    private JButton buttonBeenden;
    private IPConfig ipconfig;

    //default Konstruktor
    public IPGUI() {
        //IPAdressen Informationen sammeln
        ipconfig = new IPConfig();
        //Combobox befüllen
        ArrayList<String> adaptername=ipconfig.getAdapterName();
        for(int a=0;a<adaptername.size();a++) comboBoxAdapter.addItem(adaptername.get(a));
        //default index 0
        showInformation(0);
        //Rahmen setzen
        buttonBeenden.setBorder(BorderFactory.createLineBorder(buttonBeenden.getForeground()));
        comboBoxAdapter.setBorder((BorderFactory.createLineBorder(comboBoxAdapter.getForeground())));
        //immer
        setLocation(300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(panelMain);
        pack();
        setVisible(true);

        //Bedienung
        buttonBeenden.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Beendet durch Benutzer");
                System.exit(0);
            }
        });
        comboBoxAdapter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showInformation(comboBoxAdapter.getSelectedIndex());
            }
        });
    }

    private void showInformation(int index){
        ArrayList<String> adapter=ipconfig.getAdapterName();
        ArrayList<String> ip6=ipconfig.getIpv6();
        ArrayList<String> ip4=ipconfig.getIpv4();
        ArrayList<String> subnetmask=ipconfig.getSubnetmask();
        //textArea befüllen
        textAreaInformation.setText(adapter.get(index)+"\n\nVerbindungslokale IPv6-Adresse . :"+ip6.get(index)+"\nIPv4-Adresse ................... :"+ip4.get(index)+"\nSubnetmaske .................... :"+subnetmask.get(index));
        this.pack();
    }
}
