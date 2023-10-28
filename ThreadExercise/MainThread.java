package ThreadExercise;

public class MainThread extends Thread{
 public static void main(String[] args) {
	ChildThread1 ch1 = new ChildThread1();
	ch1.start();
	
	ChildThread2 ch2 = new ChildThread2();
	ch2.start();
	
	MainThread ch3 = new MainThread();
	ch3.start();
	 
	 
	 for(int i = 0 ; i < 5 ; i++) {
		 System.out.println("Main Thread " + i);
		 try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
 
 public void run() {
	 for(int i = 0 ; i < 5 ; i++) {
		 System.out.println("Child Thread 3 - " + i);
		 try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
 }
}
