package labBlock03;

import javax.swing.*;


public class MyForm extends JFrame{

    JButton submitButton;
    JButton refreshButton;
    private JPanel content;
    private JPanel rootPanel;
    JTextField surName;
    JTextField firstName;
    JTextField thirdName;
    JTextField nickName;
    JTextField telHome;
    JTextField telMobile;
    JTextField scype;
    JTextField email;
    JTextField index;
    JTextField group;
    JTextField city;
    JTextField street;
    JTextField building;
    JTextField appartment;

    JPanel getContentPanel() {
        return content;
    }

    /**
     * Constructor
     */
    MyForm(){
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
