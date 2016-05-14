package labBlock03;

import javax.swing.*;


public class MyForm extends JFrame{

    private JButton submitButton;
    private JButton refreshButton;
    private JPanel content;
    private JPanel rootPanel;
    private JTextField surName;
    private JTextField firstName;
    private JTextField thirdName;
    private JTextField nickName;
    private JTextField telHome;
    private JTextField telMobile;
    private JTextField scype;
    private JTextField email;
    private JTextField index;
    private JTextField group;
    private JTextField city;
    private JTextField street;
    private JTextField building;
    private JTextField appartment;

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

    //Getters & Setters
    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }

    public JButton getRefreshButton() {
        return refreshButton;
    }

    public void setRefreshButton(JButton refreshButton) {
        this.refreshButton = refreshButton;
    }

    public JPanel getContent() {
        return content;
    }

    public void setContent(JPanel content) {
        this.content = content;
    }

    public JTextField getSurName() {
        return surName;
    }

    public void setSurName(JTextField surName) {
        this.surName = surName;
    }

    public JTextField getFirstName() {
        return firstName;
    }

    public void setFirstName(JTextField firstName) {
        this.firstName = firstName;
    }

    public JTextField getThirdName() {
        return thirdName;
    }

    public void setThirdName(JTextField thirdName) {
        this.thirdName = thirdName;
    }

    public JTextField getNickName() {
        return nickName;
    }

    public void setNickName(JTextField nickName) {
        this.nickName = nickName;
    }

    public JTextField getTelHome() {
        return telHome;
    }

    public void setTelHome(JTextField telHome) {
        this.telHome = telHome;
    }

    public JTextField getTelMobile() {
        return telMobile;
    }

    public void setTelMobile(JTextField telMobile) {
        this.telMobile = telMobile;
    }

    public JTextField getScype() {
        return scype;
    }

    public void setScype(JTextField scype) {
        this.scype = scype;
    }

    public JTextField getEmail() {
        return email;
    }

    public void setEmail(JTextField email) {
        this.email = email;
    }

    public JTextField getIndex() {
        return index;
    }

    public void setIndex(JTextField index) {
        this.index = index;
    }

    public JTextField getGroup() {
        return group;
    }

    public void setGroup(JTextField group) {
        this.group = group;
    }

    public JTextField getCity() {
        return city;
    }

    public void setCity(JTextField city) {
        this.city = city;
    }

    public JTextField getStreet() {
        return street;
    }

    public void setStreet(JTextField street) {
        this.street = street;
    }

    public JTextField getBuilding() {
        return building;
    }

    public void setBuilding(JTextField building) {
        this.building = building;
    }

    public JTextField getAppartment() {
        return appartment;
    }

    public void setAppartment(JTextField appartment) {
        this.appartment = appartment;
    }
}
