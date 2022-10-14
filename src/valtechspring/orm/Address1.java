package valtechspring.orm;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Address1 {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private  int id;
	private String street;
	private String city;
	private String state;
	private int zipcode;
	@OneToOne(targetEntity=Customer.class)
	@JoinColumn(name="customer_id",referencedColumnName="id")
	private Customer customer;
	
	
	
	
	public Address1() {
		
	}
	
	
	public Address1(String street, String city, String state, int zipcode) {
	
		this.street = street;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}


	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", zipcode="
				+ zipcode + "]";
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
