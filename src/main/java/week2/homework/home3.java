
package week2.homework;

import java.util.Scanner;


public class home3 
{

    
    public static void main(String[] args) 
    {
        float input;
        int key ;
        Scanner scan = new Scanner(System.in);
        System.out.print("Input = ");
        input = scan.nextFloat();
        if (input >= 80 && input <= 100 )
        {
             key = 1 ;
        }
        else if (input < 80 && input >= 75)
        {
             key = 2 ;
        }
         else if (input < 75 && input >= 70)
        {
            key = 3;
        }
         else if (input < 70 && input >= 65)
        {
            key = 4;
        }
         else if (input < 65 && input >= 60)
        {
            key = 5;
        }
         else if (input < 60 && input >= 55)
        {
             key = 6;
        }
         else if (input < 55 && input >= 50)
        {
            key = 7;
        }
         else if (input <= 49 && input >= 0 )
        {
            key = 8;
        }
         else  
        {
            key = 9 ;
        }
        switch (key)
        {
            case 1 :
                System.out.println(" YOU GIVE A");
                break;
            case 2 :
                System.out.println(" YOU GIVE B+");
                break;
            case 3 :
                System.out.println(" YOU GIVE B");
                break;
            case 4 :
                System.out.println(" YOU GIVE C+");
                break;
            case 5 :
                System.out.println(" YOU GIVE C");
                break;
            case 6 :
                System.out.println(" YOU GIVE D+");
                break;
            case 7 :
                System.out.println(" YOU GIVE D");
                break;
            case 8 :
                System.out.println(" YOU GIVE F");
                break;
            case 9 :
                System.out.println(" Erorr ");
                break;
        }
    }
}
