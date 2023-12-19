package entities;
// Model

public class MemberModel {

    public String name, phoneNumber, age, email, id, s_month, e_month, s_day, e_day;
    public boolean isMale,isPublic;
    public int price;

    public MemberModel(String name, String id, boolean isMale,  String age,String phone, String email, boolean isPrivate, int price,String s_day, String s_month,  String e_day, String e_month) {
        this.name = name;
        this.isMale = isMale;
        this.phoneNumber = phone;
        this.price = price;
        this.age = age;
        this.email = email;
        this.id = id;
        this.e_day = e_day;
        this.e_month = e_month;
        this.s_day = s_day;
        this.s_month = s_month;
        this.isPublic = isPrivate;
        this.price = price;
    }
}
