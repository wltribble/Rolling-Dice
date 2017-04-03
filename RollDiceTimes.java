import java.util.Scanner;
import java.util.Random;

public class RollDiceTimes {
	public static void main (String[] args) {
		// create a "random" object to give the dice numbers
		Random randomNumber = new Random();
		
		// create a scanner object to take user input
		Scanner keyboard = new Scanner(System.in);
		String rollAgain;
		
		// use a do-while loop to roll the dice before asking again
		do {
			// for=loop to roll 6 times per run
			for (int i=1; i<=6; i++) {
				System.out.println("Rolling the dice..."+i);
				
				// give the dice numbers
				int die1 = randomNumber.nextInt(6) + 1;
				int die2 = randomNumber.nextInt(6) + 1;
				
				// print their values
				System.out.println("Their values are:\n"+die1+"\t"+die2+"\n");
			}
			// ask to roll again
			System.out.print("Roll them again (y = yes)? ");
			rollAgain = keyboard.nextLine();
			rollAgain = rollAgain.toLowerCase();
		} while (rollAgain.equals("y"));
	}
}