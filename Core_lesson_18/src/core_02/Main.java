package core_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
	
	static int counter = 0;
	public static void main(String[] args) throws InterruptedException {

		System.out.println(Thread.currentThread().getName());
	
//		MyThread myThread = new MyThread();
//		
//		myThread.start();
		
//		MyThread myThread1 = new MyThread();
//		
//		myThread1.start();
		
//		
//		Thread thread = new Thread(new MyRunnable());
//		
//		thread.start();
//
//		
//		Thread thread1 = new Thread(new MyRunnable());
//		
//		thread1.start();

		
		
		//		
//		System.out.println(1111111111);
		
		
		
		
//		Thread thread1 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("annon runnable");
//			}
//			
//		});
//		
//		
//		thread1.start();
//		
//		thread1.wait();
//		
//		Thread thread = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				try {
//					FileInputStream fileInputStream = new FileInputStream("asdas");
//					int c;
//					while((c = fileInputStream.read()) != -1){
//						System.out.println();
//					}
//					thread1.notify();
//				} catch (FileNotFoundException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				
//				
//			}
//			
//		});
		
//		thread.start();
		
//		(new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				
//				for (int i = 0; i < 10; i++) {
//					
//					System.out.print(i+" ");
//					
//					try {
//						Thread.currentThread().sleep(1000);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					
//				}
//			
//			}
//			
//		})).start();
		
//		MyThread myThread = new MyThread();
//		myThread.start();
//		
//		myThread.join();
		
		
		
		
//		MyThread myThread1 = new MyThread();
//		myThread1.start();
		
		
		
//		System.out.println(myThread.getThreadGroup());
		
		ScheduledExecutorService service = 
				Executors.newSingleThreadScheduledExecutor();
		
		
		service.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("schedule work "+counter);
				counter++;
				
				if(counter == 5){
					service.shutdown();
				}
			
			}
		}, 5, 2, TimeUnit.SECONDS);
	
		
		
		
		
	}
}
