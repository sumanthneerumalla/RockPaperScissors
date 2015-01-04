import java.util.Scanner;
import java.lang.Math;

public class RockPaperScissors {
	public static void main(String [] args){
	int playerinput, computerinput= 0 , result, looop = 0;
	Scanner input = new Scanner(System.in);
	 
	while (looop == 0 ) {
		
	System.out.println("Welcome to Rock Paper Scissors. This program uses a random number generator to play rock paper scissors.");
	System.out.println("When you are ready enter 1,2, or 3 for Rock Paper Scissors");
	playerinput = (int) input.nextDouble();
	
	
	while (playerinput < 1 || playerinput >= 4) {
		System.out.println("Only enter 1,2, or 3. Nothing greater or smaller than that range.");
		playerinput = (int) input.nextDouble();
		
		}
	if ( playerinput >= 1 || playerinput < 4){
		computerinput = (int) (2.9999 * Math.random() +1);
		}
		//print player move
		if (playerinput == 1) {
			System.out.println("You play: Rock");
		}
		else if ( playerinput == 2){
			System.out.println("You play: Paper");
		}
		else {
			System.out.println("You play: Scissors");
		}		
		//print computer move
		if (computerinput == 1) {
					System.out.println("Computer plays: Rock");
				}
				else if ( computerinput == 2){
					System.out.println("Computer plays: Paper");
				}
				else {
					System.out.println("Computer plays: Scissors");
				}
		
					
		if (computerinput == playerinput){
			result = 3;
		}
		else if (computerinput == 1 && playerinput == 3){
			result = 1;
		}
		else if ( playerinput == 1 && computerinput == 3){
			result = 2;
		}
		else if (computerinput > playerinput){
		result = 1;
		}
		else {
			result = 2;
		}
		switch (result){
		case 1: System.out.println ("Computer wins!");break;
		case 2: System.out.println ("You win!");break;
		case 3: System.out.println ("Tie!");break;
		
		}
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("Enter 0 to play again, press any other number to quit");
		looop = input.nextInt();
		if (looop !=0){
			input.close();
		}
		}
	}}