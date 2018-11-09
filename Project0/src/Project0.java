//Importing library from JDK
import javax.swing.JOptionPane;

public class Project0{
	public static void main(String[] args){
		//Initializiing Variables
		String userSentence="";
		String stop= "stop";
		//Creating loop that will quit once user types stop 
		while(!(userSentence.equalsIgnoreCase(stop))){
			//Getting user's input
			userSentence = JOptionPane.showInputDialog(null, "Please Enter A Sentence.");
			//initializing count
			int upperE=0;
			int lowerE=0;
			//Storing count of upper and lower case e's
			for(int i=0; i<userSentence.length(); i++){
				if(userSentence.charAt(i)=='E'){
				upperE=upperE+1;
				}
				if(userSentence.charAt(i)=='e'){
				lowerE=lowerE+1;
				}

			}	
		//Pop up window with how many lower case and upper case e's
		JOptionPane.showMessageDialog(null, "Number of lower case e's: " + lowerE + "\n " + "Number of upper case e's:" + upperE);

		
		}

	}

}