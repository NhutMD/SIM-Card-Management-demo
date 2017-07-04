package Notification;

import java.awt.Image;
import java.awt.SystemTray;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;

public class TrayIcon {

    public static SystemTray tray;
    public static java.awt.TrayIcon trayIcon;
    private static boolean Flag = false;

    public static void displayTray(String SIM, String KH) {
        Flag = true;
        tray = SystemTray.getSystemTray();
        Image img = new ImageIcon("src\\Resources\\bill.png").getImage();
        trayIcon = new java.awt.TrayIcon(img, null);
        trayIcon.setImageAutoSize(true);
        try {
            tray.add(trayIcon);
        } catch (Exception ex) {
        }
        trayIcon.displayMessage("HOÀN TẤT GIAO DỊCH", "SIM: " + SIM + "\nK/H: " + KH, java.awt.TrayIcon.MessageType.INFO);
    }

    public static void displayTray(String Note) {
        Flag = true;
        tray = SystemTray.getSystemTray();
        Image img = new ImageIcon("src\\Resources\\account_128.png").getImage();
        trayIcon = new java.awt.TrayIcon(img, null);
        trayIcon.setImageAutoSize(true);
        try {
            tray.add(trayIcon);
        } catch (Exception ex) {
        }
        DateFormat dateFormat = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
        Date date = new Date();
        trayIcon.displayMessage(Note, "VÀO LÚC: " + date, java.awt.TrayIcon.MessageType.INFO);
    }

    public static void onDestroy() {
        if (Flag) {
            tray.remove(trayIcon);
        }
        Flag = false;
    }

}
