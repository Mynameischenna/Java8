package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class BlockingQueue {
	
	private Queue< Integer> queue ;
	
	private int capacity;
	
	public BlockingQueue(int cap)
	{
		queue = new LinkedList<>();
		capacity = cap;
	}
	
	public boolean add(int element) {
		synchronized (this) {
			if(queue.size()==capacity) {
				
				try {
					this.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			queue.add(element);
			this.notifyAll();
			return true;
		}
		
	}
	
	public int remove() {
		synchronized (this) {
			if(queue.size()==0) {
				try {
					this.wait(); 
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}

			Integer element = queue.poll();
			this.notifyAll();
			return element;
			
		}
		
		
		
	}
}
//stops execution in this this.wait(); (in remove method) line because not elements to delete if any another elements added
//then we put notigy all in add method then our
//wait awakes and try to get lock inorder to execute the remianing lines