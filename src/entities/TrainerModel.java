
package entities;
//Trainer Model
public class TrainerModel {
    public String firstName, lastName, phoneNumber, age, email, id;
    public boolean isMale;
    public int experience, workTime;
    
    public TrainerModel(String firstName, String lastName, boolean isMale, String phoneNumber, int experiance, String age, int workTime, String email, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isMale = isMale;
        this.phoneNumber = phoneNumber;
        this.experience = experiance;
        this.age = age;
        this.workTime = workTime;
        this.email = email;
        this.id = id;
    }
}