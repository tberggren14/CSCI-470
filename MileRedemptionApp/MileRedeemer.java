import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;
import java.util.Comparator;

public class MileRedeemer
{
  ArrayList<Destination> destinationList = new ArrayList<Destination>();
  Destination[] destinationArray;
  int remainingMiles;

/***************************************************************************
* *
* readDestinations
* returns nothing
* Reads the destinations into an ArrayList and sorts by distance
* *
****************************************************************************/
  
  public void readDestinations(Scanner fileScanner)
  throws IOException
  {


    String tempCity = null;
    int tempMiles = 0;
    int tempSuperMiles = 0;
    int tempAdditionalMiles = 0;
    int tempStartMonth = 0;
    int tempEndMonth= 0;
    

    while(fileScanner.hasNextLine())
    {
      String temp[] = fileScanner.nextLine().split(";");      // spliting the input line

        tempCity = temp[0];
      
        tempMiles = Integer.parseInt(temp[1]);                  // parsing for ints after the string
        tempSuperMiles = Integer.parseInt(temp[2]);
        tempAdditionalMiles = Integer.parseInt(temp[3]);

        String[] month = temp[4].split("-");                    // spliting the months 

        tempStartMonth = (Integer.parseInt(month[0]));
        tempEndMonth = (Integer.parseInt(month[1]));

        Destination newDestination = new Destination(tempCity, tempMiles, tempSuperMiles, tempAdditionalMiles,
        tempStartMonth, tempEndMonth);                            // making a new Destination object to add to the ArrayList

        destinationList.add(newDestination);                      // add to ArrayList
  }

    destinationArray = (Destination[]) destinationList.toArray(new
    Destination[destinationList.size()]);                         // convert the ArrayList to an array and put in destinationArray 

    MileageComparator sortDest = new MileageComparator();         // declare the MileageComparator object
    Arrays.sort(destinationArray,sortDest);                       // sort using the MileageComparator
  
      
  }

/***************************************************************************
* *
* getCityNames
* returns string[]
* sorts the destinations 
* *
****************************************************************************/
  public String[] getCityNames() 
  {
    int loop = 0;
    String[] availableDest = new String[destinationArray.length]; 
    
    for(int x = 0; x < destinationArray.length; x++)              // loops through destinationArray
    {
        availableDest[x] = destinationArray[x].toString();        // convert to string
    }
    
    Arrays.sort(availableDest);                                   // sort
    return availableDest;
    
  }
  
/***************************************************************************
* *
* redeemMiles
* returns string[]
* Holds the algo for redeeming miles
* *
****************************************************************************/
  public String[] redeemMiles(int miles, int month)
  {
    setRemainingMiles(miles);
    boolean superMileCheck = false;

    String[] returnDestinations = null;
    int[] upgradeToFirstClass = new int[destinationArray.length];
    ArrayList<String> listOfDestinations = new ArrayList<String>();
    int upgradeIndex = 0;

    for(Destination dest : destinationArray)        // loop through destinationArray
    {                                               // and make a new Destination object

      superMileCheck = checkSuperMiles(dest,month);   // check if the month is within the saving month

      if(superMileCheck)
      {
        if(dest.getSavingMiles() <= remainingMiles)    // use the savingmiles
        {
          listOfDestinations.add(dest.getCity());     // add the current Destination
          setRemainingMiles(remainingMiles - dest.getSavingMiles());       // set the new remaining Miles
          upgradeToFirstClass[upgradeIndex] = (dest.getAdditionalMiles());    //  where the destination was found to check later on for upgrade
          upgradeIndex++;                                                     // acumulate index
        }
        
      }

      else
      {
        if(dest.getMiles() <= remainingMiles)
        {
          listOfDestinations.add(dest.getCity());                     // add current destination
          setRemainingMiles(remainingMiles - dest.getMiles());        // set new remainingMiles
          upgradeToFirstClass[upgradeIndex] = (dest.getAdditionalMiles());    //  where the destination was found to check later on for upgrade
          upgradeIndex++;

        }
      }

      returnDestinations = listOfDestinations.toArray(new String[listOfDestinations.size()]);  // convert ArrayList to string array
    }

      for(int x = 0; x < upgradeIndex; x++)                             // loop through upgradeIndex to see if upgrade is possible
      {
        if(upgradeToFirstClass[x] <= remainingMiles)
        {                                                                 // if upgrade to first class is possible
          setRemainingMiles(remainingMiles - upgradeToFirstClass[x]);     // set new remainingMiles
          returnDestinations[x] = returnDestinations[x] + " in First Class";      // add first class to returnDestinations array
       }

        else
        {
          returnDestinations[x] = returnDestinations[x] + " in Economy Class";    // if upgrade not possible add Economy to array
        }
      }

  return returnDestinations;                                                  
    
  }

/***************************************************************************
* *
* setRemainingMiles
* takes in miles and set remainingMiles
* *
****************************************************************************/
  public void setRemainingMiles(int miles)
  {
    this.remainingMiles = miles;
  }

/***************************************************************************
* *
* getRemainingMiles
* returns remainingMiles
* *
****************************************************************************/
  public int getRemainingMiles()
  {
    return remainingMiles;
  }
  
/***************************************************************************
* *
* printDestinations
* prints off the destinations in order
* *
****************************************************************************/
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

/***************************************************************************
* *
* checkSuperMiles
* return boolean
* method checks if the destination is within the saving month 
* *
****************************************************************************/
  public boolean checkSuperMiles(Destination dest,int month)
  {
    return (dest.getStartMonth() <= month && dest.getEndMonth() >= month);
    
  }

}