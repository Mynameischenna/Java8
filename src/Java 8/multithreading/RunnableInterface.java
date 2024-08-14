package multithreading;

class thread1 implements Runnable{

	@Override
	public void run() {
		System.out.println("i am i n runnablke interface run method");
		
	}
	
}

public class RunnableInterface {
	public static void main(String[] args) {
//		
//		Thread t2 = new Thread(new thread1()); // we need to pass the obj of runnable interface in order to create thread
//		t2.start();
		System.out.println("main thread 1");
		Thread t1 =new  Thread(
				()->{
					for (int i = 0; i < 5; i++)
					{
						System.out.println("i am inside lambda expression "+ i);
					}
				}
				);
				
//		t1.setDaemon(true);
		t1.start();
		System.out.println("thread name is "+t1.getName());
		System.out.println("main thread 1");
	}

}
