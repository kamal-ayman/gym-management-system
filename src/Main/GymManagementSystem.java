package Main;

import utilities.MySQLConnection;

public class GymManagementSystem {

    public static void main(String[] args) {
        new MySQLConnection();
        new Layout.GMS().setVisible(true);
    }
}
