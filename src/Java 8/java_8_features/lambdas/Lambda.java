package java_8_features.lambdas;

interface MyInterface{
	void method(String name);
}

public class Lambda {
	public static void main(String[] args) {
		
//		MyInterface obj = new MyInterface() { // anonymous inner type
//			
//			@Override
//			public void method(String name) {
//				System.out.println("hello "+name);
//				
//			}
//		};
//		
//		obj.method("chenna");
		
		//lambda expression 
		MyInterface obj = name -> System.out.println("hello boss "+name);
		obj.method("chenna");
		
		
	}

}

/**in general if want to define methods of an interface we 
  were creating a class the implements that interface
then we define methods inside that class and we access 
these methods by creating instance of that class **/
