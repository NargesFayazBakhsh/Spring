package validator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ApplicationValidator {
	
	public static void main(String[] args)  {
		ApplicationContext applicationContext =  SpringApplication.run(ApplicationValidator.class, args);
		
		
//      input valid
		Input input1 = new Input();
		input1.setName("narges");
		input1.setPhoneNumber("09123456789");
		input1.setEmail("narges@fayazbakhsh.com");
		System.out.println(input1.toString());
		
		
		Input input2 = new Input();
		input2.setName("hosein");
		input2.setPhoneNumber("09123456789");
		input2.setEmail("hosein@fayazbakhsh.com");
		System.out.println(input2.toString());
		
		
//		input ("invalid");
		
		///// error in phone number
		Input input3 = new Input();
		input3.setName("saeed");
		input3.setPhoneNumber("091234");
		input3.setEmail("narges@fayazbakhsh.com");
		System.out.println(input3.toString());
		
		///// error in email
		Input input4 = new Input();
		input4.setName("saeed");
		input4.setPhoneNumber("09123456789");
		input4.setEmail("abcdefgh");
		System.out.println(input4.toString());
		
		
		    
		var validator = applicationContext.getBean(ProgrammaticallyValidatingService.class);		
		
		validator.validateInput(input1);
		validator.validateInput(input2);
		validator.validateInput(input3);
		validator.validateInput(input4);
	}
}
