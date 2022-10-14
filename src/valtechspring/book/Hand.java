package valtechspring.book;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Hand")
public class Hand extends Book {
  
	
	private int price;
	private int year;
	private int Edition;
	
	
	public Hand() {}


	public Hand(int price, int year, int edition) {
		super();
		this.price = price;
		this.year = year;
		Edition = edition;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getEdition() {
		return Edition;
	}


	public void setEdition(int edition) {
		Edition = edition;
	}


	@Override
	public String toString() {
		return "Hand [price=" + price + ", year=" + year + ", Edition=" + Edition + ", getId()=" + getId()
				+ ", getName()=" + getName() + ", getYearpublished()=" + getYearpublished() + "]";
	}
	
}
