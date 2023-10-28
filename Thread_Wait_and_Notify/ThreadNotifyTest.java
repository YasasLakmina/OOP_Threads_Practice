package Thread_Wait_and_Notify;

public class ThreadNotifyTest extends Thread{
	public static void main(String[] args) {
		ThreadNotifyTest threadNotify = new ThreadNotifyTest();
		
		Thread1 t1 = new Thread1(threadNotify, "New Thread1");
		Thread2 t2 = new Thread2(threadNotify, "New Thread2");
		
		t1.start();
		t2.start();
		
	}
}
