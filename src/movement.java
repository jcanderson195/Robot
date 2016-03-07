
public class movement{

	public void travel(){
		
		time twoSecDelay = new time();
		
		for (int feetTraveled = 0; feetTraveled <= 100; feetTraveled += 10){
			twoSecDelay.twoSeconds();
			System.out.println("I have traveled " + feetTraveled + " feet.");
			
			if (feetTraveled == 100){
				System.out.println("I've gone as far as I can go!");
			}
	}
		
	}
	
}
