/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;
import java.util.Scanner;
/**
 *
 * @author kristina shedlock
 */
public class QuizAttemptChart {
    
    public static void main(String[] args){
        //input scanner to answer the users question
        Scanner userScanner = new Scanner(System.in);
        
    //variable amounts
        int number = ((10*5)-(7*2));
        int attempt = 0;
        int userinput = 0;
        
    //loop will end after 3 unsucessful tries
    while(attempt < 3){
    
    //Print opening
    System.out.println("   Math Problem Checker   ");
                
    
        
        //Problem
        System.out.println("What is the value of (10*5)-(7*2)? You have 3 tries. ");
        
        //store userinput
        userinput= userScanner.nextInt();
        
        //user answer correct
        if (userinput == number){
            System.out.println(" Correct!! Way to go!! ");
            break;
        }
        //if answer incorrect
        else{
            System.out.println("Incorrect answer");
                
            //if answer low
        if(userinput<number)
            System.out.println("You are too low");
        }//close else  
                
            //if answer high
        if(userinput>number)
            System.out.println("You are too high");
                
            //tally of attempts
        if (attempt <2){
            System.out.println("You have another chance");
                 }
            //increase count of loop with each try
            attempt++;
                
                //if count eaquals 3 give answer and termintate loop
        if(attempt>=3){
            System.out.println("The correct answer is " + number);   
               
    }//close if
        
    }//close while          
                   
    }//close main
                
    }//Close QuizAttemptChart
                
            
        
   
                
    

