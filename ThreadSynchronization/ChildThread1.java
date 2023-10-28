package ThreadSynchronization;

public class ChildThread1 extends Thread{
	Document ob;

	public ChildThread1(Document ob) {
		super();
		this.ob = ob;
	}

	public void run() {
		ob.update(ob);
	}
}
