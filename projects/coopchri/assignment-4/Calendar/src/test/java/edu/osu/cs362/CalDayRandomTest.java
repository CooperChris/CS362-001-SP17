package edu.osu.cs362;


import org.junit.Test;
import java.util.Random;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;



/**
 * Random Test Generator  for CalDay class.
 */

public class CalDayRandomTest {

   /**
    * Generate Random Tests that tests CalDay Class.
    */
   @Test
   public void radnomtest()  throws Throwable  {
      Random rnd = new Random(100);
      GregorianCalendar cal = new GregorianCalendar();
      CalDay day = new CalDay(cal);
      //create the value generator and a appt
      //ValuesGenerator gen = new ValuesGenerator();

      //create variables for hour, minute and counter of appts
      int hour = 0, min = 0;
      //start a loop to change values and begin adding appointments
      for (int i = 0; i < 2000; i++){
         Appt appt = new Appt(12, 30, 
               cal.get(cal.DAY_OF_MONTH), 
               cal.get(cal.MONTH), 
               cal.get(cal.YEAR), 
               "Birthday", "birthday");

         if ((i%100) == 0){
         //change values for start hour and minute
         appt.setStartHour((int)ValuesGenerator.getRandomIntBetween(rnd, 25, 30));
         appt.setStartMinute((int)ValuesGenerator.getRandomIntBetween(rnd, 60, 70));
         }
         else{
       //change values for start hour and minute
         appt.setStartHour((int)ValuesGenerator.getRandomIntBetween(rnd, 12, 23));
         appt.setStartMinute((int)ValuesGenerator.getRandomIntBetween(rnd, 30, 59));
         }
         //add appt to day
         day.addAppt(appt);
      }
      for (int i = 0; i < 2000; i++){
         Appt appt = new Appt(12, 30, cal.get(cal.DAY_OF_MONTH), cal.get(cal.MONTH), cal.get(cal.YEAR), "Birthday", "birthday");

         //change values for start hour and minute
         appt.setStartHour((int)ValuesGenerator.getRandomIntBetween(rnd, 0, 12));
         appt.setStartMinute((int)ValuesGenerator.getRandomIntBetween(rnd, 0, 30));
          //add appt to day
         day.addAppt(appt);
      } 
   }



}
