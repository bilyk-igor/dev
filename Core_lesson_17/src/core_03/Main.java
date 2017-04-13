package core_03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {

		// Person person = new Person("anitnio", 32, "banderas", 70);
		//
		// Class ref = person.getClass();
		//
		// System.out.println(ref.getSuperclass().getSimpleName());
		// System.out.println();
		//
		// Field [] fields = ref.getDeclaredFields();
		//
		// for (Field field : fields) {
		//// System.out.println(field.getType().getSimpleName());
		// System.out.println(field);
		// }
		//
		// System.out.println();
		// Method [] methods = ref.getDeclaredMethods();
		//
		//
		//
		// for (Method method : methods) {
		//// System.out.println(method.getReturnType());
		// System.out.println(method.getName());
		// Parameter[] parameters = method.getParameters();
		//
		// for (Parameter parameter : parameters) {
		// System.out.println(parameter);
		// }
		// System.out.println();
		// }
		// System.out.println();
		//
		// Constructor [] constructors = ref.getDeclaredConstructors();
		//
		// for (Constructor constructor : constructors) {
		// System.out.println(constructor);
		// }
		//
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
				new Auto("suzuki", new Engine(130)), new Auto("bmw", new Engine(300))));

		Auto maxPowerAuto = factory.getAutos().get(0);
		Auto minPowerAuto = factory.getAutos().get(0);

		int power1 = 0;
		int power2 = 0;

		for (Auto currentAuto : factory.getAutos()) {

			if (maxPowerAuto.getEngine().getPower() < currentAuto.getEngine().getPower()) {
				maxPowerAuto = currentAuto;
				power1 = maxPowerAuto.getEngine().getPower();
			}

			if (minPowerAuto.getEngine().getPower() > currentAuto.getEngine().getPower()) {
				minPowerAuto = currentAuto;
				power2 = minPowerAuto.getEngine().getPower();
			}

		}

		System.out.println(maxPowerAuto);
		System.out.println(minPowerAuto);

		int idx = maxPowerAuto.getEngine().getPower();

		maxPowerAuto.getEngine().setPower(minPowerAuto.getEngine().getPower());

		minPowerAuto.getEngine().setPower(idx);

	}
}
