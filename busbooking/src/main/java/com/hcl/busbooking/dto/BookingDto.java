package com.hcl.busbooking.dto;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.hcl.busbooking.model.Gender;

public class BookingDto {
	private String busName;
	private int busServiceNumber;
	private Date date;
	private Gender gender;
	private int noOfSeats;
	private int userId;
	private String userName;
	public String getBusName() {
		return busName;
	}
	public void setBusName(String busName) {
		this.busName = busName;
	}
	public int getBusServiceNumber() {
		return busServiceNumber;
	}
	public void setBusServiceNumber(int busServiceNumber) {
		this.busServiceNumber = busServiceNumber;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getNoOfSeats() {
		return noOfSeats;
	}
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public BookingDto(String busName, int busServiceNumber, Date date, Gender gender, int noOfSeats, int userId,
			String userName) {
		super();
		this.busName = busName;
		this.busServiceNumber = busServiceNumber;
		this.date = date;
		this.gender = gender;
		this.noOfSeats = noOfSeats;
		this.userId = userId;
		this.userName = userName;
	}
	public BookingDto() {
		super();
	}
	
	

}
