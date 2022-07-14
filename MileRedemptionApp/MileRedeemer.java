import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.lang.String;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Collections;


public class MileRedeemer
{
  ArrayList<Destination> destinationList = new ArrayList<Destination>();
  Destination[] destinationArray;
  int remainingMiles;
  ArrayList<String> listOfDestinations = new ArrayList<String>();
  
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

    destinationArray = (Destination[]) destinationList.toArray(new
    Destination[destinationList.size()]);

    MileageComparator sortDest = new MileageComparator();
    Arrays.sort(destinationArray,sortDest);
  
      
  }

  public String[] getCityNames() 
  {
    int loop = 0;
    String[] availableDest = new String[9]; 
    
    for(int x = 0; x < destinationArray.length; x++)
    {
        availableDest[x] = destinationArray[x].toString();
    }
    
    Arrays.sort(availableDest);
    return availableDest;
    
  }
  
  public String[] redeemMiles(int miles, int month)
  {
    setRemainingMiles(miles);
    boolean superMileCheck = false;

    for(Destination dest : destinationArray)
    {
      superMileCheck = checkSuperMiles(dest,month);

      if(superMileCheck)
      {
        if(dest.getSuperMiles() <= remainingMiles)
        listOfDestinations.add(dest.getCity());
        setRemainingMiles(remainingMiles - dest.getSuperMiles());
        
      }

      else
      {
        if(dest.getMiles() <= remainingMiles)
        {
          listOfDestinations.add(dest.getCity());
          setRemainingMiles(remainingMiles - dest.getMiles());
        }
      }

    }
    
    String [] returnDestinations = new String[listOfDestinations.size()];

      for(int x = 0; x < listOfDestinations.size(); x++)
      {
        returnDestinations[1] = listOfDestinations.get(1);

      }

    
  return returnDestinations;
    
  }

  public void setRemainingMiles(int miles)
  {
    this.remainingMiles = miles;
  }

  public int getRemainingMiles()
  {
    return remainingMiles;
  }
  

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


  public boolean checkSuperMiles(Destination dest,int month)
  {
    return (dest.getStartMonth() <= month && dest.getEndMonth() >= month);
    
  }

}