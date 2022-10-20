package com.valtech.tx.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("atm")
public class Atmtx extends Tx {
 
	private int atmno;
	private String location;
	
	
	public Atmtx() {}
	
	
	
	public Atmtx(int atmno, String location) {
		super();
		this.atmno = atmno;
		this.location = location;
	}



	public int getAtmno() {
		return atmno;
	}
	public void setAtmno(int atmno) {
		this.atmno = atmno;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
