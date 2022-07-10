public class InvoiceTest
{
  public static void main(String[] args)
  {
    // Declaring invoice instances 
    Invoice invoice1 = new Invoice("AB-01", "Hammer", 2, 9.99);
    Invoice invoice2 = new Invoice("AB-02", "Phillips head screwdriver", 5, 2.99);
    Invoice invoice3 = new Invoice("AB-03", "Light switch", 15, 1.99);
    Invoice invoice4 = new Invoice("AB-04", "Cordless drill", 10, 189.99);
    Invoice invoice5 = new Invoice("AB-05", "Carpenter's square", 7, 4.99);
    
      // 5 print statements 
      System.out.println("Invoice #1");
      System.out.printf("Part Number: %s%n", invoice1.getPartNum());
      System.out.printf("Item Description: %s%n", invoice1.getPartDesc());
      System.out.printf("Quantity: %s%n", invoice1.getQuantity());
      System.out.printf("Item Price: $%s%n", invoice1.getPrice());
      System.out.printf("Invoice Subtotal: $%s%n", invoice1.getInvoiceAmount());
      System.out.println("*****************\n");
      
      System.out.println("Invoice #2");
      System.out.printf("Part Number: %s%n", invoice2.getPartNum());
      System.out.printf("Item Description: %s%n", invoice2.getPartDesc());
      System.out.printf("Quantity: %s%n", invoice2.getQuantity());
      System.out.printf("Item Price: $%s%n", invoice2.getPrice());
      System.out.printf("Invoice Subtotal: $%s%n", invoice2.getInvoiceAmount());
      System.out.println("*****************\n");
      
      System.out.println("Invoice #3");
      System.out.printf("Part Number: %s%n", invoice3.getPartNum());
      System.out.printf("Item Description: %s%n", invoice3.getPartDesc());
      System.out.printf("Quantity: %s%n", invoice3.getQuantity());
      System.out.printf("Item Price: $%s%n", invoice3.getPrice());
      System.out.printf("Invoice Subtotal: $%s%n", invoice3.getInvoiceAmount());
      System.out.println("*****************\n");
      
      System.out.println("Invoice #4");
      System.out.printf("Part Number: %s%n", invoice4.getPartNum());
      System.out.printf("Item Description: %s%n", invoice4.getPartDesc());
      System.out.printf("Quantity: %s%n", invoice4.getQuantity());
      System.out.printf("Item Price: $%s%n", invoice4.getPrice());
      System.out.printf("Invoice Subtotal: $%s%n", invoice4.getInvoiceAmount());
      System.out.println("*****************\n");
      
      // last print statement
      System.out.println("Invoice #5");
      System.out.printf("Part Number: %s%n", invoice5.getPartNum());
      System.out.printf("Item Description: %s%n", invoice5.getPartDesc());
      System.out.printf("Quantity: %s%n", invoice5.getQuantity());
      System.out.printf("Item Price: $%s%n", invoice5.getPrice());
      System.out.printf("Invoice Subtotal: $%s%n", invoice5.getInvoiceAmount());
      System.out.println("*****************\n");
      
    
    
  }
  
  
}