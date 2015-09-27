package exercise_2;

import java.util.Scanner;

public class DiceGame {

	public static Die dice; 
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int guess, die1 = 0, die2 = 0;
		
		//try{ - doesn't work for some reason - makes the guess input not initialize on user input
		System.out.print("Enter a number between 2-12: ");
		guess = input.nextInt();
		System.out.println("______________________________");
		//}
		//catch(Exception e){System.out.printf("%nPlease enter valid data.%n");}
		
		//add the time delay for each roll - print("Rolling...")
		for(int roll = 0; roll < 3; roll++)
		{
		int sum = 0;
		dice = new Die(die1);
		die1 = dice.die;//assign the local variable to the generated number assigned by the constructor
		System.out.println("First Die: " + dice.returnDie(die1));
		sum += die1;
		dice = new Die(die2);
		die2 = dice.die;//assign the local variable to the generated number assigned by the constructor
		System.out.println("Second Die: " + dice.returnDie(die2));
		sum += die2;
		if(sum == guess){
			System.out.printf("_______________%nMatch - %d and %d%nYou win! Thanks for playing!", guess, sum);
			break;
		}
		if(roll == 2)
		{
			System.out.printf("Sum: %d%n%n", sum);
			System.out.println("No Match - Game Over. Try Again.");
			break;
		}
		System.out.printf("Sum: %d%n%n", sum);
		}
		//another delay for new rolls
	}

}
