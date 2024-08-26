package Lifecycle;

import org.springframework.beans.factory.BeanNameAware;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Student implements BeanNameAware{
	private int student_id;
    private String name;
    private String family;
    private String beanName;
    
    public Student() {
    	name = "Default";
    }
    
    public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
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
	
	
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", name=" + name + ", family=" + family + "]";
	}    
    
	
	@Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware: Setting bean name: " + name);
        this.beanName = name;
    }
    
	
	@PostConstruct
    public void init() {
        System.out.println("@PostConstruct: " + getName() );
    }
	
	
	@PreDestroy
    public void preDestroy() {
        System.out.println("@PreDestroy: " + getName() );
    }


}
