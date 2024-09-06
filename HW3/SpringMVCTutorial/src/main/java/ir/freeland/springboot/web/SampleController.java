package ir.freeland.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SampleController {

    @GetMapping("/sample")
    public String showForm() {
        return "sample";
    }
    
    @GetMapping("/sample2")
    public String showForm2() {
        return "sample2";
    }
    
    @GetMapping("/sample3")
    public String showForm3() {
        return "sample3";
    }
    @GetMapping("/sample4")
    public String showForm4() {
        return "sample4";
    }
    
    /*
     * 
     * <% if(request.getParameter("last_name")==""){
		 sw = 1; %>
		 				<p style="color:red;"> you must fill your Last Name </p>
		 <% } %>
		 <% if(request.getParameter("date_of_birth")==""){
		 sw = 1; %>
		 				<p style="color:red;"> you must chosse your Date of birth </p>
		 <% } %>
		 <%if(sw==0){ %>


		 <% } %>
     */
    ////////////////////////////////////////
    @GetMapping("/registerform1")
    public String showRegisterForm1() {
        return "registerform1";
    }
    
    @PostMapping("/result1")
    public String showResult1() {
        return "result1";
    }
    
    @GetMapping("/registerform2")
    public String showRegisterForm2() {
        return "registerform2";
    }
    
    @PostMapping("/result2")
    public String showResult2() {
        return "result2";
    }

    @GetMapping("/registerform3")
    public String showRegisterForm3() {
        return "registerform3";
    }
    
    @PostMapping("/result3")
    public String showResult3() {
        return "result3";
    }

    
    ///////////////////////////////////////
    @GetMapping("/registerform")
    public String showRegisterForm() {
        return "registerform";
    }
    
    @PostMapping("/result")
    public String showResult() {
        return "result";
    }
}
