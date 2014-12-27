
package week2.homework;

import java.util.Scanner;


public class home1 {

   
    public static void main(String[] args) 
    {
        float number;
        Scanner scan = new Scanner(System.in);
        System.out.print(" Input : "); number = scan.nextFloat();
        
        if(number - (int)number == 0 )
        {
            System.out.println(" output = " + (int)number);
        }
        else
        {
            System.out.println(" output = " + number);
        }
        
    }
    
}
