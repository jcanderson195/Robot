
public class Robot_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hi, I'm Toby. I'm a robot with artificial intelligence. Pleasure to meet you.");
		
		movement distanceTraveled = new movement();
		power decrease = new power();
		time fiveSecDelay = new time();
		recharge increasePower = new recharge();
		
		fiveSecDelay.fiveSeconds();
		
		System.out.println("The further I walk, the more my battery decreases.");
		
		fiveSecDelay.fiveSeconds();
		
		distanceTraveled.travel();
		
		fiveSecDelay.fiveSeconds();
		
		decrease.powerSource();
		
		fiveSecDelay.fiveSeconds();
		
		increasePower.rechargeSource();
		
		
		
	}
}
	


