package valtechspring.book;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


//
//@Entity

//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Table(name="alltxs")
//@DiscriminatorColumn(name="disc")
//@DiscriminatorValue("tx")


@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Table(name="allbooks")
@DiscriminatorColumn(name="disc")
@DiscriminatorValue("main")
public class Book {



	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private  int yearpublished;
	public Book() {}
	
	
@ManyToMany(targetEntity=Author.class,cascade={CascadeType.MERGE,CascadeType.PERSIST},mappedBy="books")	
	private Set<Author> authors;

@ManyToOne(targetEntity=Publisher.class)
@JoinTable(name="book_publisher", joinColumns=@JoinColumn(name="book_id",referencedColumnName="id"),
inverseJoinColumns=@JoinColumn(name="publisher_id",referencedColumnName="id"))
private Publisher publisher;
	
	public Set<Author> getAuthors() {
	return authors;
}
public void setAuthors(Set<Author> authors) {
	this.authors = authors;
}
public Publisher getPublisher() {
	return publisher;
}
public void setPublisher(Publisher publisher) {
	this.publisher = publisher;
}
	public Book(String name, int yearpublished) {
		super();
		this.name = name;
		this.yearpublished = yearpublished;
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
	public int getYearpublished() {
		return yearpublished;
	}
	public void setYearpublished(int yearpublished) {
		this.yearpublished = yearpublished;
	}
	

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", yearpublished=" + yearpublished + ", authors=" + authors
				+ ", publisher=" + publisher + "]";
	}
	
}
