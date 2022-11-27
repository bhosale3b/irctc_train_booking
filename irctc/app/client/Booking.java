package com.irctc.app.client;

import java.util.Scanner;

import com.irctc.app.service.PuneStaionServiceI;
import com.irctc.app.utils.ScannerUtility;

public class Booking {
	public static void main(String[] args) {
		
		Scanner sc = ScannerUtility.getInstance();
		PuneStaionServiceI service = new PuneStaionServiceI();
		
		
		while(true) {
			System.out.println("Welcome to IRCTC");
			System.out.println("----------------");
			System.out.println("1} Add Trains");
			System.out.println("2} View Trains");
			System.out.println("3} Sign Up-Customer");
			System.out.println("4} Ticket Booking");
			System.out.println("5} Customer-Booking View");
			System.out.println("6} Exist");
			System.out.println("----------------");
			
			System.out.println("please select above option");
			int option =sc.nextInt();
			
	    switch(option) {
	    	case 1:
	    		service.addtrain();
	    		break;
	    	case 2:
	    		service.displaytrain();// theses calling from punestatinservice class
	    		break;
	    	case 3:
	    		service.signup();
	    		break;
	    	case 4:
	    		service.ticketbooking();
	    		break;
	    	case 5:
	    		service.customerbookinginformation();
	    		break;
	        case 6:
	    		System.out.println("Thank You :) Visit Again !!");
	    	    System.exit(0);
	    		break;
	    		
	        default :
	        	System.out.println("Wrong selection, try again !! :( ");
	        	System.exit(0);
	    	
	    	    	
	    }
		}
	}

	
		
	}

