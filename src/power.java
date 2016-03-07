
public class power {

	public void powerSource(){
		
		time twoSecDelay = new time();
	
		for (int power = 100; power >= 0; power-=10){
			twoSecDelay.twoSeconds();
			System.out.println("My power level is " + power);
			
			if (power == 0){
				System.out.println("I'm all out of juice");
			}
	}
	
	}	
}
