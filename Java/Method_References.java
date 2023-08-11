@FunctionalInterface
interface Animal {
	void Dog();
}

@FunctionalInterface
interface Messageable {
	Message getMessage();
}

class Message {
	public Message() {
		System.out.println("Hello from Construtor");
	}
}

public class Method_References {
	
	public static void DogColor() {
		System.out.println("Dog color is 'Black'");
	}
	
	public void DogAge() {
		System.out.println("Age: 2 Years");
	}
	
	public void Message() {
		System.out.println("Run Method is running...");
	}
	
	public static void main(String[] args) {
		
		// using lambda expressions
//		Animal animal = () -> System.out.println("Dog is barking...");
//		animal.Dog();
		
//		// Reference to a Static Method
//		Animal animal = Method_References::DogColor;
//		animal.Dog();
		
		// Reference to an Instance Method
//		Method_References obj = new Method_References();
//		Animal animal = obj::DogAge;
		// Referring non-static method using anonymous object
//		Animal animal = new Method_References()::DogAge;   
//		animal.Dog();
		
		/*In the following example, we are referring instance (non-static) method. 
		Runnable interface contains only one abstract method. So, we can use it as functional interface.*/
//		Thread t1 = new Thread(new Method_References()::Message);
//		t1.start();
		
		// Reference to a Constructor
		Messageable message = Message::new;
		message.getMessage();
		
	}
	
}
/*
Java provides a new feature called method reference in Java 8. Method reference is used to refer 
method of functional interface. It is compact and easy form of lambda expression. Each time when 
you are using lambda expression to just referring a method, you can replace your lambda expression
with method reference.
 
There are following types of method references in java:
Reference to a static method.
Reference to an instance method.
Reference to a constructor.
 */

