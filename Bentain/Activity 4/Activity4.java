import java.util.Scanner;
import javax.swing.JOptionPane;

class DaysOfWeek {
    public static void main(String[] args) {
    	int day;
        day = Interger.parseInt(JOptionPane.showInputDialog("Enter Day: "));
        String msg = "";
        
        switch(day){
            case 0: msg = "Monday"; break;
            case 1: msg = "Tuesday"; break;
            case 2: msg = "Wednesday"; break;
            case 3: msg = "Thursday"; break;
            case 4: msg = "Friday"; break;
            case 5: msg = "Saturday"; break;
            case 6: msg = "Sunday"; break;
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}