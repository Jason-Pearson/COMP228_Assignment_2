package exercise_2;

import java.security.SecureRandom;

public class Die {

	//PUBLIC INSTANCE VARIABLES
	public int die;
	
	//CONSTRUCTOR~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public Die(int die) {
		
		SecureRandom randomDie = new SecureRandom();
		die = randomDie.nextInt(6) + 1;
		
		this.die = die;
	}
	
	//PUBLIC METHODS
	public int returnDie(int die){
		return die;
	}

}
