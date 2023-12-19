package entities;
// Model

import java.util.Date;


public class MemberModel {

    public String name, phoneNumber, age, email, id;
    public boolean isMale,isPublic;
    public int price;
    public Date from, to;

    public MemberModel(String name, String id, boolean isMale,  String age,String phone, String email, boolean isPublic, int price,Date from, Date to) {
        this.name = name;
        this.isMale = isMale;
        this.phoneNumber = phone;
        this.price = price;
        this.age = age;
        this.email = email;
        this.id = id;
        this.from = from;
        this.to = to;
        this.isPublic = isPublic;
        this.price = price;
    }
}
