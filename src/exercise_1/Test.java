package exercise_1;
import java.util.Random;
import java.util.Scanner;
public class Test {
	//PUBLIC INSTANCE VARIABLE
	Random rand = new Random(); //for the random message
	public int correctAnswers[] = {1,3,2,3,1}; //to display the correct answer in the message after user gets it wrong
	public int score = 0; // to track the score for each question answered correctly
	//EMPTY CONSTRUCTOR
	public Test() {
	}
	//PUBLIC METHODS
	public void simulateQuestions(int question) //to display all 5 questions per loop cycle in the while loop in the Driver class 
	{
		if (question == 1){
		System.out.printf("Question 1: What is the proper way to instantiate an object?%n"
				+ "1) Test test = new Test();%n2) new test = Test();%n3) Test(new test);%n4) new Test() = test;%n");
		}
		if (question == 2){
			System.out.printf("Question 2: How would you make this enum Suits enumeration variable?%n"
					+ "1) new enum Suits [Diamonds, Spades, Hearts, Clubs];();%n2) enum Suits = 'Diamonds', 'Spades', 'Hearts', 'Clubs'();%n3) public enum Suits{Diamonds, Spades, Hearts, Clubs};%n4) public enum Suits[Diamonds, Spades, Hearts, Clubs];%n");
			}
		if (question == 3){
			System.out.printf("Question 3: What is the proper way to instantiate a Scanner input object?%n"
					+ "1) Scanner input = new Scanner(System.out);%n2) Scanner input = new Scanner(System.in);%n3) new Scanner(System.in) = input;%n4) input.Scanner = new Scanner(System.in);%n");
			}
		if (question == 4){
			System.out.printf("Question 4: How would cast a string to integer?%n"
					+ "1) String.valueOf(number);%n2) int cast = [insert string variable];%n3) int num = Integer.parseInt([insert string variable]);%n4) String word = (int) word;%n");
			}
		if (question == 5){
			System.out.printf("Question 5: What is the proper way to declare an array?%n"
					+ "1) int[] anArray;%n2) new int Array = anArray[];%n3) int anArray = new Array[];%n4) anArray = new int[10];%n");
			}
	}

	public void checkAnswer(int question, int answer) //to check the answers for the question after user inputs in inputAnswer method
	{
		if (question == 1 && answer == 1) //if answer correct for that question -
		{
			simulateMessage(true, answer);// - call method to display a message for the correct answer
			this.score += 1;// - and add to the user's score
		}
		else if (question == 2 && answer == 3)
		{
			simulateMessage(true, answer);
			this.score += 1;
		}

		else if (question == 3 && answer == 2)
		{
			simulateMessage(true, answer);
			this.score += 1;
		}

		else if (question == 4 && answer == 3)
		{
			simulateMessage(true, answer);
			this.score += 1;
		}

		else if (question == 5 && answer == 1)
		{
			simulateMessage(true, answer);
			this.score += 1;
		}
		else // if the answer is incorrect, however -
		{
			question--;//this is the current question and its respective value - decremented for the correctAnswers array to display the correct answer (since arrays have items 0 and up, and the question variable is initialized as 1, not 0) for the current question in the simulateMessage method
			simulateMessage(false, correctAnswers[question]); //call method to display message for the incorrect answer 
		}
	}
	public void simulateMessage(boolean correct, int correctAnswer) // to display random response for the correct or incorrect answers
	{
		if(correct == true) // if the answer was "correct" (or true), display a random message for a correct answer
		{
			switch (rand.nextInt(4)) //random variable picks number from 0 - 3, switch statement then checks it and displays a message according to that number
			{
			case 0:
				System.out.printf("Very good!%n%n");
				break;
			case 1:
				System.out.printf("Nice Job!%n%n");
				break;
			case 2:
				System.out.printf("Great!%n%n");
				break;
			case 3:
				System.out.printf("Awesome!%n%n");
				break;			
			}
		}
		else // if answer was incorrect (or false), display random message for an incorrect answer
		{
			switch (rand.nextInt(4)) // same function - random number (0-3), switch statement display message according to number
			{
			case 0:
				System.out.printf("Wrong, answer is %d%n%n", correctAnswer); // and this is where the corrctAnswer array's value comes in to display the correct answer (the correct number)
				break;
			case 1:
				System.out.printf("Ooh, so close. Answer was %d%n%n", correctAnswer);
				break;
			case 2:
				System.out.printf("Sorry, keep trying though. Answer was %d%n%n", correctAnswer);
				break;
			case 3:
				System.out.printf("You win some and lose some, answer is %d%n%n", correctAnswer);
				break;			
			}
		}
	}

	public void inputAnswer(int question, int answer) // method asks for the user's input for the answer to the following question (question number is given by while loop in the constructor
	{
		checkAnswer(question, answer); // then call checkAnswer method to check the answer for the follow question
	}
	
	public void finalScore() // in the end of answering all the questions, Driver class calls finalScore to display the results 
	{
		System.out.printf("Right answers: %d%nWrong answers: %d%nYour score: %.01f%s", this.score, (5-this.score), (((double)this.score / 5)*100),"%");
	}
}
