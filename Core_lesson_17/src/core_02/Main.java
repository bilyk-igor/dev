package core_02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {

		// Person person = new Person("antonio", 23, "banderas", 70);
		//
		// Class ref = person.getClass();
		//
		// Field [] fields = ref.getDeclaredFields();
		//
		// for (Field field : fields) {
		//
		//// System.out.println(field.getType().getSimpleName());
		//
		//// System.out.println(field.getModifiers());
		//
		// System.out.println(field);
		//
		// }
		//
		// System.out.println();
		//
		// Method [] methods = ref.getDeclaredMethods();
		//
		// for (Method method : methods) {
		// System.out.println(method);
		// }
		//
		// System.out.println();
		//
		//
		// Constructor [] constructors = ref.getDeclaredConstructors();
		//
		// for (Constructor constructor : constructors) {
		// System.out.println(constructor);
		// }
		//
		// System.out.println(ref.getSuperclass().getSimpleName());
		// System.out.println();
		//
		// Class [] classes = ref.getInterfaces();
		//
		// for (Class cl : classes) {
		// System.out.println(cl);
		// }
		//
		// Person newPerson = (Person) ref.newInstance();
		//
		// System.out.println(newPerson);
		// System.out.println(person);
		//
		//
		// Field field = ref.getDeclaredField("name");
		//
		// field.setAccessible(true);
		//
		// field.set(person, "petro");
		//
		// field.setAccessible(false);
		//
		// System.out.println(person);

		Factory factory = new Factory("gmc", Arrays.asList(new Auto("mazda", new Engine(100)),
				new Auto("bmw", new Engine(200)), new Auto("lada", new Engine(321)), new Auto("oka", new Engine(50))));

		Auto maxPowerAuto = factory.getAutos().get(0);
		Auto minPowerAuto = factory.getAutos().get(0);

		int maxIndex = 0;
		int minIndex = 0;

		for (Auto currentAuto : factory.getAutos()) {

			if (maxPowerAuto.getEngine().getPower() < currentAuto.getEngine().getPower()) {

				maxPowerAuto = currentAuto;

				maxIndex = factory.getAutos().indexOf(currentAuto);
			}

			if (minPowerAuto.getEngine().getPower() > currentAuto.getEngine().getPower()) {

				minPowerAuto = currentAuto;
					
				minPowerAuto = currentAuto;
			}

		}

	}
}
