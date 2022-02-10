package com.example.demo.entity;
import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address implements Serializable{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;
	@Column(name = "user_id",updatable =false,insertable = false)
	private Long userid;
	private String street;
	private String city;
	private String state;
	private String zipcode;
	
	@ManyToOne
    @JoinColumn(name="user_id", nullable=false)
	private User user;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public boolean equals(Object o) {

		if (this == o)
			return true;
		if (!(o instanceof Address))
			return false;
		Address address = (Address) o;
		return Objects.equals(this.id, address.id) && Objects.equals(this.city, address.city)
				&& this.zipcode == address.zipcode;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.city, this.zipcode);
	}

	@Override
	public String toString() {
		return "Address{" + "id=" + this.id + ", city='" + this.city + '\'' + ", zipcode=" + this.zipcode + '}';
	}
}
