package java_8_features.interfaces;

interface Phone{
	void call();
	// from 1.8 we can define methods in intwrfaces
	default void sms() {
		System.out.println("sending sms...");
	}
	//static methods are intoduced in java 8 , we can call thsi methods without instace
	static void songs() {
		System.out.println("soongs..");
	}
/** these 3 feaures added in java 8
 * 	Functional Interfaces:
		Functional interfaces are interfaces that contain exactly one abstract method (SAM - Single Abstract Method).
		They can have any number of default or static methods, but only one abstract method. **/
}

class RealMe implements Phone{

	@Override
	public void call() {
		System.out.println("calling..");
		
	}
	
}

public class Interfaces {
	public static void main(String[] args) {
		Phone realme = new RealMe();
		realme.call();
		realme.sms();
		Phone.songs();
		Phone.songs();
		
		
	}

}
