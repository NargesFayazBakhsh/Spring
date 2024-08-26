package validator;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


public class Input {

  @NotNull
  @Size(min=3)
  private String name;
  
  @Email(message="Please provide a valid email address",regexp=".+@.+\\..+")
  private String email;

  @Pattern(regexp="^09[0-9]{9}$")
  private String phoneNumber;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

@Override
public String toString() {
	return "Input [name=" + name + ", email=" + email + ", phoneNumber=" + phoneNumber + "]";
}
  

}
