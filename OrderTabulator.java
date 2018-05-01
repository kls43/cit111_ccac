/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week8;

import java.util.Scanner;

/**
 *
 * @author donettesvidron
 */
public class OrderTabulator {
   
//declare number for total per order
   static int lunchSpecial1= (0);
   static int lunchSpecial2 = (0);
   
   static double TotalCost2 =(0);
   static double TotalCost = (0);
   
   static double TotalCost2Tax = (0);
   static double TotalCostTax = (0);
   
   static final int displayOrderTotals =(0);
   
   static int totalSpecial1 = (0);
   static int totalSpecial2 = (0);
   static int totalCombined =(0);
   
//declare number for total of day
   static int totalLunchSpecial1Ordered = (0);
   static int totalLunchSpecial2Ordered = (0);
   
// declare number for user lunch choice
   int choice = (0);
   int num = (0);       
   
//price per meal
   final static double PricePerLunch1 = (8.99);
   final static double PricePerLunch2 = (9.99);
   
   
//total revenue for day
   final static double TotalRevenue =(0);
   final static double totalLunch1Revenue = (0);
   final static double totalLunch2Revenue = (0);
   
    public static void main(String[] args){
       
    
    //begin POS for lunch specials
    
    System.out.println("Welcome to Lunch with Us.");
    System.out.println("---------------------------------------------------");
    System.out.println("Please choose a lunch special.");
    System.out.println("Press |1| for the chicken sandwich with fries.");
    System.out.println("Press |2| frot the steak salad with ranch dressing.");
    System.out.println("---------------------------------------------------");

//create user input
    int userSelection;
    
    Scanner scanner = new Scanner(System.in);
    int i = 0;
    
    while (i==0){
        userSelection = scanner.nextInt();
        
        switch(userSelection){
            case 1:
                orderLunchSpecial1();
                break;
        
            case 2:
                orderLunchSpecial2();
                break;
            
            case 3:
                orderEnd();
                break;
              
          
        }//close switch1
     
    }//close while  
    
}//close main
    
    public static void orderLunchSpecial1(){
        System.out.println("How many would you like? ");
        
        Scanner scanner= new Scanner(System.in);
        totalLunchSpecial1Ordered = scanner.nextInt();
        
        System.out.println(" Your chicken specials are coming up.");
        
        TotalCost =  (double) (PricePerLunch1 * totalLunchSpecial1Ordered);
        System.out.println(" Your price is $" + TotalCost);
        
        TotalCostTax = ((TotalCost * .07) + TotalCost);
        System.out.println(" Including tax $" + TotalCostTax);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
          System.out.println(" If you would like to order a steak salad special press 2, if you want to"
                + " check out press 3");
          totalSpecial1 = totalLunchSpecial2Ordered;
    }
        
    public static void orderLunchSpecial2(){
        System.out.println("How many would you like? ");
        
        Scanner scanner= new Scanner(System.in);
        totalLunchSpecial2Ordered = scanner.nextInt();
        
        System.out.println(" Your steak salad specials are coming up.");
        
        TotalCost2 =  (double) (PricePerLunch2 * totalLunchSpecial2Ordered);
        System.out.println(" Your price is $" + TotalCost2);
        
        TotalCost2Tax = ((TotalCost2 * .07) + TotalCost2);
        System.out.println("Including tax $" + TotalCost2Tax);
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        System.out.println(" If you would like to order a chicken special press 1, if you want to"
                + " check out press 3");
        totalSpecial2 = totalLunchSpecial2Ordered;
    }         
    public static void orderEnd (){
        System.out.println("Your total is $" + (TotalCostTax + TotalCost2Tax));
        System.out.println("Thank you. Please come again!");
        System.out.println("");
        displayOrderTotals();
    }
    public static void displayOrderTotals(){
       System.out.println("-------------ORDER TOTALS-----------------");
       System.out.println("Total special number 1:" + totalSpecial1);
       System.out.println("Total Special number 2:" + totalSpecial2);
       
    }
        
}
    


