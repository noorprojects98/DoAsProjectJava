import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.util.Scanner;

public class Main {
	
	static String T = "It's an Integer";
	static String F = "Not an Integer";
	static Scanner scan;

	public static void main(String[] args) {
		
		scan = new Scanner(System.in);
			
		int IntInput = scan.nextInt();
			
		if(IntInput == (int) IntInput) {
			System.out.println(T); 
			System.out.println(IntInput);
			try {
				SendTrueNotification();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		} else if(IntInput != (int) IntInput){
				
			System.out.println(F);
			
			try {
				SendFalseNotification();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}	
		
	}
	
	public static void SendTrueNotification() throws AWTException {
		
		SystemTray tray = SystemTray.getSystemTray();

		Image image = Toolkit.getDefaultToolkit().createImage("Icon.png");
		
		TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
		
		trayIcon.setImageAutoSize(true);
		
		trayIcon.setToolTip("DoAs Notification");
		
		tray.add(trayIcon);
		
		trayIcon.displayMessage("It's an Integer", "New Notification", MessageType.INFO);
		
	}
	
	public static void SendFalseNotification() throws AWTException {
		
		SystemTray tray = SystemTray.getSystemTray();

		Image image = Toolkit.getDefaultToolkit().createImage("Icon.png");
		
		TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
		
		trayIcon.setImageAutoSize(true);
		
		trayIcon.setToolTip("DoAs Notification");
		
		tray.add(trayIcon);
		
		trayIcon.displayMessage("It's not an Integer", "New Notification", MessageType.INFO);
		
	}

}
