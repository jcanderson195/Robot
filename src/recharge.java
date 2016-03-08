
public class recharge extends power {

	public void rechargeSource(){
		
		time fiveSecDelay = new time();
		
		System.out.println("Time for a recharge!");
		
		for (int power = 0; power <= 100; power += 10){
			fiveSecDelay.fiveSeconds();
			System.out.println("My power level is " + power);
			
			if (power == 100){
				System.out.println("I'm all juiced up!");
	}
	
	
}
}
}