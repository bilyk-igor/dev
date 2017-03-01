package animals;

public class Pet extends Animal{

	private String name;
	private int age;
	
	public Pet() {
		// TODO Auto-generated constructor stub
	}
	
	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void voice(){
		System.out.println("animal voice");
	}
	
	public void voice(String some, int a){
		System.out.println("animal voice");
	}
	public void voice(int a,String some){
		System.out.println("animal voice");
	}
	
	
	
	
	
	
	
	
}
