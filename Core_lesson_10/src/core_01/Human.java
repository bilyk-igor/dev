package core_01;

public class Human /*implements Comparable<Human>*/{

	private String name;
	private int age;

	public Human(String name, int age) {
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

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Human other = (Human) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

//	@Override
//	public int compareTo(Human inHuman) {
//
//		if(this.age > inHuman.getAge()){
//			return 1;
//		}else if(this.age < inHuman.getAge()){
//			return -1;
//		}else{
//			return this.name.compareTo(inHuman.getName());			
//		}
//		
////		return this.age - inHuman.getAge();
//		
////		return this.name.compareTo(inHuman.getName());
//		
//		
//	}
	
	

	
	
}
