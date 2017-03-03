package core_01;

public abstract class Pet {

	
	private String name;
	private String age;
	
	public abstract void voice();
	public abstract void sleep();
	
	public void eat(){
		System.out.println("pet eat");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	 
	
	
	
	
	
}

