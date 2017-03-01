package animals_04;

public class Main {

	public static void main(String[] args) {

		Dog dog = new Dog();

		dog.setAge(5);

		Cat cat = new Cat();

		cat.setAge(7);
		
		
		Pet [] pets = {cat, dog};
		
		Pet indexPet = pets[0];
		
		for(int i = 0; i < pets.length; i++){
			
			if(pets[i].getAge() > indexPet.getAge()){
				indexPet = pets[i];
			}
			
		}
		
		System.out.println(indexPet.getAge());
		
		
//		System.out.println(returnPetAge(cat));
//		System.out.println(returnPetAge(dog));

	}
	
	public static int returnPetAge(Pet pet){
		return pet.getAge() *7;
	}
	
	
	
//	public static int returnDogAge(Dog dog){
//		return dog.getAge() *7;
//	}
//	
//	public static int returnCatAge(Cat cat){
//		return cat.getAge() *7;
//	}
	
	

}
