/**********************************************************
* *
* CSCI 470/502 Assignment 3 summer 2022
* *
* Developer(s): Trevor Berggren
* *
* Due Date: 7/1/2022
* *
* Purpose: Tip calculator app with input from the keyboard 
* *
**********************************************************/ 

import java.util.Scanner;

/***************************************************************************
* *
* Main method to run the program
* *
****************************************************************************/
public class TipApp
{
  public static void main(String[] args)
  {
    TipApp TipApp1 = new TipApp();              // Makes an object of itself to call calculateTips method
    
    System.out.println("*** Tip Calculator ***");       // prints the first header
    
    TipApp1.calculateTips();                    //calls calculateTips
    
    
  }
  
  /***************************************************************************
* *
* calculateTips scans the key board for input then calls the mehtods to 
* do the math to calc the tip
* *
****************************************************************************/
  public void calculateTips()
  {
    TipCalculator TipCalculator1 = new TipCalculator(0,20,1); // Decalres new object of TipCalculator
    double billAmount;                                        // Declaring varibles needed 
    int tipAmount;
    int partSizeAmount;
    Scanner input = new Scanner(System.in);
    boolean loop;                                             
    
    do                                                           // Starts the loop for repeated input 
    {
      System.out.print("Enter the bill amount: ");               // Askes for the bill amount
    
    while(!input.hasNextDouble())                                // Runs a loop while the input gotten is not an valid number
    {
      System.out.println("Please enter a valid bill amount. ");
      System.out.print("Enter the bill amount: ");
      input.next();
      
    }
    
    billAmount = input.nextDouble();                              // assigns input to bill amount
    TipCalculator1.setBill(billAmount);                           // Passes amount to TipCalulator class
    
    
    System.out.print("Enter your desired tip percentage (20 equals 20%): ");   // askes for tip %
    
    while(!input.hasNextInt())                                    // runs a loop till a valid amount is gotten 
    {
      System.out.println("Please enter a valid tip percentage. ");
      System.out.print("Enter your desired tip percentage (20 equals 20%): ");
      input.next();
    }
   
    tipAmount = input.nextInt();                                  // assigns input to varible
    TipCalculator1.setTip(tipAmount);                             // passes to tipcal method 
 
    
    System.out.print("Enter the size of your party: ");           // askes for party size
    while(!input.hasNextInt())                                    // runs loop till valid input is gotten 
    {
      System.out.println("Please enter a valid party size. ");
      System.out.print("Enter the size of your party: ");
      input.next();
    }
    
    partSizeAmount = input.nextInt();                             //assigns input to vairble 
    TipCalculator1.setPartySize(partSizeAmount);                  // passes to method 
    
    
      // Prints the bill information with the total amount with tip and per person
      // then asks if there is another bill
      System.out.println("*** Your Bill ***\n");
      System.out.printf("Bill Amount: $%s%n",TipCalculator1.getBill());
      System.out.printf("Tip Percentage: %s%s%n",TipCalculator1.getTip(), "%");
      System.out.printf("Party Size: %s%n%n",TipCalculator1.getPartySize());
      System.out.printf("Total Bill (with Tip): $%.2f%n",TipCalculator1.getTotalBill());
      System.out.printf("Share for Each Individual: $%.2f%n%n",TipCalculator1.getIndividualShare());
      
      System.out.print("Another bill? (y/n)");
      
      if(input.next().toLowerCase().charAt(0) == 'y')
        loop = true;                                  // checking for y or Y to keep going
        
       else
       {
        loop = false;                                 // program stops if anything else is gotten 
        System.out.println("Thank you!");
        
       }
      
   
  } while(loop);                                       // while loop is true runs the do while again
    
  }
  
}