package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  CalDay class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;


import org.junit.Test;

import static org.junit.Assert.*;

public class CalDayTest {
         @Test
         public void test01() throws Throwable {
            GregorianCalendar cal = new GregorianCalendar(2017, 2, 10);
            CalDay today = new CalDay();
            assertEquals(false, today.isValid());
         }
	 @Test
	  public void test02()  throws Throwable  {
            int startHour1 = 10;
            int startMinute1 = 30;
            String title1 = "Test Appointment";
            String description1 = "test appointment.";
            GregorianCalendar cal = new GregorianCalendar();
            CalDay today = new CalDay(cal);
            assertEquals(15, today.getDay());
            assertEquals(4, today.getMonth());
            assertEquals(2017, today.getYear());
            Appt appt1 = new Appt(startHour1,
                  startMinute1 ,
                  today.getDay() ,
                  today.getMonth() ,
                  today.getYear() ,
                  title1 ,
                  description1);
            today.addAppt(appt1);
            assertEquals(1, today.getSizeAppts());
            int startHour2 = 9;
            int startMinute2 = 30;
            String title2 = "Test Appointment";
            String description2 = "test appointment.";
            Appt appt2 = new Appt(startHour2,
                  startMinute2 ,
                  today.getDay() ,
                  today.getMonth() ,
                  today.getYear() ,
                  title2 ,
                  description2);
            today.addAppt(appt2);
            assertEquals(2, today.getSizeAppts());
	    int startHour3 = 11;
            int startMinute3 = 30;
            String title3 = "Test Appointment";
            String description3 = "test appointment.";
            Appt appt3 = new Appt(startHour3,
                  startMinute3 ,
                  today.getDay() ,
                  today.getMonth() ,
                  today.getYear() ,
                  title3 ,
                  description3);
            today.addAppt(appt3);
            assertEquals(3, today.getSizeAppts());
            int startHour4 = 10;
            int startMinute4 = 30;
            String title4 = "Test Appointment";
            String description4 = "test appointment.";
            Appt appt4 = new Appt(startHour4,
                  startMinute4 ,
                  today.getDay() ,
                  today.getMonth() ,
                  today.getYear() ,
                  title4 ,
                  description4);
            today.addAppt(appt4);
            assertEquals(4, today.getSizeAppts());

            String day = today.toString();

            assertTrue(today.isValid());
 }

}
