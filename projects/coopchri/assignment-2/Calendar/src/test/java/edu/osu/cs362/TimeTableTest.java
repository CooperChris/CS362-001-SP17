package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  TimeTable class.
 */
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;


import org.junit.Test;

import static org.junit.Assert.*;

public class TimeTableTest {

	 @Test
	  public void test01()  throws Throwable  {
            LinkedList<Appt> appts = new LinkedList<Appt>();
            GregorianCalendar calendar = new GregorianCalendar(2017,
                  0, 28, 10, 30);

            GregorianCalendar calendar1 = new GregorianCalendar(2017,
                  0, 29, 10, 30);
            TimeTable table = new TimeTable();
            table.getApptRange(appts, calendar, calendar1);
          }
          @Test
	  public void test02()  throws Throwable  {
            LinkedList<Appt> appts = new LinkedList<Appt>();
            GregorianCalendar calendar = new GregorianCalendar(2017,
                  0, 28, 10, 30);

            GregorianCalendar calendar1 = new GregorianCalendar(2017,
                  0, 29, 10, 30);
         
            Appt appt = new Appt(2, 30, 12, 4, 2017, "Birthday",
                  "This is my birthday.");
            TimeTable table = new TimeTable();
            table.getApptRange(appts, calendar1, calendar);
            table.deleteAppt(appts, appt);
          }

}
