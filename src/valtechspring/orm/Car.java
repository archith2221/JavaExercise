package valtechspring.orm;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity

// @Table

public class Car {
@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", yearManufactured=" + yearManufactured
				+ ", price=" + price + ", color=" + color + ", version=" + version + ", carDetails=" + carDetails + "]";
	}
@Id
@GeneratedValue(strategy=GenerationType.SEQUENCE) //For Oracle User


	private int id;
	private String make;
	private String model;
	private int yearManufactured;
	private float price;
	private String color;
	
	@Version
	
	
private int version;

	@Embedded
	private CarDetails  carDetails;
	
	


	public Car(){} //mandatory to create parameterless constructor
	
	
	public Car(int id, String make, String model, int yearManufactured, float price, String color, CarDetails carDetails) {
	
		this.id = id;
		this.make = make;
		this.model = model;
		this.yearManufactured = yearManufactured;
		this.price = price;
		this.color = color;
		this.carDetails=carDetails;
	}
	

	public Car(String make, String model, int yearManufactured, float price, String color, CarDetails carDetails) {
		
		this.make = make;
		this.model = model;
		this.yearManufactured = yearManufactured;
		this.price = price;
		this.color = color;
		this.carDetails=carDetails;
	}

	public CarDetails getCarDetails() {
		return carDetails;
	}


	public void setCarDetails(CarDetails carDetails) {
		this.carDetails = carDetails;
	}


	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearManufactured() {
		return yearManufactured;
	}
	public void setYearManufactured(int yearManufactured) {
		this.yearManufactured = yearManufactured;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
