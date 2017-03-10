package core_04;

public class Main {
	
	public static void main(String[] args) {

		Transport transport = Transport.HORSE;
		
		System.out.println(transport.name().toLowerCase());
		
		System.out.println(Transport.BIKE.name().toLowerCase());
		
		System.out.println(transport.ordinal());
		
		Transport [] transports = Transport.values();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		final String sideOfWorld1 = "NORTH";
//		final String sideOfWorld2 = "SOUTH";
//		final String sideOfWorld3 = "EAST";
//		final String sideOfWorld4 = "WEST";
//		
//		side(sideOfWorld1);
//		side(sideOfWorld2);
//		side(sideOfWorld3);
//		side("sdafasda");
		
		
//		side(WorldSide.SOUTH);
//		
//		WorldSide side = WorldSide.NORTH;
//		
//		
//		System.out.println(side);
		
	}
	
//	public static void side(String worldSide){
//		System.out.println("side = "+worldSide);
//	}
	
	public static void side(WorldSide worldSide){
		System.out.println("side = "+worldSide);
	}
	
}
