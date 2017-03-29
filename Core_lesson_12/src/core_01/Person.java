package core_01;

public class Person<T, I extends Number> {

	private T name;
	private I age;

	public Person(T name, I age) {
		super();
		this.name = name;
		this.age = age;
	}

	public T getName() {
		return name;
	}

	public void setName(T name) {
		this.name = name;
	}

	public I getAge() {
		return age;
	}

	public void setAge(I age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
