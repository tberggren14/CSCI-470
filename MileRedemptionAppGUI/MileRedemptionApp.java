/**********************************************************
* *
* CSCI 470/502 Assignment 4 summer 2022
* *
* Developer(s): Trevor Berggren
* *
* Due Date: 7/15/2022
* *
* Purpose: a travel agent could
* present options for travel destinations to a client who wants to redeem his or her 
* accumulated frequent flyer
* miles. Reading in from a file
* *
**********************************************************/ 

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import javax.swing.JFrame;


public class MileRedemptionApp 
{
  public static void main(String[] args) 
  {

     MileRedemptionAppController app = new MileRedemptionAppController();
    
    MileRedeemer MileRedeemerObj = new MileRedeemer(); // declaring MileRedeemer object
    
    
  try                                                   
  {                                                     // had to use try catch for throws IOException
    String userFile = JOptionPane.showInputDialog(null, "Please enter the name of the file: ");
    Scanner fileScanner = new Scanner(new File(userFile));      // making new scanner file
    
    MileRedeemerObj.readDestinations(fileScanner);              // calls readDestinations to read the destinations
  }

  catch(IOException e) 
  {
    e.printStackTrace();    
  }

  app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //The JPanel was big enough on linux, but not on windows,
    //Corners will not be colored in...
    app.setSize(715, 340);
    app.setVisible(true);

}


}