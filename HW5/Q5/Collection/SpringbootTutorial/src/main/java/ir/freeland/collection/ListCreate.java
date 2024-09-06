package ir.freeland.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import ir.freeland.collection.model.Address;
import ir.freeland.collection.model.Person;


public class ListCreate {
	public static void main(String[] args) {

		
		Address address1 = new Address();
		address1.setCountry("Iran");
		address1.setCity("Tehran");
		address1.setStreet("Tajrish");
		
		Person Tasnim = new Person("Tasnim","FayazBakhsh", address1, 17);

// narges fayazbakhsh	
		
		Address address2 = new Address();
		address2.setCountry("Iran");
		address2.setCity("Tehran");
		address2.setStreet("Salimi");
		
		Person Amirhossein = new Person("Amirhossein","FayazBakhsh", address2, 18);
		
		
		Address address3 = new Address();
		address3.setCountry("Iran");
		address3.setCity("Tehran");
		address3.setStreet("Ozgole");
		
		Person Taha = new Person("Taha","Amini", address3, 2);
		
		
		Address address4 = new Address();
		address4.setCountry("Iran");
		address4.setCity("Tehran");
		address4.setStreet("Dolat");
		
		Person Mahla = new Person("Mahla","Amini", address4, 5);

		
//add		
		//Solution 1
		List <Person> persons = new ArrayList<>();		
		persons.add(Tasnim);
		persons.add(Amirhossein);
		persons.add(Taha);
		persons.add(Mahla);

		System.out.println("persons list:");
		persons.forEach(System.out::println);
		
		//Solution 2
		Person[] presonsArray = {Tasnim,Amirhossein,Taha,Mahla};
		List personss= Arrays.asList(presonsArray);


		persons.size();
			
		List<Person> childs = persons.subList(2, 3);
		System.out.println("\n"+"subList: "+childs+"\n");

		
// remove
		persons.remove(0);
		
//		persons.clear();
		
		
		// first approach use for
		for (Person personA : persons) {
			if (personA.getName().equals("Taha")) {
				System.out.println("find Taha!");
			}
		}

// contains
		//indexOf and contains use objects.equal
		Person person5 = new Person("Tasnim","Amini", address2, 7);
		persons.contains(person5); // see equals
// index of		
		System.out.println ("index of mahla: "+ persons.indexOf(Mahla) ) ; // see equals

	
// sort
		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				return (p1.getAddress().getStreet()).compareTo( p2.getAddress().getStreet());
				// =0   -> equal
				// <0   ->     lexicographically less than other string
				// >0   ->     lexicographically greater than other string(more characters)
			}
			
		});
		
		Collections.sort(persons, new SortPersonByStreet());
		
		
// binary search
        System.out.println( "The index of Taha is "  + Collections.binarySearch(persons, Taha)); 


		int found = Collections.binarySearch(persons, Amirhossein);
		System.out.println("Amirhossein found: "+ persons.get(found) );
		
		
	}
}
