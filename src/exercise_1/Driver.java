package exercise_1;
 import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		Test test = new Test(); // instantiate new object (called test) of type Test class
		Scanner input = new Scanner(System.in); // scanner input
		//LOCAL VARIABLES
		int question = 1; // for the while loop to start questions from the beginning -
		
		while(question <= 5)// - if while loop cycles through each question until the 5th question -
		{
			test.simulateQuestions(question);// - calls simulateQuestion from the Test class via the (test) object ,to display current question -
			System.out.print("Your answer: "); 
			test.inputAnswer(question, input.nextInt());// - which then calls inputAnswers method for user input of their answer, then that method calls checkAnswer in the Test class, which then calls simulateMessage to display message -
			question++;// then goes onto the next question to repeat the cycle - unless you answered the 5th question, the value will be 6 and it will stop the loop
		}
		test.finalScore();//- and by the end of this multiple choice, call finalScore() to display the results of your knowledge 
	}

}//THE END
