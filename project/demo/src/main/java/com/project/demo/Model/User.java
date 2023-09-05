package com.project.demo.Model;
import java.util.List;

import javax.persistence.CascadeType;
//import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
//import javax.persistence.JoinColumn;
//import javax.persistence.OneToMany;
//import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User{

	@Id
	private int userId;
	private String name;
	private int age;
	private String mail;
	private long mobileNo;
	private long aadharNo;
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Hotel hotel;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_id")
	private List<Booking> booking;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int userId, String name, int age, String mail, long mobileNo, long aadharNo, String password,
			Hotel hotel, List<Booking> booking) {
		super();
		this.userId = userId;
		this.name = name;
		this.age = age;
		this.mail = mail;
		this.mobileNo = mobileNo;
		this.aadharNo = aadharNo;
		this.password = password;
		this.hotel = hotel;
		this.booking = booking;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public long getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public List<Booking> getBooking() {
		return booking;
	}

	public void setBooking(List<Booking> booking) {
		this.booking = booking;
	}
	
	
	}