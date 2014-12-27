
package week2.homework;

import java.util.Scanner;


public class home2 
{
    public static void main(String[] args) 
    {
     float input1,input2,input3;
     Scanner scan = new Scanner(System.in);
     
     System.out.print(" Input1 : ");
     input1 = scan.nextFloat();
     System.out.print(" Input2 : ");
     input2 = scan.nextFloat();
     System.out.print(" Input3 : ");
     input3 = scan.nextFloat();
     if (input1 >= input2 && input1 >= input3  )
     {
         System.out.println(" Output1 = " + input1);
     }
     else if (input2 >= input1 && input2 >= input3  )
     {
         System.out.println(" Output2 = " + input2);
     }
     else if (input3 >= input1 && input3 >= input2)
     {
         System.out.println("Output3 = " + input3);        
     }
             
    }
}
