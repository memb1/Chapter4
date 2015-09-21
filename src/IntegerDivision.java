import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IntegerDivision extends JFrame {
	JTextField jtfNumber1 = new JTextField(3);
	JTextField jtfNumber2 = new JTextField(3);
	JTextField jtfResult = new JTextField(3);
	JButton jbtDivide = new JButton("Divide");
	
  public IntegerDivision() {
  	JPanel jpNorth = new JPanel();
  	jpNorth.add(new JLabel("Number 1"));
  	jpNorth.add(jtfNumber1);
  	jpNorth.add(new JLabel("Number 2"));
  	jpNorth.add(jtfNumber2);
  	jpNorth.add(new JLabel("Result"));
  	jpNorth.add(jtfResult);
  	jtfResult.setEditable(false);
  	
  	add(jpNorth, BorderLayout.NORTH);
  	add(jbtDivide, BorderLayout.SOUTH);
  	
  	jbtDivide.addActionListener(new ActionListener() {
  		public void actionPerformed(ActionEvent e) {
  			int number1 = Integer.parseInt(jtfNumber1.getText());
  			int number2 = Integer.parseInt(jtfNumber2.getText());
  			try {
  				int result = number1 / number2;
  				jtfResult.setText("" + result);
  			}
  			catch(ArithmeticException ex) {
  				System.out.println("ERROR: Division by zero.");
  			}
  		}
  	});
  	
  }
    
  public static void main(String[] args) {
  	IntegerDivision frame = new IntegerDivision();
  	frame.setTitle("IntegerDivision");
  	frame.pack();
  	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  	frame.setLocationRelativeTo(null);
  	frame.setVisible(true);
  }
}

