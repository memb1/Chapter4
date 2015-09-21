import javax.swing.*;

public class TestCircleWithException {

  public static void main(String[] args) {
    try {
      CircleWithException c1 = new CircleWithException(25);
      CircleWithException c2 = new CircleWithException(-25);
      CircleWithException c3 = new CircleWithException(10);
    }
    catch (IllegalArgumentException ex) {
      JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    JOptionPane.showMessageDialog(null, "Number of objects created: " + CircleWithException.getNumberOfObjects());
  }
}
