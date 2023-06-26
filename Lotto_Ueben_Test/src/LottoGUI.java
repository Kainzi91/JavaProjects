import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LottoGUI extends JFrame{
    private JTextField textField12;
    private JTextField textField11;
    private JTextField textField10;
    private JTextField textField9;
    private JTextField textField8;
    private JTextField textField7;
    private JTextField textField6;
    private JTextField textField5;
    private JTextField textField4;
    private JTextField textField3;
    private JTextField textField2;
    private JTextField textField1;
    private JPanel JPanelMain;
    private JTextField[] userFields;
    private JTextField[] lottoFields;
    private JCheckBox qickPickCheckBox;
    private JButton playButton;
    private JButton resetButton;
    private JTextArea textAreaResult;
    private JComboBox comboBox1;


    Lotto lotto = new Lotto();
    Vergleich vergleich = new Vergleich();

    Gewinn gewinn = new Gewinn();

    public LottoGUI() {
        setTitle("Lotto");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocation(300, 200);
        add(JPanelMain);

        setVisible(true);

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();

        for(String fontName : fontNames) {
            comboBox1.addItem(fontName);
        }


        userFields = new JTextField[]{textField1, textField2, textField3, textField4, textField5, textField6};
        lottoFields = new JTextField[]{textField7, textField8, textField9, textField10, textField11, textField12};

        playButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                for (JTextField field : userFields) {
                    if (field.getText().isEmpty()) {
                        System.out.println("Bitte füllen Sie alle Felder aus.");
                        return;
                    }
                }
                lotto.getMyZahlen();

                for (int i = 0; i < 6; i++) {
                    lottoFields[i].setText(Integer.toString(lotto.getZufalszahlenFueTextFeld(i)));
                }

                int[] myTipp = new int[6];
                for (int i = 0; i < 6; i++) {
                    myTipp[i] = Integer.parseInt(userFields[i].getText());
                }

                int res = vergleich.derVergleich(lotto.getToVergleich(), myTipp);
                System.out.println("Result:" + res);

                gewinn.setVisible(true);
                gewinn.setTextFieldGewinn(res);
                textAreaResult.append(res + "\n");
            }
        });

        qickPickCheckBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(qickPickCheckBox.isSelected()){
                lotto.getMyZahlen();
                for (int i = 0; i < 6; i++) {
                    userFields[i].setText(Integer.toString(lotto.getZufalszahlenFueTextFeld(i)));
                }
            }else {
                    for (int i = 0; i < 6; i++) {
                        userFields[i].setText("");
                }
        }}});

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < 6; i++) {
                    userFields[i].setText("");
                    lottoFields[i].setText("");
                }
                qickPickCheckBox.setSelected(false);
            }
        });
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFontName = (String)comboBox1.getSelectedItem();
                Font newFont = new Font(selectedFontName, Font.PLAIN, 14); // you can change the style and size as you want
                textAreaResult.setFont(newFont);
            }
        });
        pack();
    }
}
