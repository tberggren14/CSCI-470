import java.util.ArrayList;

public class Destination
{
  private String city;
  private int miles;
  private int superMiles;
  private int additionalMiles;
  private int startMonth;
  private int endMonth;

  public Destination(String city, int miles,int superMiles,int additionalMiles,int startMonth,int endMonth)
  {
    this.city = city;
    this.miles = miles;
    this.superMiles = superMiles;
    this.additionalMiles = additionalMiles;
    this.startMonth = startMonth;
    this.endMonth = endMonth;

  }
  
  public void setCity(String city)
  {
    this.city = city;
    
  }
  
  public void setMiles(int miles)
  {
    this.miles = miles;
    
  }
  
  public void setSuperMiles(int superMiles)
  {
    this.superMiles = superMiles;
    
  }
  
  public void setAdditionalMiles(int additionalMiles)
  {
    this.additionalMiles = additionalMiles;
    
  }
  
  public void setStartMonth(int startMonth)
  {
    this.startMonth = startMonth;
    
  }
  
  public void setEndMonth(int endMonth)
  {
    this.endMonth = endMonth;
    
  }
  
  public String getCity()
  {
    return city;
    
  }
  
  public int getMiles()
  {
    return miles;
    
  }
  
  public int getSuperMiles()
  {
    return superMiles;
    
  }
  
  public int getAdditionalMiles()
  {
    return additionalMiles;
    
  }
  
  public int getStartMonth()
  {
    return startMonth;
    
  }
  
  public int getEndMonth()
  {
    return endMonth;
    
  }

  @Override 
  public String toString() 
  {
    String out = "";
  
    out = city ;

    return out;
  }
  
}