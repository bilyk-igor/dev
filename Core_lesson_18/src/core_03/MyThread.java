package core_03;

public class MyThread extends Thread{

	public void run(){
		System.out.println(Thread.currentThread().getName());
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i+" ");
		}
	}
	
}
