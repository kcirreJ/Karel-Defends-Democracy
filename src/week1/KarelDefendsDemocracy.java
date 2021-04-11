package week1;
import stanford.karel.*;

public class KarelDefendsDemocracy extends SuperKarel {
	
	
	

	public void run() {
		
		while (frontIsClear())
		{
			checkBallot();}
		}
		
	public void checkBallot() {
				//moves on if the the rectangle has a beeper in the center
				//or clears the rest of the rectangle
		move();
		
		if (beepersPresent())
		{
			move();
		}
		else
		{
			cleanBallot();}
		}
			
			public void cleanBallot() {
						//removes all beepers from the north and south of the rectangle
						//then moves out of the rectangle
				turnLeft();
				move();
				
				while (beepersPresent())
				{
					pickBeeper();
				}
				
				turnAround();
				move();
				move();
				
				while (beepersPresent())
				{
					pickBeeper();
				}
				
				turnAround();
				move();
				turnRight();
				move();
			}
	}
