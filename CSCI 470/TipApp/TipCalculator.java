
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
public class TipCalculator
{
  double bill = 0;                     // Declaring varibles
  int tip = 20;
  int partySize = 1;
  
  /***************************************************************************
* *
* constructor
* *
****************************************************************************/
  public TipCalculator(double bill,int tip,int partySize)
  {
    this.bill = bill;
    this.tip = tip;
    this.partySize = partySize;
  }
  
  /***************************************************************************
* *
* Set method for bill
* *
****************************************************************************/
  public void setBill(double bill)
  {
    this.bill = bill;
  }
  
    /***************************************************************************
* *
* Set method for tip
* *
****************************************************************************/
  public void setTip(int tip)
  {
    this.tip = tip;
    
  }
  
    /***************************************************************************
* *
* Set method for Partysize
* *
****************************************************************************/
  public void setPartySize(int partySize)
  {
    this.partySize = partySize;
  }
  
    /***************************************************************************
* *
* Get method for bill
* *
****************************************************************************/
  public double getBill()
  {
    return bill;
  }
  
  /***************************************************************************
* *
* Get method for tip
* *
****************************************************************************/
  public int getTip()
  {
    return tip;
  }
  
  /***************************************************************************
* *
* Get method for partysize
* *
****************************************************************************/
  public int getPartySize()
  {
    return partySize;
  }
  
  /***************************************************************************
* *
* Get method for total bill which is bill * tip + bill
* *
****************************************************************************/
  public double getTotalBill()
  {
    return (bill * tip) / 100 + bill;
  }
  
  /***************************************************************************
* *
* Get method for the individual share for the total bill 
* *
****************************************************************************/
  public double getIndividualShare()
  {
    return ( (bill * tip) / 100 + bill ) / partySize;
  }
  
}