package com.valtech.tx.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("transfer")
public class Transfertx extends Tx {

	private int fromaccnt;
	private int toaccnt;
	
	
	
	public Transfertx() {}
	
	
	
	public Transfertx(int fromaccnt, int toaccnt) {
		super();
		this.fromaccnt = fromaccnt;
		this.toaccnt = toaccnt;
	}



	public int getFromaccnt() {
		return fromaccnt;
	}
	public void setFromaccnt(int fromaccnt) {
		this.fromaccnt = fromaccnt;
	}
	public int getToaccnt() {
		return toaccnt;
	}
	public void setToaccnt(int toaccnt) {
		this.toaccnt = toaccnt;
	}
	
	
	
}
