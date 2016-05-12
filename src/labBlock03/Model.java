package labBlock03;

import javax.swing.*;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by potaychuk on 04.05.2016.
 */
public class Model {
    private String name;
    private String firstName;
    private String secondName;
    private String thirdName;
    private String nickName;
    private String group;
    private String telHome;
    private String telMobile;
    private String scype;
    private String email;
    private String adress;
    private String index;
    private String street;
    private String building;
    private String city;
    private String appartment;
    private String date;


    public void createName() {
        name=firstName+" "+secondName.substring(0,1).toUpperCase()+"."+thirdName.substring(0,1).toUpperCase()+".";
    }

    public void createAdress() {
        adress = name+"\n"+street+" "+building +", "+ appartment+"\n"+city+"\n"+index;
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

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName=secondName;
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

    public void setDate() {
        Date curTime = new Date();
        DateFormat dtfrm = DateFormat.getDateInstance();
        this.date = dtfrm.format(curTime);
    }

    public String getDate() {
        return date;
    }
}
