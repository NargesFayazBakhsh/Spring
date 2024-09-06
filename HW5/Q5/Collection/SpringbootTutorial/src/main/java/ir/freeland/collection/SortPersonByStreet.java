package ir.freeland.collection;

import java.util.Comparator;

import ir.freeland.collection.model.Person;

public class SortPersonByStreet implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return (p1.getAddress().getStreet()).compareTo( p2.getAddress().getStreet());
		// =0   -> equal
		// <0   ->     lexicographically less than other string
		// >0   ->     lexicographically greater than other string(more characters)
	}
	

}
