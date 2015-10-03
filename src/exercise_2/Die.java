package exercise_2;

import java.security.SecureRandom;

public class Die {

	//PUBLIC INSTANCE VARIABLES
	public int die;
	
	//CONSTRUCTOR~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public Die() {
		
		SecureRandom randomDie = new SecureRandom();
		this.die = randomDie.nextInt(6) + 1;
		
	}
	
	//PUBLIC METHODS
	public int returnDie(int die){
		return die;
	}

}
