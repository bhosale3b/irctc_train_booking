package com.irctc.app.service;

import java.util.Scanner;


import com.irctc.app.model.Customer;
import com.irctc.app.model.Train;
import com.irctc.app.model.User;
import com.irctc.app.utils.ScannerUtility;


public class PuneStaionServiceI implements PuneStationService {
	private Train[] trains = null;
	private Customer[] customers = null;
	
	
	static Scanner sc = null;
	static {
		if (sc == null)
			sc = ScannerUtility.getInstance();// single object
	}

	@Override
	public void addtrain() {
		System.out.println("How many train do you want to add");
		int n = sc.nextInt();
		
		trains = new Train[n];
		
		for (int i = 0; i < n; i++) {
			
			Train train =new Train();
			System.out.println("Enter Train no");
            train.setTrainNo(sc.nextInt());		
            System.out.println("Enter Train name");
            train.setTrainName(sc.next());
            System.out.println("Enter booking amount");
            train.setAmount(sc.nextDouble());
            trains[i] = train;
			
		}
	}

	@Override
	public void displaytrain() {
		if(null!=trains) {
			for(Train train : trains) {
				System.out.println(train);
			}
		}else {
			System.out.println("train is not available !!!");
		}
		
	
	}

	@Override
	public void signup() {
		
		System.out.println("How many customer do you want to add");
		int n=sc.nextInt();
		
		customers = new Customer[n];
		for (int i = 0; i < n; i++) {
			Customer customer = new Customer();
			User user= new User();
			System.out.println("Enter customer id");
			customer.setId(sc.nextInt());
			System.out.println("Enter customer name");
			customer.setName(sc.next());
			
			System.out.println("Enter Username");
			customer.setName(sc.next());
			System.out.println("Enter Password");
			customer.setPassword(sc.next());
			
			customer.setUser(user);
			customers[i] = customer;
			
			
		}
		
	}

	@Override
	public void ticketbooking() {
		if(null != trains) {
			System.out.println("Enter Username");
			String username = sc.next();
			System.out.println("Enter Password");
			String password = sc.next();
			
			if(null != customers) {
				boolean flag = false;
				for(Customer customer : customers) {
					if(customer.getUser().getUsername().equals(username) && customer.getUser().getPassword().equals(password)) {
						displaytrain();
						System.out.println("Enter train no for booking");
						int trainNo = sc.nextInt();
						for(Train train : trains) {
							if(trainNo == train.getTrainNo()) {
								customer.setTrain(train);
								flag = true;
							}
						}
						if(flag) {
							System.out.println("Train Booking Sucessfully !!! :)");
							System.out.println("\n++++++++++++++++++++++++++++++++++++++++++++");
							System.out.println(customer);
						}
					}else {
						System.out.println("Bad Credentials, Try again !!! :(");
					}
				}
			}else {
				System.out.println("pls registration first");
			}
		}else {
			System.out.println("pls add trains");
		}

	}

	@Override
	public void customerbookinginformation() {
		System.out.println("\n+++++++++++++++++++++++++++++++++++");
		if(null != customers) {
			for(Customer customer : customers) {
				System.out.println(customer);
			}
		}

	}

}
