package exercise_1;
 import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		Test test = new Test();
		Scanner input = new Scanner(System.in);
		
		int question = 1;
		
		while(question <= 5)
		{
			test.simulateQuestions(question);
			System.out.print("Your answer: ");
			test.inputAnswer(question, input.nextInt());
			question++;
		}
		test.finalScore();
	}

}
