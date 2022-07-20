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
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class MileRedemptionApp
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in); // new scanner 
    
    MileRedeemer MileRedeemerObj = new MileRedeemer(); // declaring MileRedeemer object
    int userMiles = 0;                                 // varibles for user input
    int departure = 0;
    
    System.out.print("Please enter the name of the file: ");
    
  try                                                   
  {                                                     // had to use try catch for throws IOException
    String userFile = input.nextLine();
    Scanner fileScanner = new Scanner(new File(userFile));      // making new scanner file
    
    MileRedeemerObj.readDestinations(fileScanner);              // calls readDestinations to read the destinations
  }

  catch(IOException e) 
  {
    e.printStackTrace();    
  }

  String[] cityNames = MileRedeemerObj.getCityNames();          // assigns the city names to be printed

  MileRedeemerObj.printDestinations(cityNames);                 // calls printDestinations to print off the full list
  boolean loop;

  do                                                            // start of the do while loop
  {

  System.out.print("Please enter your client's accumulated Frequent Flyer Miles: ");
  userMiles = input.nextInt();                                                        // getting user input

  System.out.print("Please enter your client's month of departure (1-12): ");
  departure = input.nextInt();


  String[] travelDest = null;                                                 // declaring varible to be used for where the user can go
  travelDest = MileRedeemerObj.redeemMiles(userMiles,departure);

  if(travelDest.length >= 1)                                                  // checks if something came back from redeemMiles
  {
    System.out.printf("%n%s%n", "Your client's Frequent Flyer Miles can be used to redeem the following tickets:");

    for(int x = 0; x < travelDest.length; x++)                                // prints off all the dests they can do and what class
    {
      System.out.print("* A trip to ");
      System.out.printf("%s%n", travelDest[x]);                           

    }

  }

  // if travelDest is 0
  else
    System.out.printf("%n%s%n", "*** Your client has not accumulated enough Frequent Flyer Miles ***");



   System.out.printf("%n%s%s", "Your client's remaining Frequent Flyer Miles: ", MileRedeemerObj.getRemainingMiles());

   System.out.println("\n\n----------------------------------------------------------------\n");

   Scanner continueInput = new Scanner(System.in);

   System.out.print("Do you want to continue (y/n)? ");

   if(continueInput.nextLine().toLowerCase().charAt(0) == 'y')
    loop = true;

   else 
    loop = false;

  }while(loop);

  System.out.println("\n-------------------------------------------------------------------------");
  System.out.println("     THANK YOU FOR USING THE JAVA AIRLINES MILES REDEMPTION APP ");
  System.out.println("-------------------------------------------------------------------------");



  }
  
}