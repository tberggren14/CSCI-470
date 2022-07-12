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
    MileRedemptionApp MileRedemptionApp1 = new MileRedemptionApp();
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

  Destination[] destinationArray = (Destination[]) MileRedeemerObj.destinationList.toArray(new
        Destination[MileRedeemerObj.destinationList.size()]);

  String[] cityNames = MileRedeemerObj.getCityNames(destinationArray);

  MileRedeemerObj.printDestinations(cityNames);

  System.out.print("Please enter your client's accumulated Frequent Flyer Miles: ");
  userMiles = input.nextInt();

  System.out.print("Please enter your client's month of departure (1-12): ");
  departure = input.nextInt();

  }
  
}