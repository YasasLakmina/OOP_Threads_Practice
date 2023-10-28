package ThreadSynchronization;

public class MainThread {
	public static void main(String[] args) {
		Document ob = new Document();
		
		ChildThread1 ob1 = new ChildThread1(ob);
		ChildThread2 ob2 = new ChildThread2(ob);
		
		ob1.start();
		ob2.start();
		
	}
}
