import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuessingGame extends JFrame {
	private JTextField txtGuess; // text field for the users guess
	private JLabel lblOutput;   // labels for too high/ low output
	private int theNumber;      // the number we're trying to guess
	
	public void checkGuess() { // method / function to check too high or too low
		// get the user's guess
		String guessText = txtGuess.getText();
		String message = "";
		
		try { 					// handling errors and exceptions 
			
			
			
			// check the guess for too high/ too low
			int guess = Integer.parseInt(guessText);
			
			// too high
			if (guess > theNumber)
			{
				message = guess + " was too high. Guess Again!";
				lblOutput.setText(message);
			}
			// too low
			else if (guess < theNumber)
			{
				message = guess + " was too low. Guess again!";
				lblOutput.setText(message);
			}
			else // guessed correctly 
			{
				message = guess + " was right! You win! Let's play again!";
				lblOutput.setText(message);
				newGame();
			}
		}
		catch (Exception e){ 				// handling errors and exceptions 
			lblOutput.setText("Enter a whole number between 1 and 100.");
		}
		
		finally{							// handling errors and exceptions 
			txtGuess.requestFocus(); // blinking cursor 
			txtGuess.selectAll();    // automatically selects all inside the text field 
		
		}
	}
	
	public void newGame() { // create a new random number 1..100
		
		theNumber = (int)(Math.random()*100 + 1);
		
	}
		
	public GuessingGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblJamesAaronsHilo = new JLabel("James Aaron's Hi-Lo Guessing Game");
		lblJamesAaronsHilo.setFont(new Font("Lucida Grande", Font.BOLD, 15));
		lblJamesAaronsHilo.setBounds(6, 32, 450, 16);
		lblJamesAaronsHilo.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblJamesAaronsHilo);
		
		JPanel panel = new JPanel();
		panel.setBounds(62, 89, 360, 29);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblGuessANumber = new JLabel("Guess a number between 1 and 100:");
		lblGuessANumber.setBounds(31, 5, 228, 16);
		panel.add(lblGuessANumber);
		
		txtGuess = new JTextField();
		txtGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		txtGuess.setBounds(273, 0, 56, 26);
		panel.add(txtGuess);
		txtGuess.setColumns(10);
		
		JButton btnGuess = new JButton("Guess!");
		btnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkGuess();
			}
		});
		btnGuess.setBounds(148, 159, 117, 29);
		getContentPane().add(btnGuess);
		
		lblOutput = new JLabel("Enter a number above and click Guess!");
		lblOutput.setHorizontalAlignment(SwingConstants.CENTER);
		lblOutput.setBounds(42, 229, 352, 16);
		getContentPane().add(lblOutput);
	}

	public static void main(String[] args) {
		
		GuessingGame theGame = new GuessingGame();
		theGame.newGame();
		theGame.setSize(new Dimension(430, 330));
		theGame.setVisible(true);
		
	}
}
