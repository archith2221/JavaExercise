package valtechspring.orm;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@NamedQueries({@NamedQuery(name="customerByAccountType" ,query="SELECT c FROM Customer c JOIN c.accounts a WHERE a.accountType= ?")})
public class Customer {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String name;
	@Temporal(TemporalType.DATE)
	private Date dateofBirth;
	private int gender;
	
	@OneToOne(targetEntity=Address1.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},mappedBy="customer")
	private Address1 address;
	@ManyToMany(targetEntity=Account.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},mappedBy="customers")
	private Set<Account> accounts;
	
	
	
	
public Customer() {}
	
	
	public Customer( String name, Date dateofBirth, int gender) {
		
		
		this.name = name;
		this.dateofBirth = dateofBirth;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", dateofBirth=" + dateofBirth + ", gender=" + gender
				+ ", address=" + address + "]";
	}


	public void addAccount(Account ac){
		if(getAccounts()== null){
			accounts=  new HashSet<Account>();
			
		}
		accounts.add(ac);
		if(ac.getCustomers()== null){
			ac.setCustomers(new HashSet<Customer>());
		}
		ac.getCustomers().add(this);
	}
	
	public Set<Account> getAccounts() {
		return accounts;
	}


	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}


	public Address1 getAddress() {
		return address;
	}
	public void setAddress(Address1 address) {
		this.address = address;
	}
	
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateofBirth() {
		return dateofBirth;
	}
	public void setDateofBirth(Date dateofBirth) {
		this.dateofBirth = dateofBirth;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	
}
