package core_03;

public class Auto {

	private String brend;
	private int yearOfPublic;
	
	private Engine engine;
	
	
	
	
	public Auto(String brend, int yearOfPublic, Engine engine) {
		super();
		this.brend = brend;
		this.yearOfPublic = yearOfPublic;
		this.engine = engine;
	}
	
	
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getBrend() {
		return brend;
	}
	public void setBrend(String brend) {
		if(brend.equals("lada")){
			
			System.out.println("wrong name");
		}else{			
			
			this.brend = brend;
		}
	}
	public int getYearOfPublic() {
		return yearOfPublic;
	}
	public void setYearOfPublic(int yearOfPublic) {
		this.yearOfPublic = yearOfPublic;
	}


	@Override
	public String toString() {
		return "Auto [brend=" + brend + ", yearOfPublic=" + yearOfPublic + ", engine=" + engine + "] "+super.toString();
	}

	
	
}
