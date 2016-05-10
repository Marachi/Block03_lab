package labBlock03;

import javax.swing.*;
import java.awt.*;

/**
 * Created by potaychuk on 04.05.2016.
 */
public class ViewAlt {
    String A = "A";
    String B = "B";
    String C = "C";
    JFrame  jFrame     =new JFrame();
    JPanel  labelPanel =new JPanel();
    JPanel  mainPanel  =new JPanel();
    JPanel  textPanel  =new JPanel();
    JPanel  buttonPanel=new JPanel();

    JButton jButton    =new JButton("Submit");

    JLabel nameFirstLabel =new JLabel("First name: ");
    JLabel nameSecondLabel=new JLabel("Second name: ");
    JLabel nameThirdLabel =new JLabel("Third name: ");
    JLabel nickNameLabel  =new JLabel("Nick-name: ");
    JLabel groupFieldLabel  =new JLabel("Group: ");
    JLabel telHomeLabel =new JLabel("Home tel. number: ");
    JLabel telWorkLabel =new JLabel("Work tel. number: ");
    JLabel scypeLabel =new JLabel("Scype: ");
    JLabel emailLabel =new JLabel("Email: ");
    JLabel adressLabel          =new JLabel("Adress (index, city, street, building, flat): ");


    JTextField nameFirstField =new JTextField(20);
    JTextField nameSecondField=new JTextField();
    JTextField nameThirdFieldx=new JTextField();
    JTextField nickNameField  =new JTextField();
    JTextField groupField  =new JTextField();
    JTextField telHomeField   =new JTextField();
    JTextField telWorkField   =new JTextField();
    JTextField scypeField     =new JTextField();
    JTextField emailField     =new JTextField();
    JTextField adressField     =new JTextField();


    ViewAlt(){
        BorderLayout borderLayout = new BorderLayout();
        mainPanel.setLayout(borderLayout);
        textPanel.setLayout(new GridLayout(0,1,15,15));
        labelPanel.setLayout(new GridLayout(0,1,15,15));
        buttonPanel.setLayout(new GridLayout());
        mainPanel.add(labelPanel, borderLayout.WEST);
        mainPanel.add(textPanel,borderLayout.EAST);
        mainPanel.add(buttonPanel, borderLayout.SOUTH);


        buttonPanel.add(jButton);
        nameFirstField.setSize(50, 10);
        textPanel.add(nameFirstField);
        textPanel.add(nameSecondField);
        textPanel.add(nameThirdFieldx);
        textPanel.add(nickNameField);
        textPanel.add(groupField);
        textPanel.add(telHomeField);
        textPanel.add(telWorkField);
        textPanel.add(scypeField);
        textPanel.add(emailField);
        textPanel.add(adressField);

        labelPanel.add(nameFirstLabel);
        labelPanel.add(nameSecondLabel);
        labelPanel.add(nameThirdLabel);
        labelPanel.add(nickNameLabel);
        labelPanel.add(groupFieldLabel);
        labelPanel.add(telHomeLabel);
        labelPanel.add(telWorkLabel);
        labelPanel.add(scypeLabel);
        labelPanel.add(emailLabel);
        labelPanel.add(adressLabel);

        jFrame.setContentPane(mainPanel);
        jFrame.setSize(900,500);

//        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

