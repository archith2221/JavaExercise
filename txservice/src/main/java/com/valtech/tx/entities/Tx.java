package com.valtech.tx.entities;

import java.time.LocalDateTime;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


//@Entity

//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Table(name="alltxs")
//@DiscriminatorColumn(name="disc")
//@DiscriminatorValue("tx")
//@Entity
//@DiscriminatorValue("Blog")

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="acctx")
@DiscriminatorColumn(name="disc")
@DiscriminatorValue("tx")
public class Tx {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private float amount;
	private float debit;
	private LocalDateTime time;
	private int accountid;
	
	public Tx(){}
	
	
	public Tx(int id, float amount, float debit, LocalDateTime time, int accountid) {
	
		this.id = id;
		this.amount = amount;
		this.debit = debit;
		this.time = time;
		this.accountid = accountid;
	}
	
	


	public Tx(float amount, float debit, LocalDateTime time, int accountid) {
		super();
		this.amount = amount;
		this.debit = debit;
		this.time = time;
		this.accountid = accountid;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getDebit() {
		return debit;
	}
	public void setDebit(float debit) {
		this.debit = debit;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public int getAccountid() {
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	
	
}
