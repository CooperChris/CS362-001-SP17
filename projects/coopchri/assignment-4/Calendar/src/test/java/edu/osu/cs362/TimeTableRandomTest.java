package edu.osu.cs362;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.LinkedList;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for TimeTable class.
 */

public class TimeTableRandomTest {
	
    /**
     * Generate Random Tests that tests TimeTable Class.
     */
	 @Test
	  public void radnomtest()  throws Throwable  {
               //create random and ValuesGenerator
               Random rnd = new Random(100);
               //ValuesGenerator gen = new ValuesGenerator();
	       //create a timetable, and gregorian calendar
               GregorianCalendar cal = new GregorianCalendar();
               TimeTable table = new TimeTable();
               //create an linked list of appts
               LinkedList<Appt> appts = new LinkedList<Appt>();
               LinkedList<Appt> testAppts = new LinkedList<Appt>();
               LinkedList<Appt> testApptsNew = new LinkedList<Appt>();
               //create ten appointments at random that are all valid
               for (int i = 0; i < 100; i++){
                  Appt appt = new Appt(12, 30, 
                        cal.get(cal.DAY_OF_MONTH), 
                        cal.get(cal.MONTH), 
                        cal.get(cal.YEAR), 
                        "Birthday", "birthday");
                  appt.setStartHour((int)ValuesGenerator.getRandomIntBetween(rnd, 1, 23));
                  appt.setStartMinute((int)ValuesGenerator.getRandomIntBetween(rnd, 1, 59));
                  appts.add(appt);
                  testAppts.add(appt);
               }
               Appt appt = new Appt(12, 30, 
                     cal.get(cal.DAY_OF_MONTH), 
                     cal.get(cal.MONTH), 
                     cal.get(cal.YEAR), 
                     "Birthday", "birthday");

               //create one invalid appt
               appt.setStartHour(-10);
               appts.add(appt);
               //create null appt
               appts.add(null);

               /*/create CalDay and add appts
                 CalDay day = new CalDay(cal);
               //loop through all of appts and add to cal
               for (int i = 0; i < appts.size(); i++){
               day.addAppt(appts.get(i));
               }*/

               //create variables to help test
               int size = appts.size();
               int index = 0;

               //loop 1000 times and try to delete a random appointment
               for (int i = 0; i < 1000; i++){
                  //get random index
                  index = (int)ValuesGenerator.getRandomIntBetween(rnd, 0, size-1);
                  //delete that appointment
                  testApptsNew = table.deleteAppt(testAppts, appts.get(index));
                  if (testApptsNew == null){
                     testApptsNew = table.deleteAppt(testApptsNew, appts.get(index));
                  }
               }
          }



}
