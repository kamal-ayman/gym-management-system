package entities;
// Model

/**
 *
 * @author kamal
 */

public class AdminModel {

    public String name, phone, password, id, address;
    
    public AdminModel(String name, String id, String phone, String password, String address) {
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.id = id;
        this.address = address;
    }
}
