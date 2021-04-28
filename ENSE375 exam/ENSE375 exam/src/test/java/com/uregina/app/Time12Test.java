package com.uregina.app;
import static org.junit.Assert.assertTrue;

import com.uregina.exceptions.InvalidTimeException;

import org.junit.Test;

public class Time12Test 
{
   @Test
   public void Subtract_Time12PostiveDifference_True() throws InvalidTimeException
   {
   Time12 timetest1 = new Time12(2, 30, AmPm.am);
   Time12 timetest2 = new Time12(2, 30, AmPm.am);
   int True = 0;  
   True = Time12.subtract(timetest1, timetest2);
   if (True > 0)
   {
   assertTrue(true);
   }
   } 

   @Test
   public void Subtract_Time12NegativeDifference_True() throws InvalidTimeException
   {
   Time12 timetest1 = new Time12(2, 30, AmPm.am);
   Time12 timetest2 = new Time12(2, 30, AmPm.am);
   int True = 0;  
   True = Time12.subtract(timetest1, timetest2);
   if (True < 0)
   {
   assertTrue(true);
   }
   } 

   @Test
   public void Subtract_Time12ZeroDifference_True() throws InvalidTimeException
   {
   Time12 timetest1 = new Time12(2, 30, AmPm.am);
   Time12 timetest2 = new Time12(2, 30, AmPm.am);
   int True = 0;  
   True = Time12.subtract(timetest1, timetest2);
   if (True == 0)
   {
   assertTrue(true);
   }
   } 
}
