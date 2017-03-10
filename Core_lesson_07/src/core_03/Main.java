package core_03;

public class Main {
	public static void main(String[] args) {

		Transport transport = Transport.PLANE;
		
		System.out.println(Transport.class.getSuperclass());
		
		System.out.println(transport);
		
		System.out.println(Transport.PLANE.name().length());
		
		System.out.println(Transport.HORSE.ordinal());
		
		Transport [] transports = Transport.values();
	
		
		
		
		
		Transport current = Transport.values()[0];
		
		for (int i = 0; i < transports.length; i++) {
			
			if(current.getMaxSpeed() < transports[i].getMaxSpeed()){
				current = transports[i];
			}
			
		}
		
		System.out.println(current.name()+" "+current.getMaxSpeed());
		
		
		
		
		
		int maxSpeed = 0;
		String name = "";
		int sumPassengers = 0;
		
		for (int i = 0; i < transports.length; i++) {
			
			if(maxSpeed < transports[i].getMaxSpeed()){
				maxSpeed = transports[i].getMaxSpeed();
				name = transports[i].name();
			}
			sumPassengers = sumPassengers + transports[i].getMaxPassengers();
			
		}
		
		System.out.println(name+ " "+ maxSpeed);
		System.out.println("sum = "+ sumPassengers);
		
		
		
		
		
		
		
		
		
		
		
//		final String side1 = "NORTH";
//		final String side2 = "SOUTH";
//		final String side3 = "EAST";
//		final String side4 = "WEST";
		
//		sideOfWOrld(side1);
//		sideOfWOrld(side2);
//		sideOfWOrld(side3);
//		sideOfWOrld("wefw");
		
//		sideOfWOrld(SideOfWorld.NORTH);
	
	
	}
	
//	public static void sideOfWOrld(String side){
//		
//		System.out.println("side = "+side);
//		
//	}
	
//	public static void sideOfWOrld(SideOfWorld side){
//		
//		System.out.println("side = "+side);
//		
//	}
	
	
}
