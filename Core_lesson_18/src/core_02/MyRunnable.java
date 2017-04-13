package core_02;

public class MyRunnable implements Runnable {

	@Override
	public void run() {

		//// Thread.currentThread().setPriority(10);
		//
		// System.out.println(Thread.currentThread().getName());
		//
		// for (int i = 10; i >= 0; i--) {
		// System.out.print(i+" ");
		// }
		some();

	}

	public static synchronized void some() {

		for (int i = 10; i >= 0; i--) {
			System.out.print(i + " ");
		}

	}

}
