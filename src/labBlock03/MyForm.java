package labBlock03;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Славик on 08.05.2016.
 */
public class MyForm extends JFrame{

    JButton submitButton;

    JPanel content;
    JPanel rootPanel;



    JFormattedTextField firstName;
    JFormattedTextField secondName;
    JFormattedTextField thirdName;
    JFormattedTextField nickName;
    JFormattedTextField telHome;
    JFormattedTextField telMobile;
    JFormattedTextField scype;
    JFormattedTextField email;
    JFormattedTextField adressIndexCityStreetFormattedTextField;
     JTextField group;
     JButton refreshButton;

    public MyForm(){
         super("User Information");
         this.setContentPane(rootPanel);
         pack();
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         this.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here


    }
}
