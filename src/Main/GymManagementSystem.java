package Main;

import Home.HomeScreen;
import static entities.global.Global.mySQLConnection;

public class GymManagementSystem {

    public static void main(String[] args) {
        if (!mySQLConnection.InitMySQLConnection()) return;
        
        if (mySQLConnection.isLoginFun()) {
            new HomeScreen().setVisible(true);
        } else {
            new Layout.GMS().setVisible(true);
        }
    }
}   
