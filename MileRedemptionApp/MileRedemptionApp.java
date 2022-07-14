import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class MileRedemptionApp
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner(System.in);
    
    MileRedeemer MileRedeemerObj = new MileRedeemer();
    int userMiles;
    int departure;
    
    System.out.print("Please enter the name of the file: ");
    
  try 
  {
    String userFile = input.nextLine();
    Scanner fileScanner = new Scanner(new File(userFile));
    
    MileRedeemerObj.readDestinations(fileScanner);
  }

  catch(IOException e) 
  {
    e.printStackTrace();
  }

  String[] cityNames = MileRedeemerObj.getCityNames();

  MileRedeemerObj.printDestinations(cityNames);

  System.out.print("Please enter your client's accumulated Frequent Flyer Miles: ");
  userMiles = input.nextInt();

  System.out.print("Please enter your client's month of departure (1-12): ");
  departure = input.nextInt();


  String[] travelDest = MileRedeemerObj.redeemMiles(userMiles,departure);

  //for(int x = 0; x < travelDest.length; x++)
  System.out.printf("%n%s%S",travelDest[0]," ");



  }
  
}