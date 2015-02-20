
package week2.homework;

import java.util.Scanner;

public class home6 
{
    private static boolean is(char ch,char start,char end)
    { 
        return (int) start <= (int) ch && (int) ch <= (int) end ;
    }
    private static boolean isString(char ch)
    { 
        return is(ch,'A','Z') || is(ch,'a','z');
    }
    public static void main(String[] args) 
    {
      String Input1;
      Scanner scan = new Scanner(System.in);
      System.out.print("Input : ");
      Input1 = scan.nextLine();
      System.out.println("ความยาวของข้อความ " + (Input1.length()) +" ตัวอักษร");
      int i=1;
     String[] input2 = Input1.split("-", 3);
        for(String inputi : input2 ){
            System.out.println(" แยก" + (i++) + " : "+inputi);
        }
        
        System.out.println();
        System.out.println("ตัวอักษร : "+Input1.replaceAll("[^a-zA-Z]",""));
        System.out.println("ตัวเลข : "+Input1.replaceAll("[^0-9]",""));

    }
    
}
