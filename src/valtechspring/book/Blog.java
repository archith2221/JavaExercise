package valtechspring.book;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Blog")
public class Blog extends Book{
	private String url;
	private int visittime;

	
	public Blog() {}


	public Blog(String url, int visittime) {
		super();
		this.url = url;
		this.visittime = visittime;
	}


	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public int getVisittime() {
		return visittime;
	}


	public void setVisittime(int visittime) {
		this.visittime = visittime;
	}


	@Override
	public String toString() {
		return "Blog [url=" + url + ", visittime=" + visittime + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getYearpublished()=" + getYearpublished() + "]";
	}

}
