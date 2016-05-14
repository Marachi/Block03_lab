package labBlock03;

import java.text.DateFormat;
import java.util.Date;


public class Model {
    private String name;
    private String surName;
    private String firstNameUser;
    private String thirdName;
    private String nickName;
    private String group;
    private String telHome;
    private String telMobile;
    private String scype;
    private String email;
    private String adress;
    private String postAdress;
    private String index;
    private String street;
    private String building;
    private String city;
    private String appartment;
    private String date;


    public void createName() {
      name=surName.substring(0,1).toUpperCase() + surName.substring(1).toLowerCase()+" "
              + firstNameUser.substring(0,1).toUpperCase()+"."+thirdName.substring(0,1).toUpperCase()+".";
    }

    public void createPostAdress() {
        postAdress = name+"\n"+street+" "+building +", "+ appartment+"\n"+city+"\n"+index;
    }

    public void createAdress() {
        adress = "Name: "+name+"\n"+"Nickname: " +nickName +"\n"+"Group: "+group+"\n"+"Home tel.: "  + telHome+"\n" +
                "Mobile tel.: " + telMobile+"\n"+"Scype: " + scype+"\n" + "Email: " + email;
    }

    /**
     *Setters and Getters
     */

    public void setNickName(String nickName) {
        this.nickName=nickName;
    }

    public void setTelHome(String telHome) {
        this.telHome=telHome;
    }

    public void setTelMobile(String telMobile) {
        this.telMobile=telMobile;
    }

    public void setScype(String scype) {
        this.scype=scype;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public void setAppartment(String appartment) {
        this.appartment=appartment;
    }

    public void setIndex(String index) {
        this.index=index;
    }

    public void setStreet(String street) {
        this.street=street;
    }

    public void setBuilding(String building) {
        this.building=building;
    }

    public void setCity(String city) {
        this.city=city;
    }

    public void setSurName(String surName) {
        this.surName=surName;
    }

    public void setFirstNameUser(String firstNameUser) {
        this.firstNameUser=firstNameUser;
    }

    public void setThirdName(String thirdName) {
        this.thirdName=thirdName;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getPostAdress() {
        return postAdress;
    }

    public void setDate() {
        Date curTime = new Date();
        DateFormat dtfrm = DateFormat.getDateInstance();
        this.date = dtfrm.format(curTime);
    }

    public String getDate() {
        return date;
    }

    public void setGroup(String group) {
        this.group=group;
    }
}
