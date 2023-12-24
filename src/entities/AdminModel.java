package entities;
// Model

/**
 *
 * @author kamal
 */

public class AdminModel {

    public String name, phone, password, address;
    public int id;
    
    public AdminModel(String name, int id, String phone, String password, String address) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.id = id;
        this.address = address;
    }
}
