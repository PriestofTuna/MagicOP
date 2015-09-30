import java.util.Scanner;
import javax.swing.JOptionPane;
public class Magic {
public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);
String maniac;
maniac = JOptionPane.showInputDialog("State your entitlement ");
switch (maniac) {
case "Student":
System.out.print("Welcome " + maniac);
break;
case "Administrator":
System.out.print("Welcome " + maniac);
break;
case "Staff":
System.out.print("Welcome " + maniac);
break;
case "Faculty":
System.out.print("Welcome " + maniac);
break;
case "Guest":
System.out.print("Welcome " + maniac);
keyboard.close();
}
}
}
