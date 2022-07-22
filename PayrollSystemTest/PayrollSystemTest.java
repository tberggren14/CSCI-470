/**********************************************************
* *
* CSCI 470/502 Assignment 5 summer 2022
* *
* Developer(s): Trevor Berggren
* *
* Due Date: 7/1/2022
* *
* Purpose:  Modify the payroll system
* *
**********************************************************/

// Employee hierarchy test program.

import java.util.Scanner;

public class PayrollSystemTest 
{
   public static void main(String[] args) 
   {
      Date date1 = new Date(6, 15, 1944);
      Date date2 = new Date(12, 29, 1960);
      Date date3 = new Date(9, 8, 1954);
      Date date4 = new Date(3, 3, 1965);

      // create subclass objects
      SalariedEmployee salariedEmployee = 
         new SalariedEmployee("John", "Smith", "111-11-1111",date1, 800.00);
      HourlyEmployee hourlyEmployee = 
         new HourlyEmployee("Karen", "Price", "222-22-2222",date2, 16.75, 40);
      CommissionEmployee commissionEmployee = 
         new CommissionEmployee(
         "Sue", "Jones", "333-33-3333",date3, 10000, .06);
      BasePlusCommissionEmployee basePlusCommissionEmployee = 
         new BasePlusCommissionEmployee(
                  "Bob", "Lewis", "444-44-4444",date4, 5000, .04, 300);
      

      System.out.println("Employees processed individually:");
      
      System.out.printf("%n%s%n%s: $%,.2f%n%n", 
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", hourlyEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee, "earned", commissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n", 
         basePlusCommissionEmployee, 
            "earned", basePlusCommissionEmployee.earnings());

      Scanner input = new Scanner(System.in);

      System.out.print("Enter the current month (1 - 12): ");

      int employeeBirthMonth = input.nextInt();

      // create four-element Employee array
      Employee[] employees = new Employee[4]; 

      // initialize array with Employees
      employees[0] = salariedEmployee;
      employees[1] = hourlyEmployee;
      employees[2] = commissionEmployee; 
      employees[3] = basePlusCommissionEmployee;

      System.out.printf("Employees processed polymorphically:%n%n");
      
      // generically process each element in array employees
      for (Employee currentEmployee : employees) 
      {
         System.out.println(currentEmployee); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee) 
         {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               (BasePlusCommissionEmployee) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         } 

         
         // check if it is the currentEmployees employeeBirthMonth
         // if it is add 100 for a birthday bonus
         if(employeeBirthMonth == currentEmployee.getBirthDay())
         {
             System.out.printf(
            "earned $%,.2f%s%n%n", currentEmployee.earnings(), " plus $100.00 birthday bonus");

         }

         else
            System.out.printf(
            "earned $%,.2f%n%n", currentEmployee.earnings());
      } 

      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++)
         System.out.printf("Employee %d is a %s%n", j, 
            employees[j].getClass().getName()); 
   } // end main
} // end class PayrollSystemTest