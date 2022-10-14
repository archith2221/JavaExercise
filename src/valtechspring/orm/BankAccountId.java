package valtechspring.orm;



import java.io.Serializable;



public class BankAccountId implements Serializable{
    private int accno;
    private String acctype;
    public int getAccno() {
        return accno;
    }
    public void setAccno(int accno) {
        this.accno = accno;
    }
    public String getAcctype() {
        return acctype;
    }
    public void setAcctype(String acctype) {
        this.acctype = acctype;
    }
    public BankAccountId(int accno, String acctype) {
        super();
        this.accno = accno;
        this.acctype = acctype;
    }
    public BankAccountId() {
        super();
    }
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + accno;
		result = prime * result + ((acctype == null) ? 0 : acctype.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccountId other = (BankAccountId) obj;
		if (accno != other.accno)
			return false;
		if (acctype == null) {
			if (other.acctype != null)
				return false;
		} else if (!acctype.equals(other.acctype))
			return false;
		return true;
	}
    
    
}