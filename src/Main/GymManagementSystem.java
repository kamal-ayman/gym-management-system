package Main;

import utilities.Network.MySQLConnection;

public class GymManagementSystem {

    public static void main(String[] args) {
        new MySQLConnection();
        new Layout.GMS().setVisible(true);
    }
}
