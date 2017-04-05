package core_01;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Pet implements Externalizable {

	private String name;
	private int age;

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

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		
		Person person = new Person((String)in.readObject(), (int) in.readObject());
		
		System.out.println(person);
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub

		out.writeObject(this.name);
		out.writeObject(this.age);

	}

}
