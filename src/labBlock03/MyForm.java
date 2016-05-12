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

    private JPanel content;



    JPanel rootPanel;



    JTextField firstName;
    JTextField secondName;
    JTextField thirdName;
    JTextField nickName;
    JTextField telHome;
    JTextField telMobile;
    JTextField scype;
    JTextField email;
     JTextField indexTextField;
     JTextField group;
     JButton refreshButton;
     JTextField cityTextField;
     JTextField streetTextField;
     JTextField buildingTextField;
     JTextField appartmentTextField;

    JPanel getContentPanel() {
        return this.content;
    }

    MyForm(){
         super("User Information");
         this.setContentPane(rootPanel);
         pack();
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        group.setName("UserGroupField");
         this.setVisible(true);

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here


    }
}
