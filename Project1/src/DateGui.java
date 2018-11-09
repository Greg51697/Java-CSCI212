//importing libraries 
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

import java.awt.GridLayout;

import javax.swing.JTextArea;
import javax.swing.JFrame;

public class DateGui extends JFrame{
	private JTextArea leftTextArea;
    private JTextArea rightTextArea;
	
	public DateGui(String title,String s, String u){
		 
        super(title);

        //setting certain parameters
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(100, 100);
        setLocation(200, 200);
        setLayout(new GridLayout(1, 2)); 

        
        // Initialize the JTextArea variables 
        // string representation, and its number of rows and columns
        leftTextArea = new JTextArea(u, 5, 20);
        rightTextArea = new JTextArea(s, 5, 20);

        // Add the JTextArea's to the content pane
        getContentPane().add(leftTextArea);
        getContentPane().add(rightTextArea); 
    }
    //showGui function that will display GUI
    public void showGui()
    {
        pack();
        setVisible(true);
    }
    
    
}













