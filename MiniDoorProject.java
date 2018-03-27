/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;
/**
 *
 * @author Kristina Shedlock
 */
public class MiniDoorProject {
    public static void main(String[] args){
      
        //scanner for user input
        Scanner userInput = new Scanner(System.in);
        //variable for integer door number
        int number;
        //input for methods
        int methodUse;
        
        //creating doors
        
        System.out.println("Pick a fortune telling door to learn your future!");
        
        System.out.println("|=======|    |=======|    |=======|");
        System.out.println("|   1   |    |   2   |    |   3   |");
        System.out.println("|       |    |       |    |       |");
        System.out.println("|       |    |       |    |       |");
        System.out.println("|0      |    |0      |    |0      |");  
        System.out.println("|       |    |       |    |       |");     
        System.out.println("|       |    |       |    |       |");
        System.out.println("|       |    |       |    |       |");
        System.out.println("|_______|    |_______|    |_______|");
        
        // user int input for door choice
        System.out.println("Enter your door number...");
        number = userInput.nextInt();
    
        //switch cases
        switch(number){
            
            case 1:
                open1();
                break;
                
            case 2:
                open2();
                break;
                
            case 3:
                open3();
                break;
                
            default:
                System.out.println("The End");
                
        }//close class       
    }      
        //three methods
        
    //single job of this method is to repond to door 1
        public static void open1(){
            
            System.out.println("-------------------------------------------------------");
            System.out.println("It is a good day to have a good day so have a good day.");
            System.out.println("-------------------------------------------------------");
        }//close open1
        
        //the single job of this method is to respond to door 2
        public static void open2(){
            
            System.out.println("-------------------------------------------");
            System.out.println("Someone will invite you to a karaoke party.");
            System.out.println("-------------------------------------------");
        }//close open2      
        
        //the single job of this method is to respond to door3
        public static void open3(){
            
            System.out.println("------------------------------------------------------------------");
            System.out.println("The road to riches is paved with homework so you better get on it.");
            System.out.println("------------------------------------------------------------------");
        }//close open3
        
    }//close main

