package animals;

public class Main {
	public static void main(String[] args) {

		Cat cat = new Cat();
		Dog dog = new Dog();
		
//		dog.voice();
//		
//		
//		Cat cat = new Cat();
//		
//		cat.voice();
	
		dog.setAge(5);
		cat.setAge(7);
	
		
		System.out.println(returnPetAge(dog));
		System.out.println(returnPetAge(cat));
		
	}
	
	public static int returnPetAge(Pet pet){
		return pet.getAge() * 5;
	}
	
//	public static int returnDogAge(Dog dog){
//		return dog.getAge() * 5;
//	}
//	public static int returnCatAge(Cat cat){
//		return cat.getAge() * 5;
//	}
	
	
}