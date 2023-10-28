package Thread_Implementation;

public class ChildThread2 extends Thread{
	public void run() {
		for(int x=0 ; x < 10 ; x++) {
			System.out.println("Second Child thread " + x);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
