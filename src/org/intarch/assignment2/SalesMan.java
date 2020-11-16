package org.intarch.assignment2;

import org.bson.Document;

public class SalesMan {
	private String firstname;
	private String lastname;
	private Integer id;

	public SalesMan(String firstname, String lastname, Integer id) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
	}

	public SalesMan() {

	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Document toDocument() {
		org.bson.Document document = new Document();
		document.append("firstname", this.firstname);
		document.append("lastname", this.lastname);
		document.append("_id", this.id);
		return document;
	}

	@Override
	public String toString() {
		return "SalesMan [firstname=" + firstname + ", lastname=" + lastname + ", id=" + id + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
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
		SalesMan other = (SalesMan) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}

}