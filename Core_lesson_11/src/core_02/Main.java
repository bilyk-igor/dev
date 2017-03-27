package core_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		// Map<Integer, String> map = new HashMap<>();
		//
		// map.put(10, "ten");
		// map.put(20, "twenty");
		// map.put(30, "thirty");
		// map.put(40, "fourty");
		//
		// System.out.println(map.values());
		//
		// Set<Entry<Integer, String>> set = map.entrySet();
		//
		// for(Entry<Integer, String> en : set ){
		//
		//// System.out.println(en);
		//
		// }

		// Map<Person, Job> map = new HashMap<>();
		//
		// map.put(new Person("anton", 12), new Job("driver", 1000));
		// map.put(new Person("ira", 30), new Job("builder", 5000));
		// map.put(new Person("petro", 50), new Job("president", 10000));
		//
		//
		//// Set<Entry<Person, Job>> set = map.entrySet();
		//
		// String nameJob = map.values().iterator().next().getName();
		// int maxPayment = map.values().iterator().next().getPayment();
		//
		//
		// for(Job job : map.values()){
		// if(maxPayment < job.getPayment()){
		// System.out.println(job);
		// nameJob = job.getName();
		// maxPayment = job.getPayment();
		// }
		// }
		//
		// System.out.println(nameJob+" "+maxPayment);

		Map<Job, List<Person>> map = new HashMap<>();

		List<Person> list = new ArrayList<>();

		list.add(new Person("igor", 23));
		list.add(new Person("ira", 32));

		map.put(new Job("driver", 10000), list);
		map.put(new Job("president", 100000), Arrays.asList(new Person("petro", 55), new Person("vitja", 60)));

		Set<Entry<Job, List<Person>>> set = map.entrySet();

		int maxAges = 0;
		int currentAges = 0;
		String jobName = "";

		for (Entry<Job, List<Person>> entry : set) {

			for (Person p : entry.getValue()) {

				currentAges = currentAges + p.getAge();

			}

			if (currentAges > maxAges) {
				maxAges = currentAges;
				jobName = entry.getKey().getName();
			}

			currentAges = 0;
		}

		System.out.println(jobName + " " + maxAges);

	}

}
