package core_01;

public class Main {
	public static void main(String[] args) {

//		User user = new User("role_admindfgsdf");
//
//		Client client = new Client(Role.ROLE_ADMIN);
//
//		System.out.println(Transport.class.getSuperclass());
//
//		Transport bus = Transport.BUS;
//
//		switch (bus) {
//		case BUS: {
//		}
//		case HORSE: {
//		}
//		case PLAIN: {
//		}
//		case TAXI: {
//		}
//		default:
//			break;
//		}

//		Transport tr = Transport.PLAIN;
//		System.out.println(tr.getMaxSpeed());
//		
//		Transport.PLAIN.setMaxSpeed(100);
//		
//		System.out.println(Transport.PLAIN.getMaxSpeed());
//		
//		System.out.println(Transport.PLAIN.equals(Transport.PLAIN));
//		
//		System.out.println(tr.name());
//		
//		System.out.println(tr.ordinal());
		
		
		
		
		Transport [] transports = Transport.values();
		
		Transport maxTransport = transports[1];
		
		for (int i = 0; i < transports.length; i++) {
			
			if(maxTransport.getMaxSpeed() < transports[i].getMaxSpeed()){
				maxTransport = transports[i];
			}
			
		}
		
		System.out.println(maxTransport.name()+" "+maxTransport.getMaxSpeed());
		
		
		
		
		
		
		
	}
}
