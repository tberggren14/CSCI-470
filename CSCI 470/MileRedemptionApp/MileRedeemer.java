import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MileRedeemer
{
  
  public void readDestinations(Scanner fileScanner)
  throws IOException
  {
    ArrayList<Destination> destinationList = new ArrayList<Destination>();
    
    destinationList.add();
      
    for(int x = 1; x < temp.length(); x++)
    {
      destinationList.add(Integer.parseInt(temp[x]));
      
      if(x == 3)
      {
        String[] month = temp[x].spilt("-");
        destinationList.add(Integer.parseInt(month[0]));
        destinationList.add(Integer.parseInt(month[1]));
                
      }
      
    }
      
  }
  
  public String[] getCityNames() 
  {
    
  }
  
  public String[] redeemMiles(int miles, int month)
  {
    
    
  }
  
  public int getRemainingMiles( )
  {
    
  }
  
  
  
  
}