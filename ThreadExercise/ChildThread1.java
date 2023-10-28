package ThreadExercise;

public class ChildThread1 extends Thread{
	public void run() {
		ChildThread2 ob = new ChildThread2();
		ob.start();
		
		for(int i = 0 ; i < 5 ; i++) {
			 System.out.println("Child Thread 1- " + i);
			 try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		}
	}
  }
}
