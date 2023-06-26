import org.json.JSONException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class WeatherUI extends  JFrame {
    private JPanel panel1;
    private JPanel GuiMain;
    private JTextField textField1;
    private JTextArea textArea1;
    private JButton anzeigenButton;

    private String Ort;
    private Weather Wetter;

    public WeatherUI() throws JSONException ,IOException,RuntimeException{

        Wetter = new Weather();
        anzeigenButton.addMouseListener(new MouseListener() {
            @Override
                        public void mouseClicked(MouseEvent e) {


                try {
                    Wetter.setQueryOrt(getOrt());
                    textArea1.setText("Luftdruck : "+Wetter.getLuftdruck() + "\n" +"Luftfeuchte : "+ Wetter.getLuftfeuchte() + "\n" +"Temperatur : "+ Wetter.getTemperatur());
                } catch (JSONException ex) {
                    throw new RuntimeException(ex);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }




            }

                                            @Override
                                            public void mousePressed(MouseEvent e) {

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
                                        }
        );
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ort=textField1.getText();
            }
        });
        setPreferredSize(new Dimension(500,300));
        add(GuiMain);

      //  add(GuiMain);
        setLocation(300,200);

        setVisible(true);
        pack();

    }

    private String getOrt() {


        return Ort;
    }


    public void setOrt(String ort) {
        Ort = ort;
    }

}
