package animals_04;

public class Cat extends Pet {

	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void eat(int d){
		System.out.println("cat eat");
	}

}