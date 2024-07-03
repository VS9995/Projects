package com.example.DataInsert.Bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookRoom {

	private String bath;
	private String bed;
	private String description;
	public String getBath() {
		return bath;
	}
	public void setBath(String bath) {
		this.bath = bath;
	}
	public String getBed() {
		return bed;
	}
	public void setBed(String bed) {
		this.bed = bed;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getWifi() {
		return wifi;
	}
	public void setWifi(String wifi) {
		this.wifi = wifi;
	}
	@Id
	private String name;
	private String price;
	private String wifi;
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	private String img;
	
}
