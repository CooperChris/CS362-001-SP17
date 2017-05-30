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
                Appt appt = new Appt(12, 30, cal.get(cal.DAY_OF_MONTH), cal.get(cal.MONTH), cal.get(cal.YEAR), "Birthday", "birthday");

                //create variables for hour, minute and counter of appts
                int hour, min, count = 0;
                //start a loop to change values and begin adding appointments
                for (int i = 0; i < 1000; i++){
                     //check if appt is valid
                     if (appt.getValid() == true){
                        //add to counter
                        count = count + 1;
                     }
                     //add appt to day
                     day.addAppt(appt);

                     //check that size of day appts is same as count
                     assertEquals(count, day.getSizeAppts());

                     //change values for start hour and minute
                     appt.setStartHour((int)ValuesGenerator.getRandomIntBetween(rnd, 12, 24));
                     appt.setStartMinute((int)ValuesGenerator.getRandomIntBetween(rnd, 30, 60));
                }
                for (int i = 0; i < 1000; i++){
                     //check if appt is valid
                     if (appt.getValid() == true){
                        //add to counter
                        count = count + 1;
                     }
                     //add appt to day
                     day.addAppt(appt);

                     //check that size of day appts is same as count
                     assertEquals(count, day.getSizeAppts());

                     //change values for start hour and minute
                     appt.setStartHour((int)ValuesGenerator.getRandomIntBetween(rnd, -1, 12));
                     appt.setStartMinute((int)ValuesGenerator.getRandomIntBetween(rnd, -1, 30));
                } 

	 }


	
}
