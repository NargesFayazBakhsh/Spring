package ir.freeland.collection.model;
import java.util.Objects;

public class Address {
	private String city;
	private String country;
	private String street;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
	
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", street=" + street + "]";
	}
	
	

}
