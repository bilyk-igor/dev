package core_02;

public class Car {

	private String brend;

	public Car(String brend) {
		super();
		this.brend = brend;
	}

	public String getBrend() {
		return brend;
	}

	public void setBrend(String brend) {
		if(brend.equals("lada")){
			
		}else{
			this.brend = brend;			
		}
	}

	@Override
	public String toString() {
		return "Car [brend=" + brend + "]";
	}
	
	
	
	
	
	
}
