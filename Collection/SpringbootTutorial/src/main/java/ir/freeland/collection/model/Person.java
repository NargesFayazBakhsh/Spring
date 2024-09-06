package ir.freeland.collection.model;

import java.util.Objects;

public class Person implements Comparable<Person>{
    	
    private String name;
    private String fname;
    private Address address;
    private int age;
    
 // narges fayazbakhsh	   

	public Person(String name,String fname,Address address, int age) {
        this.name = name;
        this.fname = fname;
        this.address = address;
        this.age = age;
    }



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getFname() {
		return fname;
	}



	public void setFname(String fname) {
		this.fname = fname;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public int hashCode() {
		return Objects.hash(name);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}



	@Override
	public int compareTo(Person o) {
		return this.age - o.age;
		//return this.name.compareTo(o.name);
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", fname=" + fname + ", address=" + address + ", age=" + age + "]";
	}
	
	
}
