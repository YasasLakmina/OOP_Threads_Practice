package ThreadExercise;

public class ChildThread2 extends Thread{
	public void run() {
		for(int i = 0 ; i < 5 ; i++) {
			 System.out.println("Child Thread 2- " + i);
			 try {
					sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
		}
	}
  }
}
