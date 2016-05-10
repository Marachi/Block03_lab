package labBlock03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by potaychuk on 04.05.2016.
 */
public class Controller {

    private View view;
    private Model model;

    Controller(Model model, View view){
        this.view=view;
        this.model=model;
    }
    void processUser(){

        view.form.submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkValid();
            }
        });
        view.form.refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.form.firstName.setEnabled(true);
                view.form.secondName.setEnabled(true);
                view.form.thirdName.setEnabled(true);
                view.form.telHome.setEnabled(true);
                view.form.telMobile.setEnabled(true);
                view.form.email.setEnabled(true);

            }
        });
    }
    void checkValid(){
            if (itemValid(view.form.firstName, view.namePattern)){
                view.form.firstName.setBackground(Color.white);
                view.form.firstName.setEnabled(false);
            }else {
                view.form.firstName.setBackground(Color.pink);
            }

        if (itemValid(view.form.secondName, view.namePattern)){
            view.form.secondName.setBackground(Color.white);
            view.form.secondName.setEnabled(false);
        }else {
            view.form.secondName.setBackground(Color.pink);
        }

        if (itemValid(view.form.thirdName, view.namePattern)){
            view.form.thirdName.setBackground(Color.white);
            view.form.thirdName.setEnabled(false);
        }else {
            view.form.thirdName.setBackground(Color.pink);
        }
        if (itemValid(view.form.telHome, view.telHomePattern)){
            view.form.telHome.setBackground(Color.white);
            view.form.telHome.setEnabled(false);
        }else {
            view.form.telHome.setBackground(Color.pink);
        }
        if (itemValid(view.form.telMobile, view.telMobilePattern)){
            view.form.telMobile.setBackground(Color.white);
            view.form.telMobile.setEnabled(false);
        }else {
            view.form.telMobile.setBackground(Color.pink);
        }
        if (itemValid(view.form.email, view.emailPattern)){
            view.form.email.setBackground(Color.white);
            view.form.email.setEnabled(false);
        }else {
            view.form.email.setBackground(Color.pink);
        }
//        valid=itemValid(view.form.firstName, view.namePattern)&&itemValid(view.form.secondName, view.namePattern)&&
//                itemValid(view.form.thirdName, view.namePattern);
//        return valid;
    }
    boolean itemValid(JFormattedTextField field,Pattern pattern){
        Matcher matcher = pattern.matcher(field.getText());
        return matcher.matches();
    }
}
