package Thread_Wait_and_Notify;

public class Thread2 extends Thread{
	ThreadNotifyTest object;
	String name;
	
	public Thread2(ThreadNotifyTest object, String name) {
		super();
		this.object = object;
		this.name = name;
	}
	
	public void run() {
		synchronized(object) {
			System.out.println(Thread.currentThread().getName() + " notify Thread");
			object.notify();
		}
	}


}
