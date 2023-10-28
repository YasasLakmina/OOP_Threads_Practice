package Thread_Implementation;

public class MyMain {
	public static void main(String[] args) {
		
		//Creating the child thread object
		ChildThread thread1  = new ChildThread();
		
		//thread1.run(); We do not invoke the run method we use the strat method
		thread1.start();//invoke the child thread
		
		ChildThread2 thread2 = new ChildThread2();
		thread2.start();
		
		for(int x=0 ; x < 10 ; x++) {
			System.out.println("Main thread " + x);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
