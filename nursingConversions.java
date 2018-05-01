/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.util.Scanner;
/**
 *
 * @author donettesvidron
 */
public class nursingConversions {
    
    public static void main(String[] args){ 
        
        //create scanner to gather user input
        Scanner scan = new Scanner(System.in);
        
        //gather information for caluculation from user
        System.out.println("Enter patients weight in pounds.");
        double userWeight = scan.nextDouble();
        
        //call calcWeightFromLbs
        double returnedWeight = calcWeightFromLbs(userWeight);
        
        //print the answer
        System.out.println("The weight in kilograms of a patient weighing " 
            + userWeight + " pounds is " + returnedWeight);
        System.out.println("------------------------------------------------");
        
        //gather information from user
        System.out.println("Enter how many grams of medication you have.");
        double userGrams = scan.nextDouble();
        
        //call calcGramsFromMg
        double returnedMg = calcMgFromGrams(userGrams);
        
        //print out answer
        System.out.println("You have " + returnedMg + " mg in " + userGrams + " grams of medication");
        System.out.println("-------------------------------------------------");
        
        //gather information form user
        System.out.println("How many mls of IV fluid do you need to run in an hour?");
        double userMls = scan.nextDouble();
        
        //call mlPerHour
        double returnedRate = calcDripPerMin(userMls);
        
        //print out answer
        System.out.println("If you need to run " + userMls + (" over an hour the rate of mls per minute "
            + "is "  + returnedRate));
        System.out.println("------------------------------------------------");
    }//close main method
    
    public static double calcWeightFromLbs(double returnWeight){
        
        //calc kgs
        double kgs = (returnWeight * 2.2);
        //return to method
        return kgs;
    }//close method
    
    public static double calcMgFromGrams(double returnMg){
        
        //calc mg
        double mg = (returnMg * 1000 );
        //return to method
        return mg;
    }//close method
    
    public static double calcDripPerMin(double returnRate){
        
        //calc drips per minute
        double mls = (returnRate / 60);
        //return to method
        return mls;
    }
    }
    

