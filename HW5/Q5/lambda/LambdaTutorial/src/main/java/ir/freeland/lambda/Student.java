package ir.freeland.lambda;

public class Student implements Comparable<Student>{
	
private String name;
private String family;
private int age;
private int grade;

public Student(String name,String family, int age,int grade) {
    this.name = name;
    this.family = family;
    this.age = age;
    this.grade = grade;
}
// narges fayazbakhsh


public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getFamily() {
	return family;
}



public void setFamily(String family) {
	this.family = family;
}



public int getAge() {
	return age;
}



public void setAge(int age) {
	this.age = age;
}



public int getGrade() {
	return grade;
}



public void setGrade(int grade) {
	this.grade = grade;
}



@Override
public String toString() {
	return "Student [name=" + name + ", family=" + family + ", age=" + age + ", grade=" + grade + "]";
}



@Override
public int compareTo(Student o) {
	return this.age - o.age;
}

}
