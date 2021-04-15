/**
 * 
 */
package com.divi2624;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;

/**
 * @author divy2624
 *
 */
public class LevelExample {

	/**
	 * @param args
	 */
	public static int cabb(String cab,int d) {
		int z = 0;
		if(cab.equals("MICRO")) {
			z=d*10;
		}
		else if(cab.equals("MINI"))
		{
			z=d*15;
		}
		else {
			if(cab.equals("MINI"))
			{
			z=d*20;
			}
			else 
			{
				System.out.println("Sorry.....No services....");
			}
		}
		return z;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner o=new Scanner(System.in);
		
		//Level 1 
		
		
		System.out.println("                       **************OLA APPLICATION*****************                     ");
		System.out.println("                                 ****LOGIN PAGE****                                       ");
		System.out.println("Mobile Number: ");//mobile number is 10digits
		Long mobNo=o.nextLong();
		String mobileNoString=String.valueOf(mobNo);
	    if(mobileNoString.length()==10) {
	    	System.out.println("Password: ");//Enter the password....it includes 8 digits
	        String p=o.next();
			String passWard=String.valueOf(p);
			if(passWard.length()==8)//comparing the password for password checking
			{
				System.out.println("Login Successfully!!!");
			}
			else {
				System.out.println("Invalid Password or Mobile Number(it includes 10digits)");
			}
			
	    } 
	    else {
	    System.out.println("Retype the mobile number(it includes 10 digits) ");	
	    }
	    
		//Level 2
		
		
		
		System.out.println("                       **************WELCOME*****************                     ");
		System.out.println("                                 ****CAB TYPES****                                       ");
		//display the types of cabs and their costs per kilometers
		System.out.println("TYPES OF CABS");
		System.out.println("1. MICRO (Rs.10/km)");
		System.out.println("2. MINI (Rs.15/km)");
		System.out.println("3. PRIME (Rs.20/km)");
		
		//Level 3
		
		System.out.println("                       **************WELCOME*****************                     ");
		System.out.println("                              ****PRICE ESTIMATOR****                                       ");
		System.out.println("CAB TYPE : ");
	    String cab=o.next();
		System.out.println("Number Of Kilometers : ");//Get the cab type and kilometer from the user
		int d=o.nextInt();
		int x=cabb(cab,d);
		System.out.println("Your total bill amount is : "+x+" Rs/-");//calculate the bill Amount
		
		//Level 4
		
		System.out.println("                       **************WELCOME*****************                     ");
		System.out.println("                            ****GOODS AND SERVICES TAX****                                       ");
		double y=x;//Converting integer to double
		double u=y+(y*0.07);//Calculating the GST
		System.out.println("Your GST amount is : "+u+" Rs/-");//calculate the GST
		
		//Level 5
		
		System.out.println("                       **************WELCOME*****************                     ");
		System.out.println("                                 ****BOOKING****                                       ");
		

	    System.out.println("ENTER YOUR JOURNEY DATE (YYYY-MM-DD) : ");
	    String date=o.next();//Getting the journey date
	    LocalDate dateOfJourney=LocalDate.parse(date);
	    System.out.println("PICKUP TIME (HH:MM) : ");
	    String time=o.next();//Getting the pickup timing
	    LocalTime pickUpTime=LocalTime.parse(time);
	    int hour=pickUpTime.getHour();
	    System.out.println("JOURNEY DATE IS : "+dateOfJourney);
	    System.out.println("PEAK TIME IS: "+hour);
	    
	    
	    
	    //Level 6 And Level 7
	    
		System.out.println("                       **************WELCOME*****************                     ");
		System.out.println("                                 ****PEAK HOURS****                                       ");
	
		double i = 0;
		if(hour >= 17 && hour <= 19) {
			System.out.println("IT IS A PEAK HOUR..SO 1.25% PER KM PRICE");
			i=(u+(d*0.0125));//It provides some discount prices..
			System.out.println("YOUR BILL AMOUNT IS: "+i+" Rs/-");
		    
		}
		else {
			System.out.println("IT IS NOT A PEAK HOUR");
			System.out.println("YOUR BILL AMOUNT IS: "+u+" Rs/-");
		}
		
	    //Level 7
		
		System.out.println("                       **************WELCOME*****************                     ");
		System.out.println("                               ****SENIOR CITIZEN****                                       ");
		
		System.out.println("ENTER YOUR DATE OF BIRTH (YYYY-MM-DD) : ");
		String date1=o.next();//Getting the date of birth
	    LocalDate dateOfBirth=LocalDate.parse(date1);
	    LocalDate tod=LocalDate.now();
	    Period period=Period.between(dateOfBirth,tod);
	    int age=period.getYears();
	    System.out.println("Age : "+age);
	    double f=u;double i1=i;
	    if((age>=60)&&(hour >= 17 && hour <= 19)) {
	    	f= i1*0.5;//if peak hour and above 60 age 
	    	System.out.println("YOUR BILL AMOUNT IS : "+f+" Rs/-");
	    	System.out.println("YOUR AGE IS GREATER THAN 60...SO YOU HAVE 50% OFFER");
	    }
	    else if(age<=60) {
	    	f=u*0.5;//if age is above 60 
	    	System.out.println("YOUR BILL AMOUNT IS : "+u+" Rs/-");
	    	System.out.println("YOUR AGE IS GREATER THAN 60...SO YOU HAVE 50% OFFER");
	    }
	    else {
	   System.out.println("YOUR BILL AMOUNT IS : "+f+" Rs/-");//if not peak hour and not above 60 age
	    }
	   System.out.println("THANK YOU!!!...");
	    o.close();
		}

}
