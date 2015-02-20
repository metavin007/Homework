/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.lang.reflect.Method;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import week2.homework.IP;
import week2.homework.OP;
import week2.homework.Patient;
import week2.homework.YesNo;

/**
 *
 * @author Jasin007
 */
// sum / n



public class SumAvgReflectionPatientT {
    
    
   private int sum(Patient patient) throws Exception
    {
       Method[] methods = patient.getClass().getMethods();
       int sum = 0;
       for(Method method : methods)
       {
          if(method.getName().startsWith("getRoie"))
          {
              YesNo yn = (YesNo)method.invoke(patient);
              sum = sum + yn.getScore();
          }
       }
       return sum;
    }
    private float average(Patient patient) throws Exception
{
return ((float)sum(patient)) / count(patient);
}
    
   private int count(Patient patient) throws Exception
    {
       Method[] methods = patient.getClass().getMethods();
       int count = 0;
       for(Method method : methods)
       {
          if(method.getName().startsWith("getRoie"))
          {
              count = count + 1;
          }
       }
       return count;
    }
    @Test
    public void sum1Test() throws Exception
    {
    IP ip = new IP();
    ip.setRoiel1(YesNo.Yes);
    ip.setRoiel2(YesNo.Yes);
    ip.setRoiel3(YesNo.No);
    ip.setRoiel4(YesNo.No);
    ip.setRoiel5(YesNo.Yes);
   
    assertEquals(3,sum(ip));
    
    }
    @Test
    public void sum2Test() throws Exception
    {
    IP ip = new IP();
    ip.setRoiel1(YesNo.Yes);
    ip.setRoiel2(YesNo.Yes);
    ip.setRoiel3(YesNo.Yes);
    ip.setRoiel4(YesNo.Yes);
    ip.setRoiel5(YesNo.Yes);
   
    assertEquals(5,sum(ip));
    assertEquals(0.6,average(ip),0.5);
    
    }
    @Test
    public void sum3Test() throws Exception
    {
    OP op = new OP();
    op.setRoiel1(YesNo.Yes);
    op.setRoiel2(YesNo.Yes);
    op.setRoiel3(YesNo.Yes);
    op.setRoiel4(YesNo.Yes);
    op.setRoiel5(YesNo.Yes);
    op.setRoiel6(YesNo.Yes);
    op.setRoiel7(YesNo.Yes);
   
    assertEquals(7,sum(op));
    
    }
}
