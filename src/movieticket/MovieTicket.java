/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movieticket;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class MovieTicket
{

    //Declarations
    static int Age;
    static int Day;
    static double Price;
    static boolean Weekday;
    
    
    
    public static void getInput()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age");
        Age = input.nextInt();
        System.out.println("Enter day of week using numbers 1-7 (1 = Monday , 7 = Sunday etc");
        Day = input.nextInt();
        
    }
    
    public static void calculateCost()
    {
        switch(Day)
        {
           case 1:
           {
                Weekday = true;
                if (Weekday == true)
                        {
                            if (Age <= 12)
                            {
                                if (Age >= 65)
                                {
                                    
                                }
                            }
                            
                        }
                                   
           }
           case 2:
               Weekday = true;
           case 3:
               Weekday = true;
           case 4:
               Weekday = true;
           case 5:
               Weekday = true;
           case 6:
               Weekday = false;
           case 7:
               Weekday = false;      
        }
        
    }
    
    public static void main(String[] args)
    {
        
        
    }
    
}
