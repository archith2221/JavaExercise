package com.valtech.tx.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("cheqtx")
public class chequetx extends Tx{

	private int Chequeno;
	private boolean outstation;
	private float collectioncharges;
	
	
	
	public chequetx() {}
	
	
	
	public chequetx(int chequeno, boolean outstation, float collectioncharges) {
		super();
		Chequeno = chequeno;
		this.outstation = outstation;
		this.collectioncharges = collectioncharges;
	}



	public int getChequeno() {
		return Chequeno;
	}
	public void setChequeno(int chequeno) {
		Chequeno = chequeno;
	}
	public boolean isOutstation() {
		return outstation;
	}
	public void setOutstation(boolean outstation) {
		this.outstation = outstation;
	}
	public float getCollectioncharges() {
		return collectioncharges;
	}
	public void setCollectioncharges(float collectioncharges) {
		this.collectioncharges = collectioncharges;
	}
	
	
	
}
