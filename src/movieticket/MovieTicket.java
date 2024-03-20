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
        System.out.println("Enter day of week using numbers 1-7 (1 = Monday , 7 = Sunday etc)");
        Day = input.nextInt();
        
    }
    
    public static void calculateCost()
    {
        switch(Day)
        {
           case 1:
           {            
            if ((Age <= 12) || (Age >= 65))
            {
             Price = 5;
             break;
            }
            else
            {
             Price = 10;
             break;
            }
                        
           }
           case 2:
            if ((Age <= 12) || (Age >= 65))
            {
             Price = 5;
             break;
            }
            else
            {
             Price = 10;
             break;
            }
           case 3:
            if ((Age <= 12) || (Age >= 65))
            {
             Price = 5;
             break;
            }
            else
            {
             Price = 10;
             break;
            }
           case 4:
            if ((Age <= 12) || (Age >= 65))
            {
             Price = 5; 
             break;
            }
            else
            {
             Price = 10;
             break;
            }
           case 5:
            if ((Age <= 12) || (Age >= 65))
            {
             Price = 5;
             break;
            }
            else
            {
             Price = 10;
             break;
            }
           case 6:
            if ((Age <= 12) || (Age >= 65))
            {
             Price = 10;
             break;
            }
            else
            {
             Price = 15;
             break;
            }
           case 7:
            if ((Age <= 12) || (Age >= 65))
            {
             Price = 10;
             break;
            }
            else
            {
             Price = 15;
             break;
            }
            default:
            {
              Price = 15;  
            }
            
        }   
    }
    
    public static void display()
    {
        System.out.println("Price: $" + Price);
    }
    
    public static void main(String[] args)
    {
        getInput();
        calculateCost();
        display();
        
        
        
    }
    
}
