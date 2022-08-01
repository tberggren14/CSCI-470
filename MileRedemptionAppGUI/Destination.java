import java.util.ArrayList;

public class Destination
{
  private String city = null;
  private int miles = 0;
  private int savingMiles = 0;
  private int additionalMiles = 0;
  private int startMonth = 0;
  private int endMonth = 0;

/***************************************************************************
* *
* constructor
* *
****************************************************************************/

  public Destination(String city, int miles,int savingMiles,int additionalMiles,int startMonth,int endMonth)
  {
    this.city = city;
    this.miles = miles;
    this.savingMiles = savingMiles;
    this.additionalMiles = additionalMiles;
    this.startMonth = startMonth;
    this.endMonth = endMonth;

  }
  
/***************************************************************************
* *
* setCity
* sets city
* *
****************************************************************************/
  public void setCity(String city)
  {
    this.city = city;
    
  }
  
/***************************************************************************
* *
* setMiles
* sets miles
* *
****************************************************************************/
  public void setMiles(int miles)
  {
    this.miles = miles;
    
  }
  
/***************************************************************************
* *
* setSavingMiles
* sets savingMiles
* *
****************************************************************************/
  public void setSavingMiles(int savingMiles)
  {
    this.savingMiles = savingMiles;
    
  }
  
/***************************************************************************
* *
* setAdditionalMiles
* sets additionalMiles need to upgrade
* *
****************************************************************************/
  public void setAdditionalMiles(int additionalMiles)
  {
    this.additionalMiles = additionalMiles;
    
  }
  
/***************************************************************************
* *
* setStartMonth
* sets the start month of savings month
* *
****************************************************************************/
  public void setStartMonth(int startMonth)
  {
    this.startMonth = startMonth;
    
  }
  
/***************************************************************************
* *
* setEndMonth
* sets the end month of savings month
* *
****************************************************************************/
  public void setEndMonth(int endMonth)
  {
    this.endMonth = endMonth;
    
  }
  
/***************************************************************************
* *
* getCity
* return city
* *
****************************************************************************/
  public String getCity()
  {
    return city;
    
  }
  
/***************************************************************************
* *
* getMiles
* return miles
* *
****************************************************************************/
  public int getMiles()
  {
    return miles;
    
  }
  
/***************************************************************************
* *
* getSavingMiles
* return savingMiles
* *
****************************************************************************/
  public int getSavingMiles()
  {
    return savingMiles;
    
  }
  
/***************************************************************************
* *
* getAdditionalMiles
* return additionalMiles
* *
****************************************************************************/
  public int getAdditionalMiles()
  {
    return additionalMiles;
    
  }
  
/***************************************************************************
* *
* getStartMonth 
* returns startMonth
****************************************************************************/
  public int getStartMonth()
  {
    return startMonth;
    
  }
  
/***************************************************************************
* *
* getEndMonth 
* returns endMonth
* *
****************************************************************************/
  public int getEndMonth()
  {
    return endMonth;
    
  }

/***************************************************************************
* *
* Override the toString method to print cities
* *
****************************************************************************/
  @Override 
  public String toString() 
  {
    String out = "";
  
    out = city ;

    return out;
  }
  
}