package valtechspring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

@DiscriminatorValue("atx")
public class AtmTx   extends Tx{

	
	
	
	private int atm;
	private String location;
	public AtmTx(){
		
	}
	public AtmTx(float amount,int atm, String location) {
		super(amount);
		this.atm = atm;
		this.location = location;
	}
	public int getAtm() {
		return atm;
	}
	public void setAtm(int atm) {
		this.atm = atm;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "AtmTx [getId()=" + getId() + ", getAmount()=" + getAmount() + ", atm=" + atm + ", location=" + location
				+ "]";
	}
	
	
	
}
