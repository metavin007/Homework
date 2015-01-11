
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
      System.out.print("In put : ");
      Input1 = scan.nextLine();
      System.out.println("ความยาวของข้อความ " + (Input1.length()) +" ตัวอักษร");
      String Input2 = "JASIN-SAENGSUANG-ORAN";
      System.out.println("ข้อความก่อนตัด = JASIN-SAENGSUANG-ORAN");
      System.out.println(Input2.subSequence(0,5));
      System.out.println(Input2.subSequence(6,16));
      System.out.println(Input2.subSequence(17,21));
     /* String Input3 = "ACB000DFG111";
      System.out.println("ข้อความก่อนแยก = ACB000DFG111");
      String x1 = (String) Input3.subSequence(0,3);
      String x2 = (String) Input3.subSequence(4,6);
      String x3 = (String) Input3.subSequence(7,9);
      String x4 = (String) Input3.subSequence(10,12); 
      String x5 = x2.concat(x4);
      String x6 = x1.concat(x3); */
      System.out.println("ตัวอักษร ตัวเลข : " + Input1);
      String str ="";
      String number ="";
     
    }
    
}
