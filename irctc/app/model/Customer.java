package com.irctc.app.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Customer {
	private int id;
	private String name;
	private User user;
	private Train train;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", \n\t user=" + user + ",\n\t\t train=" + train + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int i) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Train getTrain() {
		return train;
	}
	public void setTrain(Train train) {
		this.train = train;
	}
	public void setPassword(String next) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
