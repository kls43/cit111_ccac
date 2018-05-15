/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Final_Project;
import java.util.Scanner;
/**
 *
 * @author donettesvidron
 */
public class Patient {
    
    private String appointments = " ";
    private String firstName;
    private String lastName;
    private String  appointment;
    private int insurance;
    private static int copay = 25;
    private static int patientID = 10255;
    private int bill = 0;       
    private int copayBalance;
    private int chooseinsurance;
    
    public Patient(){
        Scanner in = new Scanner(System.in);
        
        System.out.println(" Enter patient's first name");
        this.firstName =in.nextLine();
        
        System.out.println(" Enter patient's last name");
        this.lastName =in.nextLine();
        
        System.out.println("----------------------------------------------------");
        System.out.println(firstName + " " + lastName);
        System.out.println("----------------------------------------------------");
        System.out.println("Patient ID is " + patientID);
        System.out.println("----------------------------------------------------");
      
    }
    
    private void setPatientID(){
        patientID++;
        this.patientID = patientID + 1;
    
    }
    public void appointment(){
    
        
        System.out.println("1 - Cardiac");
        System.out.println("2 - Endocrine");
        System.out.println("3 - Pulmonology");
        System.out.println("4 - Internal Medicine");
        System.out.println("Press 0 to complete");   
        System.out.println("----------------------------------------------------");
        do {
            
        System.out.println(" Choose the specialties needed:");

      
        
        Scanner in = new Scanner(System.in);
        String appointment = in.nextLine();
        
        if (!appointment.equals("0")){
        appointments = appointments + "  " + appointment;
                copayBalance = copayBalance + copay;
    }
        else{
            break;
        }
             
        }while (1 !=0);  
     System.out.println("");
     System.out.println(" Appointments for:" + appointments);}
        
    public void chooseinsurance(){
        
         System.out.println("");
         System.out.println(" Choose patient's insurance by number");
         System.out.println ("1 - UPMC");
         System.out.println("2 - Medicare");
         System.out.println("3 - Allegheny Health");
        
         
        Scanner in = new Scanner(System.in);         
        this.insurance =in.nextInt();
        
        if (insurance ==1) {
            System.out.println("Cardiac:           Dr. Jackson     412-724-9865");
            System.out.println("Endocrine:         Dr. Myers       412-669-1257");
            System.out.println("Pulmonology:       Dr. Kurland     412-558-9462");
            System.out.println("Internal Medicine: Dr. Smith       724-826-45326");}
        
        if (insurance == 2){
            System.out.println("Cardiac:           Dr. Wright      412-516-4642");
            System.out.println("Endocrine:         Dr. Winston     412-852-5649");
            System.out.println("Pulmonology:       Dr. Maxwell     412-469-4656");
            System.out.println("Internal Medicine: Dr. Michael     724-515-4954");}
            
        if (insurance == 3){
            System.out.println("Cardiac:           Dr. Castelli    724-576-8494");
            System.out.println("Endocrine:         Dr. Svidron     724-976-1236");
            System.out.println("Pulmonology:       Dr. Weiers      724-168-4687");
            System.out.println("Internal Medicine: Dr. Cost        724-469-4125");}
        }
         
        
    

    public void viewBalance(){
        System.out.println("----------------------------------------------------");
        System.out.println("Your total copay balance is $" + copayBalance);
      
    }
    public void payCopay(){
        
        System.out.println("Enter the amount of paymentfor today: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        copayBalance = copayBalance - payment;
        System.out.println("----------------------------------------------------");
        System.out.println("Thank you for your payment of $" + payment);
        System.out.println("----------------------------------------------------");
        viewBalance();
    }
        }
         
       
