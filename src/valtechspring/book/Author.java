package valtechspring.book;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;
@Entity
public class Author {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private int phonenumber;
	
   @OneToOne(targetEntity=Addressauthor.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},mappedBy="authors")
    private Addressauthor address;
   

@ManyToMany(targetEntity=Book.class,cascade={CascadeType.MERGE,CascadeType.PERSIST} ) 
@JoinTable(name="author_book", joinColumns=@JoinColumn(name="author_id" ,referencedColumnName="id"), inverseJoinColumns=@JoinColumn(name="book_id",referencedColumnName="id"))
	private Set<Book> books;
	
	public Author() {}
	public Author(String name, int phonenumber) {
		super();
		this.name = name;
		this.phonenumber = phonenumber;
	}
	
	
	
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", phonenumber=" + phonenumber + ", address=" + address
				+ ", books=" + books + "]";
	}
	
	public Addressauthor getAddress() {
		return address;
	}
	public void setAddress(Addressauthor address) {
		this.address = address;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBooks(Set<Book> books) {
		this.books = books;
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
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	

}
