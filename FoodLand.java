/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects1;

/**
 *
 * @author donettesvidron
 */
public class FoodLand {
    
    final static int nibble = 5;
    final static int bite = 10;
   
    public static void main(String[] args){
        
        Food firstSandwich;
        firstSandwich = new Food ();
        firstSandwich.name = "Steak and Cheese";
        firstSandwich.simulateEating(nibble);
        printObjectDataSandwich(firstSandwich);
        System.out.println();
        
        Food secondSandwich;
        secondSandwich = new Food();
        secondSandwich.name = "Peanutbutter and Jelly";
        secondSandwich.simulateEating(bite);
        printObjectDataSandwich(secondSandwich);
        System.out.println();
        
        System.out.println("Eating " + firstSandwich.name);
        System.out.println("Nib Nib Nib........");
        firstSandwich.simulateEating(nibble);
        printObjectDataSandwich(firstSandwich);
        System.out.println();
        
        System.out.println("Eating " + secondSandwich.name);
        System.out.println("Chomp Chomp Chomp......");
        secondSandwich.simulateEating(bite);
        printObjectDataSandwich(secondSandwich);
        System.out.println();
        
        Food firstIcecream;
        firstIcecream = new Food();
        firstIcecream.name = "Vanilla";
        firstIcecream.simulateEating(nibble);
        printObjectDataIcecream(firstIcecream);
        System.out.println();
        
        Food secondIcecream;
        secondIcecream = new Food();
        secondIcecream.name = "Cookie Dough";
        secondIcecream.simulateEating(bite);
        printObjectDataIcecream(secondIcecream);
        System.out.println();
        
        System.out.println("Eating " + firstIcecream.name);
        System.out.println("Nib Nib Nib......");
        firstIcecream.simulateEating(nibble);
        printObjectDataIcecream(firstIcecream);
        System.out.println();
        
        System.out.println("Eating " + secondIcecream.name);
        System.out.println("Chomp Chomp Chomp......");
        secondIcecream.simulateEating(nibble);
        printObjectDataIcecream(secondIcecream);
        System.out.println();
        
        
   
    }
    private static void printObjectDataIcecream(Food inputIcecream){
        System.out.println("|----------Icecream STATS----------|");
        System.out.println(" Name of Icecream: " + inputIcecream.name);
        System.out.println(" Percent Remaining: " + inputIcecream.getPercRemaining());
        System.out.println("|--------------------------------|");
    } // close printObjectDataIcecream method
    
    private static void printObjectDataSandwich(Food inputSandwich){
        System.out.println("|----------Sandwich STATS-----------|");
        System.out.println(" Name of Sandwich: " + inputSandwich.name);
        System.out.println(" Percent Remaining: " + inputSandwich.getPercRemaining());
        System.out.println("|--------------------------------|");
    } // close printObjectDataSandwich
    
}
