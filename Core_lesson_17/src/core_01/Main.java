package core_01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException {

		// Person person = new Person("antonio", 21, "banderas", 66);
		//
		// Class ref = person.getClass();
		//
		// Field [] fields = ref.getDeclaredFields();
		//
		// for (Field field : fields) {
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
		//
		// System.out.println(method.getName());
		//
		// Parameter [] parameters = method.getParameters();
		//
		// for (Parameter parameter : parameters) {
		// System.out.println(parameter);
		// }
		// System.out.println();
		// }
		//
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
		// System.out.println(ref.getSuperclass().getSimpleName());
		//
		// Class[] classes = ref.getInterfaces();
		//
		// for (Class cl : classes) {
		//
		// System.out.println(cl);
		//
		// }
		//
		//
		// Person newPerson = (Person) ref.newInstance();
		//
		// System.out.println(newPerson.hashCode());
		// System.out.println(person.hashCode());
		//
		//
		// System.out.println(newPerson);
		// System.out.println(person);
		//
		//
		//
		//
		// Field field = ref.getDeclaredField("name");
		//
		// field.setAccessible(true);
		//
		// field.set(person, "pavlo");
		//
		// System.out.println(person);
		//

		List<Auto> autos = new ArrayList<Auto>();

		autos.add(new Auto("mazda", new Engine(1000)));
		autos.add(new Auto("bmw", new Engine(100)));
		autos.add(new Auto("lada", new Engine(215)));
		autos.add(new Auto("rover", new Engine(310)));

		Factory factory = new Factory("gmc", autos);

		int max = factory.getAutos().get(0).getEngine().getPower();
		
		int min = factory.getAutos().get(0).getEngine().getPower();

		for (Auto auto : factory.getAutos()) {

			if (max < auto.getEngine().getPower()) {
				max = auto.getEngine().getPower();
			}
			if (min > auto.getEngine().getPower()) {
				min = auto.getEngine().getPower();
			}

		}

		System.out.println(min);
		System.out.println(max);

		Iterator<Auto> iterator = factory.getAutos().iterator();

		while (iterator.hasNext()) {
			Auto currentAuto = iterator.next();

			if (currentAuto.getEngine().getPower() == min) {

				Field field = currentAuto.getClass().getDeclaredField("engine");
				field.setAccessible(true);
				field.set(currentAuto, new Engine(max));

			}

		}

		for (Auto currentAuto : factory.getAutos()) {
			if (currentAuto.getEngine().getPower() == max) {

				Field field = currentAuto.getClass().getDeclaredField("engine");
				field.setAccessible(true);
				field.set(currentAuto, new Engine(min));

			}

		}

		for (Auto auto : autos) {
			System.out.println(auto);
		}
		
	}
}
