import javax.swing.JOptionPane;

public class U1L04GuessingGame {

	public static void main(String[] args) {
		int computerNum = (int)(Math.random() * 100);
		int userNumber = -1; 
		
while (userNumber != computerNum) {
	do {
		String input = JOptionPane.showInputDialog(null, "Enter your guess from 1 to 100 (if you give up, enter -1) ");
		userNumber = Integer.parseInt(input);
	} while (userNumber > 100 || userNumber < 0);
		if (userNumber < computerNum - 10) { 
			JOptionPane.showMessageDialog (null, "Too low!" );
		}
		if (userNumber > computerNum + 10) {
			JOptionPane.showMessageDialog (null, "Too high!");
		}
		if (userNumber < computerNum + 10 && userNumber > computerNum + 10) {
			JOptionPane.showMessageDialog (null, "You're within 10");
		}
		if (userNumber == computerNum) {
			JOptionPane.showMessageDialog (null, "CORRRRREEEEECCCCCCTTTTT! congrats. ");
		}
		
	
	

}
	}

}
