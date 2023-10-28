package ThreadSynchronization;

public class ChildThread2 extends Thread{
	Document ob;

	public ChildThread2(Document ob) {
		super();
		this.ob = ob;
		
	}
	
	public void run() {
		ob.update(ob);
	}
}