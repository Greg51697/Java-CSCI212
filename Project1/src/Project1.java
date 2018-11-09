//importing libraries 
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;
import java.io.FileNotFoundException;
import java.awt.GridLayout;

import javax.swing.JTextArea;
import javax.swing.JFrame;
//Creating our Project1 class
public class Project1{
	public static void main(String[] args){
    	//creating two date212 arrays, one of which we will sort
    	Date212[] sorted= new Date212[50];
    	Date212[] unsorted=new Date212[50];
    	String input;
    	String[] result;
    	int counter=0;
    	//for the next 20 lines, we are reading our text file and parsing the strings, we then put them into both of our arrays if they pass our validity check 
      Scanner reader  = null;
      try{
        reader = new Scanner(new File("textfile.txt"));
       
      }catch (Exception e){
        System.out.println("scanner error");
      }

      while (reader.hasNext()){
        input=reader.nextLine();
        result=input.split(",");
        for(int i=0; i<result.length;i++){
            try{
             Date212 newDate= new Date212(result[i]);
             unsorted[counter]=newDate;
             sorted[counter] = newDate;
             counter=counter+1;
            }
            catch (Exception e){
              System.out.println("Not a valid date "+result[i]);
            }
              
        }

      } 
    	
		  //Here we call selection sort and then store our sorted and unsorted dates into a string of dates. 
  		selectionSort(sorted,counter);
      String unsort = "";
      String sort   = "";
      for(int i = 0; i < counter; i++){
        unsort =unsort + (unsorted[i].toString() + "\n");
        sort = sort + (sorted[i].toString() + "\n");
      }
      //We create our maingui and show the gui with the dates sorted and unsorted
      DateGui maingui = new DateGui("Project1",sort,unsort);
      maingui.showGui();
    	

  }

  //this is our selection sort that goes through our date212 array and sorts the dates from smallest to largest
  private static void selectionSort(Date212[] array,int length){
    for (int i = 0; i <length; i++){
      int smallestIndex = i; 
      for (int j = i + 1; j < length; j++){
        if (array[smallestIndex].compareTo(array[j])){
            smallestIndex = j;
        }
      }
      Date212 temp = array[i];
      array[i] = array[smallestIndex];
      array[smallestIndex] = temp;

    }
  }
  

}


    

