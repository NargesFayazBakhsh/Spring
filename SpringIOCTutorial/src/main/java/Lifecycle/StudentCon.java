package Lifecycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentCon {
    @Bean()
    Student student() {
        Student student = new Student();
        student.setName("Narges");
        student.setFamily("Fayazbakhsh");
        student.setStudent_id(1234);
        System.out.println(student.toString());
        
        
        return student;
    }

    
}
