package multithreading;

//class thread1 extends Thread{
//	
//} 

public class ExtendsThread {
	
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println(" i am in thread1 class");
			}
		};
		t1.start();
	}

}
