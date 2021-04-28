package com.uregina.app;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import com.uregina.exceptions.InvalidTimeException;
import org.junit.Test;

public class DateTest 
{
    @Test
    public void Validate_DateTest1_True()
    {
      Date date = new Date(3, 20, 2021);
      boolean LegalInputDate = date.Date(20,3,2021);
      
      assertTrue(LegalInputDate);
    }

    @Test
    public void Validate_DateTest2_True()
    {
      Date date = new Date(2, 20, 2024);
      boolean LegalInputDate = date.Date(20,2,2024);
      assertTrue(LegalInputDate);
    }
    @Test
    public void Validate_DateTest3_False()
    {
      Date date = new Date(-20, 20, -1811);
      boolean IllegalInputDate = date.Date(20,-20,-1811);
      assertFalse(IllegalInputDate);
    }

    @Test
    public void Validate_DateTest4_True()
    {
      Date date = new Date(2, 20, 2022);
      boolean LegalInputDate = date.Date(20,2,2022);
      assertTrue(LegalInputDate);
    }

    @Test
    public void Validate_DateTest5_True()
    {
      Date date = new Date(3, 29, 2024);
      boolean LegalInputDate = date.Date(29,3,2024);
      assertTrue(LegalInputDate);
    }

    @Test
    public void Validate_DateTest6_False()
    {
      Date date = new Date(2, 29, -1811);
      boolean IllegalInputDate = date.Date(29,2,-1811);
      assertFalse(IllegalInputDate);
    }

    @Test
    public void Validate_DateTest7_False()
    {
      Date date = new Date(-20, 29, 2022);
      boolean IllegalInputDate = date.Date(29,-20,2022);
      assertFalse(IllegalInputDate);
    }

    @Test
    public void Validate_DateTest8_False()
    {
      Date date = new Date(2, 29, 2021);
      boolean IllegalInputDate = date.Date(29,2,2021);
      assertFalse(IllegalInputDate);
    }

    @Test
    public void Validate_DateTest9_False()
    {
      Date date = new Date(3, -40, 2021);
      boolean IllegalInputDate = date.Date(-40,3,-1811);
      assertFalse(IllegalInputDate);
    }

    @Test
    public void Validate_DateTest10_False()
    {
      Date date = new Date(2, -40, 2021);
      boolean IllegalInputDate = date.Date(-40,2,2022);
      assertFalse(IllegalInputDate);
    }

    @Test
    public void Validate_DateTest11_False()
    {
      Date date = new Date(-20, -40, 2021);
      boolean IllegalInputDate = date.Date(-40,-20,2021);
      assertFalse(IllegalInputDate);
    }

    @Test
    public void Validate_DateTest12_False()
    {
      Date date = new Date(-2, -40, 2024);
      boolean IllegalInputDate = date.Date(-40,-2,2024);
      assertFalse(IllegalInputDate);
    }

    @Test
    public void Validate_DateTest13_True()
    {
      Date date = new Date(3, 29, 2022);
      boolean LegalInputDate = date.Date(29,3,2022);
      assertTrue(LegalInputDate);
    }

    @Test
    public void Validate_DateTest14_False()
    {
      Date date = new Date(2, 29, 2021);
      boolean IllegalInputDate = date.Date(29,2,2021);
      assertFalse(IllegalInputDate);
    }

    @Test
    public void Validate_DateTest15_False()
    {
      Date date = new Date(-20, 29 , 2024);
      boolean IllegalInputDate = date.Date(29,-20,2024);
      assertFalse(IllegalInputDate);
    }

    @Test
    public void Validate_DateTest16_False()
    {
      Date date = new Date(2, 29, -1811);
      boolean IllegalInputDate = date.Date(29,2,-1811);
      assertFalse(IllegalInputDate);
    }
}

/*Reference
Lab3 ENSE 375
Lab
*/



}
