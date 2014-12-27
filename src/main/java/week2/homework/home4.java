
package week2.homework;

import java.util.Scanner;


public class home4 
{
    public static void main(String[] args) 
    {
      int n;
      Scanner scan = new Scanner(System.in);
      System.out.print(" Input = ");
      n = scan.nextInt();
      for (int i = 0; i <= (n/2) ;i ++)
      {
          System.out.print(" เลขคู่ = ");
          System.out.println(i*2);
      }
      for (int i = 0; i <= (n) ;i ++)
      {
          if(i%3==0 && i > 0)
          {
          System.out.print(" เลข หาร 3 ลงตัว = ");
          System.out.println(i);
          }
      }
    }
    
}
