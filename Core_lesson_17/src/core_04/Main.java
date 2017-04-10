package core_04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {

//		Person person = new Person("antonio", 32, "banderas", 70);
//		
//		Class ref = person.getClass();
//		
//		System.out.println(ref.getSuperclass().getSimpleName());
//	
//		System.out.println();
//
//		Field [] fields = ref.getDeclaredFields();
//		
//		for (Field field : fields) {
//			System.out.println(field.getModifiers());
//		}
//		System.out.println();
//		
//		Method []methods = ref.getDeclaredMethods();
//		
//		for (Method method : methods) {
////			System.out.println(method.getReturnType());
//			System.out.println(method.getName());
//			
//			Parameter [] parameters = method.getParameters();
//			
//			for (Parameter parameter : parameters) {
//				System.out.println(parameter);
//			}
//			System.out.println();
//		}
//		
//		System.out.println();
//		
//		Constructor [] constructors = ref.getConstructors();
//		
//		for (Constructor constructor : constructors) {
//			System.out.println(constructor);
//		}
//		System.out.println();
//		
//		Class [] classes = ref.getInterfaces();
//		
//		for (Class cl : classes) {
//			System.out.println(cl);
//		}
//		
//		System.out.println();
//		
//		Person newPerson = (Person) ref.newInstance();
//		
//		System.out.println(newPerson);
//		System.out.println(person);
//		
//		Field field = ref.getDeclaredField("name");
//		
//		field.setAccessible(true);
//		
//		field.set(person, "petro");
//		
//		System.out.println(person);
		
		Factory factory = new Factory("gmc", Arrays.asList(
				new Auto("mazda", new Engine(300)),
				new Auto("bmw", new Engine(200)),
				new Auto("lada", new Engine(90)),
				new Auto("rover", new Engine(215))));
		
		
		Auto maxAutoPower = factory.getAutos().get(0);
		Auto minAutoPower = factory.getAutos().get(0);
		
		for(Auto currentAuto : factory.getAutos()){
			
			if(currentAuto.getEngine().getPower() > maxAutoPower.getEngine().getPower()){
				maxAutoPower = currentAuto;
			}
			
			if(currentAuto.getEngine().getPower() < minAutoPower.getEngine().getPower()){
				minAutoPower = currentAuto;
			}
			
			
		}
		
		int max = maxAutoPower.getEngine().getPower();
		
		
		maxAutoPower.getEngine().setPower(minAutoPower.getEngine().getPower());
		minAutoPower.getEngine().setPower(max);
		
		
		for (Auto a : factory.getAutos()) {
			System.out.println(a);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
