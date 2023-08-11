import java.util.function.Predicate;

public class Predicate_Example {
	
	public static boolean checkAge(int age) {
		return age >= 18;
	}
	
	public static void main(String[] args) {
		
		// using lambda expressions
//		Predicate<Integer> predicate = n -> (n > 18);
//		System.out.println(predicate.test(26));
		
		// using method references
		Predicate<Integer> predicate = Predicate_Example::checkAge;
		System.out.println(predicate.test(16));
		
	}
}

/*
It is a functional interface which represents a predicate (boolean-valued function) of one argument.
It is defined in the java.util.function package and contains test() a functional method.
*/