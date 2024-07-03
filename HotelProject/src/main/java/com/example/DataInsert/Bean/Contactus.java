package com.example.DataInsert.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Contactus {
	@Id
	private String Name;
	private String Email;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}
	private int MobileNo;

}
