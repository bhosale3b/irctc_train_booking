package com.irctc.app.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Train {
	private int TrainNo;
	private String TrainName;
	private double Amount;
	
	@Override
	public String toString() {
		return "Train [TrainNo=" + TrainNo + ", TrainName=" + TrainName + ", Amount=" + Amount + "]";
	}

	public int getTrainNo() {
		return TrainNo;
	}

	public void setTrainNo(int trainNo) {
		TrainNo = trainNo;
	}

	public String getTrainName() {
		return TrainName;
	}

	public void setTrainName(String trainName) {
		TrainName = trainName;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	
	}

	

	
	
	


