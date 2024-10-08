/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comproject;

import java.util.Scanner;
import java.util.ArrayList;
//import static comproject.Car.Repayments;

public class COMPROJECT {

    private static double formula;
    private static double Formula;
    
   
   
    public static void main(String[] args) {
        
        
         Scanner scan = new Scanner(System.in);

        System.out.println("Enter your gross monthly income before deduction:");
        double income = scan.nextInt();

        System.out.println("Enter estimated monthly tax deduction:");
        double deduction = scan.nextInt();
        scan.nextLine(); 

        System.out.println("Enter monthly expenditures:");

        ArrayList<Expense> expenditure= new ArrayList<>();

        System.out.print("Enter price for Groceries expense: ");
        double price1 = scan.nextInt();
        expenditure.add(new Groceries(price1));
        scan.nextLine(); 

       
        System.out.print("Enter price for Water and Lights: ");
        double price2 = scan.nextInt();
        expenditure.add(new WaterAndLignths(price2));
        scan.nextLine();

        System.out.print("Enter price for Travel costs: ");
        double price3 = scan.nextInt();
        expenditure.add(new Travel(price3));
        scan.nextLine(); 

    
        System.out.print("Enter price for Cell phone and telephone: ");
        double price4 = scan.nextInt();
        expenditure.add(new cellPhones(price4));
        scan.nextLine(); 

        
        System.out.print("Enter price for Other Expenses: ");
        double price5 = scan.nextInt();
        expenditure.add(new Other(price5));
        scan.nextLine(); 

        int choose;
        do {

            System.out.println("What would you like to do?:");
            System.out.println("1.Rent ");
            System.out.println("2. Buying a house");
            choose = scan.nextInt();
        	if (choose == 1) {
                System.out.println("Enter your monthly rental amount:");
                Double RentPay = scan.nextDouble();
                expenditure.add(new Rent(RentPay));
                
            } else if (choose == 2) {
                System.out.println("\nEnter the following details about buying the house:");
                System.out.println("Enter the purchase price of the house:");
                double purchasePrice = scan.nextInt();

                System.out.println("Enter the total deposit:");
                double deposit = scan.nextInt();

                System.out.println("Enter the interest rate :");
                double percentage = scan.nextInt();

                System.out.println("Enter number of months to repay (between 240 and 360):");
                int monthlyPay = scan.nextInt();
                
                expenditure.add(new HomeLoan(purchasePrice,deposit,percentage/100,monthlyPay));
            }
            
            else {
                System.out.println("Invalid choice. Please enter '1 for Rent' or ' 2 for Buying'.");
                     
             
            
            }
       
        }while(choose != 1 && choose != 2);
        
        double Cost =0;
       for(Expense i : expenditure) {
    	   Cost+= i.calculate();
       }
       double remBalance= income -deduction -Cost;
       System.out.println("\nYour monthly Expenses cost:" + " R" + Cost );
       System.out.println("\nYour monthly remaining balance:" + " R" + remBalance ); 

       int Select ;
       
       do{
    	    System.out.println(" ");
       		System.out.println("Do you wanna buy a car??");
            System.out.println("1. Yes");
            System.out.println("2. No");
            Select = scan.nextInt();
	       if (Select==1){
	       
		       System.out.println("\nEnter the following details about buying a Car");
		       System.out.println("Enter the model of your car");
		       String model = scan.nextLine();
		       System.out.println("Enter the make of your car");
		       String make = scan.nextLine();
		       
		       System.out.println("Enter the purchase price of the vehicle");
		       double PRICE = scan.nextDouble();
		       
		       System.out.println("Total deposit:" + "R ");
		       double Deposit = scan.nextDouble();
		       
		       System.out.println("Enter the interest rate of ");
		       double Interest_Rate = scan.nextDouble();
		       
		       System.out.println("Enter your Insurance premium");
		       int Insurance = scan.nextInt();
		       
		       expenditure.add(new Car(model,make,PRICE,Deposit,Interest_Rate/100,Insurance));
	       }
	       
	       else if(Select==2) {
	       
	           System.out.println("Thank you");
	       }
	       else{
	       		System.out.println("invalid choice: choose either 1 or 2");
	       }
       
       }while(Select!= 1 && Select!=2);
       
       for(int i=0;i<expenditure.size();i++){
       		for(int j=1;j<expenditure.size();j++){
       			if(expenditure.get(i).calculate()> expenditure.get(j).calculate()){
       				Expense temp = expenditure.get(i);
       	            expenditure.set(i, expenditure.get(j));
       	            expenditure.set(j, temp);
       			}
       		}
       	}
       	System.out.println(" ");
       	for(Expense i : expenditure) {
    	   System.out.println("Expense: " + i.getDescription() + "  Cost: " + i.calculate());
       }
      
double notify = income *0.75;

if(remBalance<notify){

   System.out.println("Your monthly remaining balance exceed 75% of your income");
} 
else if(remBalance>notify){

System.out.println("Your monthly remaining balance is enough");
}

        
        
    
// SIR  THIS ARE THE ONLY PEOPLE I WOKRED WITH IN THIS PROJECT
    
/*
 * MPHIGALALE GUNDO 23017865
 * SIKHWENI RONEWA 23001946
 * NDOU KONANANI 23000807
 * MAKHOSHI VHULENDA 24028007
 * NETSHITUNGULU ODA 24026738
 * 
 *
   */ 
       scan.close();
    }
    
}
