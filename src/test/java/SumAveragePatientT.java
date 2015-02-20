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
import week2.homework.Patient;
import week2.homework.YesNo;

/**
 *
 * @author Jasin007
 */
public class SumAveragePatientT 
{
    private int sum(IP ip)
    {
        
       return ip.getRoiel1().getScore()
               +ip.getRoiel2().getScore()
               +ip.getRoiel3().getScore()
               +ip.getRoiel4().getScore()
               +ip.getRoiel5().getScore();
    }
    @Test
    public void sum1Test() 
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
    public void sum2Test() 
    {
    IP ip = new IP();
    ip.setRoiel1(YesNo.Yes);
    ip.setRoiel2(YesNo.Yes);
    ip.setRoiel3(YesNo.Yes);
    ip.setRoiel4(YesNo.Yes);
    ip.setRoiel5(YesNo.Yes);
   
    assertEquals(5,sum(ip));
    
    }
}
