
package week2.homework;

import java.util.Arrays;

public class home5Main 
{

    public static void main(String[] args) 
    {
        int num[] ={9,8,7,6,5};
        home5 ooo = new home5();  
        System.out.println("Bubble sort ครับผม");
        int[] sort = ooo.getbubblesort(num);
        System.out.println("Final result : " + Arrays.toString(sort));
        int max = ooo.getmax(num);
        System.out.println("MAX Input = " + max);
    }
    
}
