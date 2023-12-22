/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilities;

import java.awt.Toolkit;
import java.awt.Window;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

/**
 *
 * @author kamal
 */
public class SharedFun {
    static public void navigateTo(Window source, JFrame Screen) {
        WindowEvent closeWindow = new WindowEvent(source, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
        Screen.setVisible(true);
    }
}
