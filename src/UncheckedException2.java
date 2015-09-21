
import javax.swing.*;

public class UncheckedException2 {

    public static void main(String[] args) {
        String[] students = {"Clark Kent", "Natalie Teeger", "Adrian Monk", "Kevin Rudd", "Jessica Tandy"};
        String input = JOptionPane.showInputDialog("Enter index [1.." + students.length + "]");
        
        
        int index = 0;
        try {
            index = Integer.parseInt(input) - 1;
            JOptionPane.showMessageDialog(null, "Student #" + input + ": " + students[index]);
        }
        catch(ArrayIndexOutOfBoundsException ex) {
            JOptionPane.showMessageDialog(null, "Invalid index: " + input, "ERROR", JOptionPane.ERROR_MESSAGE);
        } 
    }
}
