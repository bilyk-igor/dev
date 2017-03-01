package animals_03;

public class Cat extends Pet{

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

//	@Override
//	public void eat() {
//		// TODO Auto-generated method stub
//		super.eat();
//	}
	
	@Override
	public void eat(){
		System.out.println("cat eat");
	}
	
	
	public void eat( int KKall){
		
		
	}
	
	public void eat( int a, String some){
		
		
	}

}
