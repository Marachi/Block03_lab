package labBlock03;

import org.jetbrains.annotations.NotNull;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    private ArrayList<JTextField> list;
    private View view;
    private Model model;

    /**
     * Constructor
     * @param model
     * @param view
     */
    Controller(Model model, View view){
        this.view=view;
        this.model=model;
        list = new ArrayList<>();

    }

    void processUser() {
        addListener();
        fillList(list, view.form.getContentPanel());

    }

    /**
     *This method adds ActionListener on buttons "Submit" and "Refresh"
     */
    private void addListener(){
        /**
         * This listener checks field's data for valid, and if it is
         * data will be given to model
         */
        view.form.getSubmitButton().addActionListener(e -> {
            validOfAllItems();
            if(checkvalidOfAllItems()) {
                //set data
                model.setSurName(view.form.getSurName().getText());
                model.setFirstNameUser(view.form.getFirstName().getText());
                model.setThirdName(view.form.getThirdName().getText());
                model.setTelHome(view.form.getTelHome().getText());
                model.setTelMobile(view.form.getTelMobile().getText());
                model.setNickName(view.form.getNickName().getText());
                model.setGroup(view.form.getGroup().getText());
                model.setEmail(view.form.getEmail().getText());
                model.setScype(view.form.getScype().getText());
                model.setIndex(view.form.getIndex().getText());
                model.setCity(view.form.getCity().getText());
                model.setStreet(view.form.getStreet().getText());
                model.setBuilding(view.form.getBuilding().getText());
                model.setAppartment(view.form.getAppartment().getText());
                //create name, adress and write a date
                model.createName();
                model.createPostAdress();
                model.setDate();
                model.createAdress();
//
//                view.print(model.getName());
//                view.print(model.getAdress());
//                view.print(model.getDate());
//                view.print(model.getPostAdress());


            }
        });

        /**
         * This method makes fields with valid data enabled for correcting
         */
        view.form.getRefreshButton().addActionListener(e -> {
            for (JTextField j:list) {
                j.setEnabled(true);
            }

        });

    }

    //Utility methods

    /**
     * This method fills list with JTextFields components
     * @param arrayList is list witch will be filled
     * @param jPanel contains JTextFields components
     */
    private void fillList(ArrayList<JTextField> arrayList, JPanel jPanel){
        for (Component c:jPanel.getComponents()) {
            if (c instanceof JTextField){
                arrayList.add((JTextField) c);
            }
        }
    }

    /**
     * This method checks ALL field for valid data
     * @return true if data is valid
     */
    private boolean checkvalidOfAllItems(){
        boolean isAllValid = true;
        for (JTextField aList : list) {
            if (aList.isEnabled()) {
                isAllValid=false;
                break;
            }
        }
        return isAllValid;
    }

    /**
     * This method makes checking by checkItemValid(JTextField field)
     * of ALL text-field on form
     */
    private void validOfAllItems(){
        for (JTextField j:list) {
           checkItemValid(j);
        }

    }

    /**
     * This method checks text field for valid input data
     * @param field will be disabled if input data is valid
     *              else, field's background will be pink
     */
    private void checkItemValid(JTextField field){
        if (field.equals(view.form.getGroup())){
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

    /**
     * This method return Pattern for field, witch is given
     * for method
     * @param field is JTextField on form and contains some data
     * @return pattern for each field
     */
    @NotNull
    private Pattern createPattern(JTextField field){
        if (field.equals(view.form.getSurName())||field.equals(view.form.getFirstName())
                ||field.equals(view.form.getThirdName())) {
            return Pattern.compile(view.NAME_PATTERN);
        }else if (field.equals(view.form.getNickName())){
            return Pattern.compile(view.NICK_PATTERN);
        }else if (field.equals(view.form.getTelHome())){
            return Pattern.compile(view.TEL_HOME_PATTERN);
        }else if (field.equals(view.form.getTelMobile())){
            return Pattern.compile(view.TEL_MOBILE_PATTERN);
        }else if (field.equals(view.form.getEmail())){
            return Pattern.compile(view.EMAIL_PATTERN);
        }else if (field.equals(view.form.getScype())) {
            return Pattern.compile(view.SCYPE_PATTERN);
        }else if (field.equals(view.form.getIndex())) {
            return Pattern.compile(view.INDEX_PATTERN);
        }else if (field.equals(view.form.getCity())) {
            return Pattern.compile(view.CITY_PATTERN);
        }else if (field.equals(view.form.getStreet())) {
            return Pattern.compile(view.STREET_PATTERN);
        }else if (field.equals(view.form.getBuilding())) {
            return Pattern.compile(view.BUILDING_PATTERN);
        }else if (field.equals(view.form.getAppartment())) {
            return Pattern.compile(view.APPARTMENT_PATTERN);
        }
        return Pattern.compile(".*");
    }
}
