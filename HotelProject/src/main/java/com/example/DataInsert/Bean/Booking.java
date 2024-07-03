package com.example.DataInsert.Bean;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Booking {
	@Id
	private String Name;
	private String Email;
	private String CheckIn;
	private String CheckOut;
	private int SelectAdult;
	private int SelectChild;
	public String getName() {
		return Name;
	}
	public void setCheckIn(String checkIn) {
		CheckIn = checkIn;
	}
	public void setCheckOut(String checkOut) {
		CheckOut = checkOut;
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

	public int getSelectAdult() {
		return SelectAdult;
	}
	public void setSelectAdult(int selectAdult) {
		SelectAdult = selectAdult;
	}
	public int getSelectChild() {
		return SelectChild;
	}
	public void setSelectChild(int selectChild) {
		SelectChild = selectChild;
	}
	public String getSelectARoom() {
		return SelectARoom;
	}
	public void setSelectARoom(String selectARoom) {
		SelectARoom = selectARoom;
	}
	public int getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(int mobileNo) {
		MobileNo = mobileNo;
	}
	private String SelectARoom;
	private int MobileNo;

}
