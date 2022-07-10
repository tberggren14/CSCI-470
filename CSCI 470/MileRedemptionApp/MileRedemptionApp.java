import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class MileRedemptionApp
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    MileRedeemer MileRedeemerObj = new MileRedeemer();
    
    System.out.print("Please enter the name of the file: ");
    input.hasNext();
    
    Scanner fileScanner = new Scanner(input);
    
    while(fileScanner.hasNextLine())
    {
      MileRedeemerObj.readDestinations(fileScanner);
    }
    
    
  }
  
  
}