package core_03;

import java.io.Serializable;

public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3299922198713975365L;
	private String name;
	/*transient*/ private int age;
	private String passport;

	public Person(String name, int age) {
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
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
