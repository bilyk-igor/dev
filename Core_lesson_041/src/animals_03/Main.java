package animals_03;

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.setAge(5);
		
		Cat cat = new Cat();
		
		cat.setAge(7);
		
		
		cat.eat();
		dog.eat();
		
		
		
//		System.out.println(returnPetAge(dog));
//		System.out.println(returnPetAge(cat));
		
		
	}
	
	public static int returnPetAge(Pet pet){
		
		return pet.getAge() *7;
	}
	
	
//	public static int returnDogAge(Dog dog){
//		return dog.getAge() *7;
//	}
//	public static int returnCatAge(Cat cat){
//		return cat.getAge() *7;
//	}
//	
	
	
	
	
}
