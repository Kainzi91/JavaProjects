import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class RegisterGUI extends JFrame {
    private JPanel PanelMain;
    private JTextField txtFieldFirst;
    private JTextField txtFieldPhone;
    private JTextField txtFieldFax;
    private JTextField txtFieldEmail;
    private JTextField txtFieldCompany;
    private JTextField txtFieldWorkPhone;
    private JTextField txtFieldWorkFax;
    private JCheckBox checkMarried;
    private JTextField txtFieldLast;
    private JPanel ButtonField;
    private JButton ButtonExit;
    private JButton ButtonRegister;
    private JButton ButtonPrint;

    public RegisterGUI() {



        ArrayList<Person> Personlist=new ArrayList<Person>();

        setBounds(300,300 ,500,300);
        setPreferredSize(new Dimension(400,300));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(PanelMain);
        setVisible(true);

        ButtonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        ButtonRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                Person AktPerson=new Person(txtFieldFirst.getText(),txtFieldLast.getText(),checkMarried.isSelected(),txtFieldPhone.getText(),txtFieldFax.getText(),txtFieldEmail.getText(),txtFieldCompany.getText(),txtFieldWorkPhone.getText(),txtFieldWorkFax.getText());

                JOptionPane optionPane = new JOptionPane("Person wurde registriert",
                        JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = optionPane.createDialog("Registrierung erfolgreich");

                dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
                dialog.setLocation(getLocation().x+ getWidth() ,getLocation().y);
                dialog.setVisible(true);


                if ((int) optionPane.getValue() == JOptionPane.OK_OPTION) {
                    // Schließe den Dialog
                    dialog.dispose();
                }


                //hallo.showMessageDialog(dialog,"Person wurde registriert");

                Personlist.add(AktPerson);

            }
        });
        ButtonPrint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (Person person:Personlist) {
                    System.out.println(person.toString());


                }
                PrintGUI hui = new PrintGUI(Personlist);
                hui.setLocation(getLocation().x+ getWidth() ,getLocation().y);
            }
        });
    }
}
