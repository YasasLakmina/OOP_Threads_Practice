package Thread_Join;

public class ThreadJoin extends Thread{
	
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
		
		//Wait for child thread to die and allow execute the other thread
		t.join();
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(Thread.currentThread().getName() + i);
		}
		
		System.out.println("Finished executing " + Thread.currentThread().getName());
		
	}
}
