package animal;

public class GiantDragon {
	private GiantDragon() {
		
	}
	
	private static GiantDragon instance = new GiantDragon();
	
	private static GiantDragon getInstance() {
		return instance;
	}
}
