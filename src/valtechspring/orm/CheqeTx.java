package valtechspring.orm;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity

@DiscriminatorValue("ctx")
public class CheqeTx extends Tx{

	
	private int chequeNo;
	private boolean outstation;
	private float collectionCharges;
	public CheqeTx() {}
	
	public CheqeTx(float amount,int chequeNo, boolean outstation, float collectionCharges) {
		super(amount);
		this.chequeNo = chequeNo;
		this.outstation = outstation;
		this.collectionCharges = collectionCharges;
	}

	public int getChequeNo() {
		return chequeNo;
	}

	public void setChequeNo(int chequeNo) {
		this.chequeNo = chequeNo;
	}

	public boolean isOutstation() {
		return outstation;
	}

	public void setOutstation(boolean outstation) {
		this.outstation = outstation;
	}

	public float getCollectionCharges() {
		return collectionCharges;
	}

	public void setCollectionCharges(float collectionCharges) {
		this.collectionCharges = collectionCharges;
	}
	
}
