package valtechspring.book;




	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToOne;

	@Entity
	public class Addressauthor {
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int id;
		private String street;
		private String city;
		private String state;
		private int zipcode;
		
		@OneToOne(targetEntity=Author.class)
		@JoinColumn(name="authors_id",referencedColumnName="id")
		private Author authors;

		public Addressauthor() {
		
		}

		public Addressauthor(String street, String city, String state, int zipcode) {
			super();
			this.street = street;
			this.city = city;
			this.state = state;
			this.zipcode = zipcode;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getStreet() {
			return street;
		}

		public void setStreet(String street) {
			this.street = street;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public int getZipcode() {
			return zipcode;
		}

		public void setZipcode(int zipcode) {
			this.zipcode = zipcode;
		}

		public Author getAuthors() {
			return authors;
		}

		public void setAuthors(Author authors) {
			this.authors = authors;
		}

		@Override
		public String toString() {
			return "Addressauthor [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state
					+ ", zipcode=" + zipcode + "]";
		}

	
		
		
	
}
