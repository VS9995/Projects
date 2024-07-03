package com.example.DataInsert.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Review {

	private String Message;
	@Id
	private String Name;
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getProfession() {
		return Profession;
	}
	public void setProfession(String profession) {
		Profession = profession;
	}
	private String Profession;
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
		
		
	}
	private String image;
	
}
