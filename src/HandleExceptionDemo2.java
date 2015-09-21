
import javax.swing.*;

public class HandleExceptionDemo2 {

    public static void main(String[] args) {
        boolean validInput = false;
        int number = 0;
        do {
            try {
                String inputTxt = JOptionPane.showInputDialog("Enter an integer");
                number = Integer.parseInt(inputTxt);
                validInput = true;
                JOptionPane.showMessageDialog(null, "The number entered is " + number);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Incorrect input: an integer is required.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            }
        } while (!validInput);
       // JOptionPane.showMessageDialog(null, "The number entered is " + number);
    }
}
