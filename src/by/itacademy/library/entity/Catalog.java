package by.itacademy.library.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Catalog {

	private String responseblePerson;
	private Date creationDate;
	private List<Book> books;

	public Catalog() {
		books = new ArrayList<>();
		// init creationData

	}

	public String getResponseblePerson() {
		return responseblePerson;
	}

	public void setResponseblePerson(String responseblePerson) {
		this.responseblePerson = responseblePerson;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Catalog [responseblePerson=" + responseblePerson + ", creationDate=" + creationDate + ", books=" + books
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((books == null) ? 0 : books.hashCode());
		result = prime * result + ((creationDate == null) ? 0 : creationDate.hashCode());
		result = prime * result + ((responseblePerson == null) ? 0 : responseblePerson.hashCode());
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
		Catalog other = (Catalog) obj;
		if (books == null) {
			if (other.books != null)
				return false;
		} else if (!books.equals(other.books))
			return false;
		if (creationDate == null) {
			if (other.creationDate != null)
				return false;
		} else if (!creationDate.equals(other.creationDate))
			return false;
		if (responseblePerson == null) {
			if (other.responseblePerson != null)
				return false;
		} else if (!responseblePerson.equals(other.responseblePerson))
			return false;
		return true;
	}

	public Book getSingleRow(int row) {
	
		if(books!=null) {
			return books.get(row);
		}
		return null;
	}
	
}
