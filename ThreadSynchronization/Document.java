package ThreadSynchronization;

public class Document {
	
	//we can synchronize entire mthod or we can use synchrnized block
	public synchronized void update(Document ob) {
		
		//synchrnized block
		synchronized(ob){
			//
			//
		}
		
		for(int i=0 ; i < 10 ; i++) {
			System.out.println(Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
