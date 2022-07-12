import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.lang.String;
import java.util.Arrays;

public class MileRedeemer
{
  ArrayList<Destination> destinationList = new ArrayList<Destination>();
  
  public void readDestinations(Scanner fileScanner)
  throws IOException
  {


    String tempCity;
    int tempMiles;
    int tempSuperMiles;
    int tempAdditionalMiles;
    int tempStartMonth;
    int tempEndMonth;

    while(fileScanner.hasNextLine())
    {
      String temp[] = fileScanner.nextLine().split(";");

        tempCity = temp[0];
      
        tempMiles = Integer.parseInt(temp[1]);
        tempSuperMiles = Integer.parseInt(temp[2]);
        tempAdditionalMiles = Integer.parseInt(temp[3]);

        String[] month = temp[4].split("-");

        tempStartMonth = (Integer.parseInt(month[0]));
        tempEndMonth = (Integer.parseInt(month[1]));

        Destination newDestination = new Destination(tempCity, tempMiles, tempSuperMiles, tempAdditionalMiles,
        tempStartMonth, tempEndMonth);

        destinationList.add(newDestination);
  }
      
  }

  public String[] getCityNames(Destination[] destinationArray) 
  {
    int loop = 0;
    String[] availableDest = new String[9]; 
    for(int x = 0; x < destinationArray.length; x++)
    {
        availableDest[x] = destinationArray[x].toString();
        

    
    }
    
    return availableDest;
    
  }
  
  /*public String[] redeemMiles(int miles, int month)
  {
    
    
  }
  
  public int getRemainingMiles( )
  {
    int tempReturn;
    return tempReturn;
  }
  */

  public void printDestinations(String[] cityNames)
  {
    System.out.println("\n----------------------------------------------------------------");
    System.out.println("     WELCOME TO THE JAVA AIRLINES MILES REDEMPTION APP");
    System.out.println("----------------------------------------------------------------");
    System.out.println("\nList of destination cities your client can travel to:\n");

    for(int x = 0; x < cityNames.length; x++)
       System.out.printf("%s%n",cityNames[x]);

    System.out.println("\n----------------------------------------------------------------\n");
  }
  
  
  
}