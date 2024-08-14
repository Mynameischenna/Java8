package multithreading;

public class MainStack {

	public static void main(String[] args) throws InterruptedException {
		Stack s1 = new Stack(10);
//		new Thread(()->{
//			int counter =0;
//			while(++counter<10) {
//				System.out.println("pushed "+s1.push(counter));
//			}
//		
//		},"pusher").start();
//		
////		try {Thread.sleep(2000);}catch(Exception e) {}
//		
//		new Thread(()->{
//			int counter =0;
//			while(++counter<10) {
//				System.out.println("popped  "+s1.pop());
//			}
//		
//		},"popper").start();
		
		
		
		// blockedqueue
		
		BlockingQueue queue = new BlockingQueue(5);
		
		new Thread(()->{
			int c=5;
			for(int i=0;i<5;i++) {
				System.out.println("pushing.."+queue.add(20));
			}
			
		},"pushe1").start();
		
		new Thread(()->{
			int c=5;
			for(int i=0;i<5;i++) {

				System.out.println("popping.."+queue.remove());
			}
			
		},"popper1").start();

	}
	}

// while they are retruning another 
