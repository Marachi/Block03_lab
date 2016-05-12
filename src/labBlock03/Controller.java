package labBlock03;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by potaychuk on 04.05.2016.
 */
public class Controller {

    private ArrayList<JTextField> list;
    private View view;
    private Model model;

    Controller(Model model, View view){
        this.view=view;
        this.model=model;
        list = new ArrayList();
    }

    void processUser() {
        addListener();
        fillList(list, view.form.getContentPanel());
    }

    private void addListener(){

        view.form.submitButton.addActionListener(e -> {
            checkValidOfAllItems();

        });
        view.form.refreshButton.addActionListener(e -> {
            for (JTextField j:list) {
                j.setEnabled(true);
            }

        });

    }

    private void fillList(ArrayList<JTextField> arrayList, JPanel jPanel){
        for (Component c:jPanel.getComponents()) {
            if (c instanceof JTextField){
                arrayList.add((JTextField) c);
            }
        }
//        for (JTextField j:arrayList){
//            System.out.println(j.getName());
//        }
    }

    private void checkValidOfAllItems(){
        for (JTextField j:list) {
           checkItemValid(j);
        }

    }

    private   void checkItemValid(JTextField field){
        if (field.equals(view.form.group)){
            if (field.getText().equals(UserGroup.A.name())|field.getText().equals(UserGroup.B.name())
                    |field.getText().equals(UserGroup.C.name())){

                field.setBackground(Color.white);
                field.setEnabled(false);
            }else {
                field.setBackground(Color.pink);
            }
        }else {
            Matcher matcher = createPattern(field).matcher(field.getText());
            if (matcher.matches()) {
                field.setBackground(Color.white);
                field.setEnabled(false);
            } else {
                field.setBackground(Color.pink);
            }
        }
    }

    @NotNull
    private Pattern createPattern(JTextField field){
        if (field.equals(view.form.firstName)||field.equals(view.form.secondName)||field.equals(view.form.thirdName)) {
            return Pattern.compile(view.NAME_PATTERN);
        }else if (field.equals(view.form.nickName)){
            return Pattern.compile(view.NICK_PATTERN);
        }else if (field.equals(view.form.telHome)){
            return Pattern.compile(view.TEL_HOME_PATTERN);
        }else if (field.equals(view.form.telMobile)){
            return Pattern.compile(view.TEL_MOBILE_PATTERN);
        }else if (field.equals(view.form.email)){
            return Pattern.compile(view.EMAIL_PATTERN);
        }else if (field.equals(view.form.scype)) {
            return Pattern.compile(view.SCYPE_PATTERN);
        }else if (field.equals(view.form.indexTextField)) {
            return Pattern.compile(view.INDEX_PATTERN);
        }else if (field.equals(view.form.cityTextField)) {
            return Pattern.compile(view.CITY_PATTERN);
        }else if (field.equals(view.form.streetTextField)) {
            return Pattern.compile(view.STREET_PATTERN);
        }else if (field.equals(view.form.buildingTextField)) {
            return Pattern.compile(view.BUILDING_PATTERN);
        }else if (field.equals(view.form.appartmentTextField)) {
            return Pattern.compile(view.APPARTMENT_PATTERN);
        }
        return Pattern.compile(".*");
    }

}
