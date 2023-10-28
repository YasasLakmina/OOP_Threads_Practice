package Thread_Wait_and_Notify;

public class Thread1 extends Thread{

	ThreadNotifyTest object;
	String name;

	public Thread1(ThreadNotifyTest object, String name) {
		super();
		this.object = object;
		this.name = name;
	}
	
	public void run() {
		synchronized(object) {
			System.out.println("Started " + Thread.currentThread().getName() + " wait");
			try {
				object.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			for(int i = 0 ; i < 10 ; i++) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}
		
	}
	
	
	
	 
}
