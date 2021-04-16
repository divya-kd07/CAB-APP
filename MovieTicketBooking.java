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
public class MovieTicketBooking {

	/**
	 * @param args
	 */
	public static int LoginChecking(String num) {
        
		
		//Level 1 
		
		
		int validType;    
		if(num.length()==10 || num.length()==8 && num!="0") {
	    	validType=1;
			}
		else {
				
		    validType=0;
			}
			
	    return validType;
	}
	public static void Booking(int choice) {
		switch(choice) {
		case 1:{ System.out.println("YOU ARE BOOKING THE SEAT IS FIRST CLASS.YOUR TICKET COST IS 400Rs.....ENJOY YOUR CINEMA");break;}
		case 2:{ System.out.println("YOU ARE BOOKING THE SEAT IS SECOND CLASS.YOUR TICKET COST IS 250Rs.....ENJOY YOUR CINEMA");break;}
		case 3:{ System.out.println("YOU ARE BOOKING THE SEAT IS THIRD CLASS.YOUR TICKET COST IS 100Rs.....ENJOY YOUR CINEMA");break;}
		default:{System.out.println("YOU ARE CHOOSING WRONG OPTION...PLEASE ENTER THE CORRECT CHOICE");break;}
		}
	}
	public static int TicketAmount(int ticket,int persons) {
		int amount = 0;
		if(ticket==1) {
			amount=persons*400;
		}
		else if(ticket==2)
		{
			amount=persons*250;
		}
		else {
			if(ticket==3)
			{
			amount=persons*100;
			}
			else 
			{
				System.out.println("Sorry.....No services....");
			}
		}
		return amount;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			 Scanner o =new Scanner(System.in);
			 System.out.println("                       **********************ROHINI CINEMAS**************************                     ");
			 System.out.println("                       **************MOVIE TICKET BOOKING APPLICATION*****************                     ");
			 System.out.println("                                 ****LOGIN PAGE****                                       ");
			 System.out.println("Mobile Number: ");//MSobile number is 10digits
				Long mobNo=o.nextLong();
				String mobileNoString=String.valueOf(mobNo);
				int Checking=LoginChecking(mobileNoString);
			    if(Checking==1) {
			    	System.out.println("Password: ");//Enter the password....it includes 8 digits
			        String pwd=o.next();
					String pwd1=String.valueOf(pwd);
					if(Checking==1)//Comparing the password for password checking
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
			    
			    System.out.println("                       **************SEAT BOOKING*****************                     ");
		        System.out.println("TYPES OF SEATS:");//Display the ticket types
		        System.out.println("1.FIRST CLASS");
		        System.out.println("2.SECOND CLASS");
		        System.out.println("3.THIRD CLASS");
		        System.out.println("ENTER YOUR CHOICE:");
		        
		        int choice=o.nextInt();//getting the customer choice
		        Booking(choice);
		        
		        //Level 3
		        
		        System.out.println("                       **************WELCOME*****************                     ");
				System.out.println("                              ****PRICE ESTIMATOR****                                       ");
				System.out.println("TICKET TYPE : ");//Get the ticket type 
			    int ticket=o.nextInt();
				System.out.println("NUMBER OF PERSONS : ");//Total number of persons from the user
				int persons=o.nextInt();
				int amount1=TicketAmount(ticket,persons);
				System.out.println("Your total bill amount is : "+amount1+" Rs/-");//calculate the bill Amount
		        
				//Level 4
				
				System.out.println("                       **************WELCOME*****************                     ");
				System.out.println("                            ****GOODS AND SERVICES TAX****                                       ");
				double amount2=amount1;//Converting integer to double
				double gst=amount2+(amount2*0.07);//Calculating the GST
				System.out.println("Your GST amount is : "+gst+" Rs/-");//Calculate the GST
				
				//Level 5
			
				
				System.out.println("                       **************WELCOME*****************                     ");
				System.out.println("                                 ****BOOKING****                                       ");
				

			    System.out.println("ENTER YOUR MOVIE DATE (YYYY-MM-DD) : ");
			    String date=o.next();//Getting the movie date
			    LocalDate dateOfJourney=LocalDate.parse(date);
			    System.out.println("SHOW TIME: 10:00\n\t 01:30\n\t 05:00\n\t 10:00");
			    System.out.println("ENTER YOUR SHOW TIME (HH:MM) : ");
			    String time=o.next();//Getting the show timing
			    LocalTime pickUpTime=LocalTime.parse(time);
			    int hour=pickUpTime.getHour();
			    System.out.println("YOUR SHOW DATE IS : "+dateOfJourney);
			    System.out.println("YOUR SHOW TIME IS: "+hour);
			   
			   System.out.println("THANK YOU!!!...");
			    o.close();
				}

		

				
			    


	}


