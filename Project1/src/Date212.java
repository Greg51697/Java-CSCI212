//Importing necessary libraries
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

import java.awt.GridLayout;

import javax.swing.JTextArea;
import javax.swing.JFrame;

//Creating Date212 Class
public class Date212{
	//Creating private instance variables
	private int month,day,year;

	

	//Creating Date212 Constructor and including validity check
	public Date212(String date) throws Exception{
		year=Integer.parseInt(date.substring(0,4));
		month=Integer.parseInt(date.substring(4,6));
		day=Integer.parseInt(date.substring(6,8));
		if(validityCheck(month,day) == false)throw new Exception();
	}

	//Validity Check Method for Legal Month and Day Formatting
	private boolean validityCheck(int month , int day){
		
			if(month<1||month>12){
				return false;
				
			}

			if((month==1||month==3||month==5||month==7||month==8||month==10||month==12) && (day>31 || day<1 )){
				return false;
			}

			if((month==4||month==6||month==9||month==11)&&(day>30||day<1)){
				return false;
			}

			if(month==2 && (day>28||day<1)){
				return false;
			}
		return true; 
		
	}
	//toString method that will return the date in mm/dd/yyyy format 
	public String toString(){
		String month=Integer.toString(this.month);
		String day=Integer.toString(this.day);
		String year=Integer.toString(this.year);
		String date= month+"/"+day+"/"+year;
		return date;


	}
	//compareTo method that will be used for selection sort. Checks one date212 object against another
	public boolean compareTo(Date212 x){
		if(x.year>year){
			return true;
		
		}
		else if(x.year<year){
			return false;
		}
		else if(x.month>month){
			return true;
		}
		else if(x.month<month){
			return false;
		}
		else if(x.day>day){
			return true;
		}

		return false;

	}



}