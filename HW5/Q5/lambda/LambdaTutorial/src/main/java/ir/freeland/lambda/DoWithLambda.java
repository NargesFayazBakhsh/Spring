package ir.freeland.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Intermediate Operations:
 * 
 * filter() map() flatMap() distinct() sorted() peek() limit() skip()
 * 
 * Terminal Operations:
 * 
 * forEach() forEachOrdered() toArray() reduce() collect() min() max() count()
 * anyMatch() allMatch() noneMatch() findFirst() findAny()
 * 
 */
public class DoWithLambda {

	public static void main(String[] args) {
// narges fayazbakhsh
		Student narges = new Student("narges", "Fayazbakhsh", 23, 100);
		Student amir = new Student("amir", "Fayazbakhsh", 17, 90);
		Student tasnim = new Student("tasnim", "Fayazbakhsh", 16, 95);
		Student matin = new Student("matin", "Fayazbakhsh", 23, 80);
		Student taha = new Student("taha", "amini", 2, 70);
		Student yasin = new Student("yasin", "amini", 6, 40);
		Student saeed = new Student("saeed", "Fayazbakhsh", 50, 99);
		Student sama = new Student("sama", "sadat", 6, 6);
		Student roya = new Student("roya", "sadat", 15, 4);
		Student nore = new Student("nore", "sadat", 13, 5);
		
		List<Student> students = new ArrayList<>();
		students.add(narges);
		students.add(amir);
		students.add(tasnim);
		students.add(matin);
		students.add(taha);
		students.add(yasin);
		students.add(saeed);
		students.add(sama);
		students.add(roya);
		students.add(nore);

//1. sort grade
		Comparator<Student> compratorComplexGrade = Comparator
				.comparing(Student::getGrade);
		List<Student> student_grade= students
				.stream()
				.sorted(compratorComplexGrade)
				.collect(Collectors.toList());

		System.out.println("sorted by grade: ");
		student_grade.forEach(System.out::println);
		System.out.println();
	
		
//2. reverse sort age
		Comparator<Student> compratorComplexAge = Comparator
				.comparing(Student::getAge)
				.reversed();
		List<Student> student_age= students
				.stream()
				.sorted(compratorComplexAge)
				.collect(Collectors.toList());

		System.out.println("sorted by reversed age: ");
		student_age.forEach(System.out::println);
		System.out.println();

		
//3. PartitioningBy grade
		Map<Boolean, List<Student>> partGrade = 
				students.stream().collect( Collectors.partitioningBy(p -> p.getGrade()>10));
		
		System.out.println("less than 10: "+partGrade.get(false));
		System.out.println("more than 10: "+partGrade.get(true)+"\n");

		
//4. Use group by age
				Map<Integer, List<Student>> groupAge = 
						students.stream().collect(  Collectors.groupingBy(Student::getAge));
				System.out.println("group by age: "+groupAge+"\n");
				

//5. find average of age
		double averageGrade = students
					.stream()
					.mapToDouble(p -> p.getGrade())
					.average()
					.getAsDouble();
		
		System.out.println("Average of Grades :"+averageGrade);
	
		
//6. find average of age plass 18
		double averageGrad18 = students
				    .stream()
				    .filter(t -> t.getAge()>18)
				    .mapToDouble(p -> p.getGrade())
					.average()
					.getAsDouble();
				
				System.out.println("Average Grad of plass 18 year: "+averageGrad18);
	}

}
