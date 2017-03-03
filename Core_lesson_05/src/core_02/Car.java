package core_02;

public abstract class Car {

	private int age;

	public abstract void drive();
	public abstract void stop();
	
	
	public void parking(){
		System.out.println("car parking");
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
