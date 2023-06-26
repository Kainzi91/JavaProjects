import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

public class MainGUI extends JFrame{
    //panel + Layouts
    private JPanel panelMain = new JPanel(new BorderLayout());
    private JPanel panelWest = new JPanel(new FlowLayout());
    private JPanel panelSouth = new JPanel(new FlowLayout());

    private JPanel panelEast = new JPanel(new GridLayout(8,1));
    //button
    private JButton buttonExit = new JButton("Beenden");
    private JButton buttonCancel = new JButton("Abbruch");
    //Eingaben
    private JTextField textNorth = new JTextField();
    private JTextField textValue = new JTextField(6);
    private JLabel textLabelSouth =new JLabel();
    private JLabel labelValue =new JLabel("1 Addieren");

    private  JCheckBox checkboxEast1= new JCheckBox();
    private JCheckBox checkboxEast2= new JCheckBox();
    private JCheckBox checkboxEast3= new JCheckBox();
    private JCheckBox[] checkboxArrayEast= new JCheckBox[3];

    private JList listFonts = new JList();

    private JScrollPane scrollPaneCenter=new JScrollPane(listFonts);

    private String name = new String("");


    private boolean isName= false;

    public MainGUI(){

        setTitle("GUI DEMO");
        setBounds(0,0,1200,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createMenue();


        panelWest.setBackground(new Color(70, 158, 158));
        buttonExit.setBackground(Color.RED);

        panelWest.add(buttonExit, FlowLayout.LEFT);
        panelWest.add(buttonCancel, FlowLayout.LEFT);

        String allFonts[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();


        listFonts.setListData(allFonts);
        //selectMode
        listFonts.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
       // scrollPaneCenter.add(listFonts);

        panelMain.add(scrollPaneCenter,BorderLayout.CENTER);
        panelMain.add(textNorth,BorderLayout.NORTH);
        textNorth.setToolTipText("Namen eingeben");



        panelSouth.add(textLabelSouth, FlowLayout.LEFT);

        panelMain.add(panelWest,BorderLayout.WEST);
        panelMain.add(panelSouth,BorderLayout.SOUTH);

        panelMain.add(panelEast,BorderLayout.EAST);



        for (int i = 0; i < checkboxArrayEast.length ; i++) {
            checkboxArrayEast[i]= new JCheckBox("Checkbox " + (i+1));

            panelEast.add(checkboxArrayEast[i]);
        }

        panelEast.add(checkboxEast1,GridLayout.class);
        checkboxEast1.setText("Checkbox 4");


        panelEast.add(checkboxEast2,GridLayout.class);
        checkboxEast2.setText("Checkbox 5");

        panelEast.add(checkboxEast3,GridLayout.class);
        checkboxEast3.setText("Checkbox 6");
        panelEast.add(textValue,GridLayout.class);
        panelEast.add(labelValue,GridLayout.class);

        textValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Value = "+ textValue.getText());
                try {
                    int iValue = Integer.parseInt(textValue.getText())+1;
                    ;
                    labelValue.setText(textValue.getText() +" + 1  = " + iValue);
                }
                catch (Exception err)
                {
                    System.out.println("Error beim Umwandeln");
                }

            }
        });


        add(panelMain);
        panelSouth.setPreferredSize(new Dimension(600,30));



        textLabelSouth.setText(name);
        setVisible(true);

        setPlattform(this,1);

        //action listener
        textNorth.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setName(textNorth.getText());
                System.out.println(textNorth.getText());
                textLabelSouth.setText(name);

            }
        });

        buttonExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(-1);
            }
        });

        buttonExit.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                buttonExit.setBackground(Color.GREEN);
            }

            @Override
            public void mouseExited(MouseEvent e) {

                    buttonExit.setBackground(Color.RED);

            }
        });
        checkboxEast1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("CB 4 =" + e.getWhen());
            }
        });
        checkboxEast1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                System.out.println("CB 4 State = "+ e.getStateChange());
            }
        });

        listFonts.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if(!e.getValueIsAdjusting()) {
                    System.out.println(new String(listFonts.getSelectedValue().toString()));
                    buttonCancel.setFont(new Font(listFonts.getSelectedValue().toString(), Font.PLAIN,12));
                }
            }
        });





    }
    private void createMenue(){

     JMenuBar menuebar= new JMenuBar();

     this.setJMenuBar(menuebar);
        //Dateimenü
        //Bearbeiten
        JMenu menueDatei= new JMenu("Datei");

        JMenu menueBearbeiten= new JMenu("Bearbeiten");
        JMenuItem itemNeu = new JMenuItem("Neu");
        JMenuItem itemBeenden = new JMenuItem("Beenden");

        JMenuItem itemEinfügen = new JMenuItem("Einfügen");
        JMenuItem itemAusschneiden = new JMenuItem("Ausschneiden");
        menueDatei.add(itemNeu);
        menueDatei.add(itemBeenden);
        menueBearbeiten.add(itemEinfügen);
        menueBearbeiten.add(itemAusschneiden);
        itemBeenden.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Command : "+ e.getActionCommand());
                System.exit(0);
            }
        });
        menuebar.add(menueDatei);
        menuebar.add(menueBearbeiten);



    }
    private void setPlattform(JFrame gui, int platform){

        String plaf="";

        plaf="com.sun.java.swing.plaf.motif.MotifLookAndFeel";
        System.out.println("Platform= " + UIManager.getSystemLookAndFeelClassName().toString());

        try {
            UIManager.setLookAndFeel(plaf);
            SwingUtilities.updateComponentTreeUI(gui);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        SwingUtilities.updateComponentTreeUI(this);

    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


}
