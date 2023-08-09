import java.util.ArrayList;
import java.util.Iterator;

@FunctionalInterface
interface Calculations {
	//public void Sum(int a, int b);
	public int Multi(int a, int b);
}

public class Lambda {
	public static void main(String[] args) {
		
		// without return type lambda expressions
//		Calculations calculations = (a,b) -> {
//			int c = a + b;
//			System.out.println("Sum is "+c);
//		};
//		calculations.Sum(10, 30);
		
		// with return type lambda expressions
		//Calculations calculations = (a,b) -> a * b; // without return keyword
//		Calculations calculations = (a,b) -> {		// with return keyword
//			return a * b;
//		};
//		System.out.println(calculations.Multi(3, 7));
		
		// lambda with collections
//		ArrayList<String> list = new ArrayList<>();
//		list.add("Tanveer");
//		list.add("Sammer");
//		list.add("Sagar");
//		list.add("Ateeq");
//		list.forEach(n -> System.out.println(n));
		
		// Thread example with lambda expressions
//		Runnable runnable = () -> {
//			for(int i=1;i<=5;i++) System.out.println("Thread is running..."+i);
//		};
//		new Thread(runnable).start();
		
	}
}

/*
Lambda expression is a new and important feature of Java which was included in Java SE 8. 
It provides a clear and concise way to represent one method interface using an expression. 
It is very useful in collection library. It helps to iterate, filter and extract data from collection.

The Lambda expression is used to provide the implementation of an interface which has functional 
interface. It saves a lot of code. In case of lambda expression, we don't need to define the method 
again for providing the implementation. Here, we just write the implementation code.

Java lambda expression is treated as a function, so compiler does not create .class file.

Functional Interface:
Lambda expression provides implementation of functional interface. An interface which has only one 
abstract method is called functional interface. Java provides an annotation @FunctionalInterface, 
which is used to declare an interface as functional interface.
*/

