package edu.osu.cs362;
/**
 *  This class provides a basic set of test cases for the
 *  Appt class.
 */
import org.junit.Test;

import static org.junit.Assert.*;

public class ApptTest {
    /**
     * Test that the gets methods work as expected.
     */
	 @Test
	  public void test01()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }
    /**
     * Test that the gets methods work incorrectly.
     */
	 @Test
	  public void test02()  throws Throwable  {
		 int startHour=24;
		 int startMinute=60;
		 int startDay=32;
		 int startMonth=0;
		 int startYear=2017;
		 String title=null;
		 String description=null;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(24, appt.getStartHour());
		 assertEquals(60, appt.getStartMinute());
		 assertEquals(32, appt.getStartDay());
		 assertEquals(0, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());         		
	 }
    /**
     * Test that the gets methods work as expected and reassign variables.
     */
	 @Test
	  public void test03()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
                 //reassign variables
                 appt.setStartHour(startHour);
                 appt.setStartMinute(startMinute);
                 appt.setStartDay(startDay);
                 appt.setStartMonth(startMonth);
                 appt.setStartYear(startYear);
                 appt.setTitle(title);
                 appt.setDescription(description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

    /**
     * Test that the gets methods work incorrectly.
     */
	 @Test
	  public void test04()  throws Throwable  {
		 int startHour=12;
		 int startMinute=60;
		 int startDay=32;
		 int startMonth=0;
		 int startYear=2017;
		 String title=null;
		 String description=null;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(12, appt.getStartHour());
		 assertEquals(60, appt.getStartMinute());
		 assertEquals(32, appt.getStartDay());
		 assertEquals(0, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());         		
	 }
    /**
     * Test that the gets methods work incorrectly.
     */
	 @Test
	  public void test05()  throws Throwable  {
		 int startHour=12;
		 int startMinute=30;
		 int startDay=32;
		 int startMonth=0;
		 int startYear=2017;
		 String title=null;
		 String description=null;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(12, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(32, appt.getStartDay());
		 assertEquals(0, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());         		
	 }
    /**
     * Test that the gets methods work incorrectly.
     */
	 @Test
	  public void test06()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=0;
		 int startYear=2017;
		 String title=null;
		 String description=null;
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
                 String testString = appt.toString();
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(13, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(0, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());         		
	 }
    /**
     * Test that the gets methods work incorrectly.
     */
	 @Test
	  public void test07()  throws Throwable  {
		 int startHour=0;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
                 String testString = appt.toString();
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(0, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }
     /**
     * Test that the gets methods work incorrectly.
     */
	 @Test
	  public void test08()  throws Throwable  {
		 int startHour=13;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=4;
		 int startYear=2017;
		 String title="Birthday Party";
		 String description="This is my birthday party.";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
                 String testString = appt.toString();
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(0, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(04, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Birthday Party", appt.getTitle());
		 assertEquals("This is my birthday party.", appt.getDescription());         		
	 }

}
