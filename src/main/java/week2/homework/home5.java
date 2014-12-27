
package week2.homework;

import java.util.Arrays;

public class home5 
{
    
    public int getmax(int[] num)
   {      
       int max = num[num.length - 1];
       return max;
   }
    public int[] getbubblesort(int[] num)
   {
       int temp;
        for(int i=0; i < num.length; i++){
 
            for(int j=1; j < num.length; j++)
            {
                if(num[j-1] > num[j])
                {
                    temp = num[j-1];
                    num[j-1] = num[j];
                    num[j] = temp;
                    
                }
                
            }
            System.out.println(" Next step : = " + Arrays.toString(num));
        }
        return num;
   }
}
