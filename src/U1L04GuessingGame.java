import javax.swing.JOptionPane;

public class U1L04GuessingGame {

	public static void main(String[] args) {
		int computerNum = (int)(Math.random() * 100);
		int userNumber; 
	do {
		String input = JOptionPane.showInputDialog(null, "Enter your guess from 1 to 100 (if you give up, enter -1) ");
		userNumber = Integer.parseInt(input);
	} while (userNumber < 100 || userNumber > 0); 

	
	}

}
