import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
	
	int id;
	String name;
	int salary;
	String city;
	
	public Student(int id, String name, int salary, String city) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}
	
	
	
}

public class Stream_API {
	public static void main(String[] args) {
		
//		List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
		
//		List<Integer> list2 = list.stream()
//				.filter(p -> p % 2 == 0)
//				.collect(Collectors.toList());
//		list2.forEach(n -> System.out.println(n));
		
//		List<Integer> list3 = list.stream().map(p -> p * p).collect(Collectors.toList());
//		System.out.println(list3);
		
//		Stream<Integer> numbers = list.stream().map(t -> t * 2);
//		numbers.forEach(n -> System.out.print(n+" "));
		
//		List<Integer> list2 = List.of(3,2,5,7,1,4,6,9,10,8);
//		Stream<Integer> sortedNumbers = list2.stream()
//				.sorted()
//				.filter(p -> p % 2 == 0)
//				.map(p -> p * 2);
//		sortedNumbers.forEach(n -> System.out.print(n+" "));
		
//		String []names = {"Tanveer","Sammer","Sagar","Ateeq","Asif"};
//		List<String> listOfNames = Arrays.asList(names); // 1st way
//		Stream<String> listOfNames = Stream.of(names).filter(p -> p.startsWith("S")); // 2nd way
//		Stream<String> result = listOfNames.stream().filter(p -> p.startsWith("S"));
//		listOfNames.forEach(n -> System.out.println(n));

//		List<String> sortedNames = Stream.of(names).sorted().collect(Collectors.toList());
//		System.out.println(sortedNames);
		
//		ArrayList<Student> students = new ArrayList<>();
//		students.add(new Student(1, "Tanveer", 50000, "Mehrabpur"));
//		students.add(new Student(2, "Sammer", 100000, "Mehrabpur"));
//		students.add(new Student(3, "Sagar", 70000, "Nawabshah"));
//		students.add(new Student(4, "Ateeq", 90000, "Nawabshah"));
//		students.add(new Student(5, "Asif", 30000, "Sakrand"));
//		
//		List<Student> list = students.stream()
//				.sorted((p1 , p2) -> p1.salary - p2.salary)
//				.collect(Collectors.toList());
//		list.forEach(n -> System.out.println(n.id+" "+n.name+" "+n.salary+" "+n.city));
		
		List<Integer> numbers = List.of(4,6,9,2,4);
		int sum = numbers.stream()
				.reduce(0, (a,b) -> a+b);
		System.out.println(sum);
		
	}
	
}