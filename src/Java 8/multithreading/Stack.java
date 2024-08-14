package multithreading;

public class Stack {

		private int stack[];
		int stackTop;
		
		public Stack(int capacity) {
			stack = new int[capacity];
			stackTop=-1;
		}
		
		public boolean push(int element)  {
			synchronized (stack) {
				
			
			if(isFull()) return false;
			++stackTop;
			try{Thread.sleep(1000);} catch(Exception e) {}
			stack[stackTop]=element;
//			System.out.println(stack[0]+""+stackTop);
			return true;
			}
		}
		
		public int pop() {
			synchronized (stack) {
				
			
			if(isEmpty()) return Integer.MIN_VALUE;
			
			int obj=stack[stackTop];
			stack[stackTop]=Integer.MIN_VALUE;
			try{Thread.sleep(1000);} catch(Exception e) {}
			stackTop--;
			return obj;
			}
		}
		
		public boolean isFull() {
			return stackTop>=stack.length-1;
		}
		public boolean isEmpty() {
			return stackTop<0;
		}
		public void print() {
			if(stackTop<0) {
				System.out.println("no elements to print");
				
			}
			else {
				for(int i=0;i<=stackTop;i++) {
					System.out.println("element is "+stack[i]);
				}
			}
		}
			
}

	


