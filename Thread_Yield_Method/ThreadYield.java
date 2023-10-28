package Thread_Yield_Method;

import Thread_Join.ThreadJoin;

public class ThreadYield {
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Starting Executing " + t.getName());
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(t.getName() + " " + i);
		}
		
		System.out.println("Finished executing " + t.getName());
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new ThreadJoin(), "New Thread");
		t.start();
		
		System.out.println("Started executing main thread!!");
		
		//Temporarily stop executing the main thread and give chance to newly created thread
		t.yield();//yield method is use becuase for utilization purposes.
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
		
		System.out.println("Finished executing " + Thread.currentThread().getName());
		
	}
}
