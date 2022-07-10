public class Invoice
{
  private String part_num; // declare varibles
  private String part_desc;
  private int quantity;
  private double price;
  
  // constructor
  public Invoice(String part_num, String part_desc,int quantity, double price )
  {
    this.part_num = part_num;     //Assigning local varibles 
    this.part_desc = part_desc;
    this.quantity = quantity;
    this.price = price;
  }
  
  public void setPartNum(String part_num)
  {
    this.part_num = part_num;      // set method for part number
  }
  
  public void setPartDesc(String part_desc)
  {
    this.part_desc = part_desc;     // set method for part desc
  }
  
  public void setQuantity(int quantity)
  {
    this.quantity = quantity;         // set method for quantity
  }
  
  public void setPrice(double price)
  {
    this.price = price;              // set method for price
  }
  
  public String getPartNum()
  {
    return part_num;                  // set method for part number
  }
  
  public String getPartDesc()
  {
    return part_desc;                  // get method for part desc 
  }
  
  public int getQuantity()
  {
    return quantity;                  // get method for quantity
  }
  
  public double getPrice()
  {
    return price;                     // price 
  }
  
  public double getInvoiceAmount()
  {
    return ( price * quantity);        // times price by the quantity return result
    
    
  }
}