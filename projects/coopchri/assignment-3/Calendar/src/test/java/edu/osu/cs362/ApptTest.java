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
		 int startHour=11;
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
                 assertEquals("\t4/10/2017 at 11:30am ,Birthday Party, This is my birthday party.\n", testString);
	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(11, appt.getStartHour());
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
		 assertTrue(!appt.getValid());
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
                 appt.setStartHour(startHour-24);
                 assertTrue(!appt.getValid());
                 appt.setStartHour(startHour);
                 appt.setStartMinute(startMinute-60);
                 assertTrue(!appt.getValid());
                 appt.setStartMinute(startMinute);
                 appt.setStartDay(startDay-31);
                 assertTrue(!appt.getValid());
                 appt.setStartDay(startDay);
                 appt.setStartMonth(startMonth+12);
                 assertTrue(!appt.getValid());
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
		 assertTrue(!appt.getValid());
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
		 assertTrue(!appt.getValid());
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
		 int startHour=9;
		 int startMinute=30;
		 int startDay=10;
		 int startMonth=0;
		 int startYear=2017;
		 String title="Bday";
		 String description="good";
		 //Construct a new Appointment object with the initial data	 
		 Appt appt = new Appt(startHour,
		          startMinute ,
		          startDay ,
		          startMonth ,
		          startYear ,
		          title,
		         description);
                 String testString = appt.toString();
                 assertEquals(null, testString);
	// assertions
		 assertTrue(!appt.getValid());
		 assertEquals(9, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(10, appt.getStartDay());
		 assertEquals(0, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("Bday", appt.getTitle());
		 assertEquals("good", appt.getDescription());		
	 }
    /**
     * Test that the gets methods work incorrectly.
     */
	 @Test
	  public void test07()  throws Throwable  {
		 int startHour=12;
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
                 assertEquals("\t4/10/2017 at 12:30pm ,Birthday Party, This is my birthday party.\n", testString);

	// assertions
		 assertTrue(appt.getValid());
		 assertEquals(12, appt.getStartHour());
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
		 int startHour=-1;
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
		 assertTrue(!appt.getValid());
		 assertEquals(-1, appt.getStartHour());
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
	  public void test09()  throws Throwable  {
		 int startHour=12;
		 int startMinute=-1;
		 int startDay=0;
		 int startMonth=13;
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
		 assertTrue(!appt.getValid());
		 assertEquals(12, appt.getStartHour());
		 assertEquals(-1, appt.getStartMinute());
		 assertEquals(0, appt.getStartDay());
		 assertEquals(13, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());         		
	 }
    /**
     * Test that the gets methods work incorrectly.
     */
	 @Test
	  public void test10()  throws Throwable  {
		 int startHour=12;
		 int startMinute=30;
		 int startDay=0;
		 int startMonth=13;
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
		 assertTrue(!appt.getValid());
		 assertEquals(12, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(0, appt.getStartDay());
		 assertEquals(13, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());         		
	 }
    /**
     * Test that the gets methods work incorrectly.
     */
	 @Test
	  public void test11()  throws Throwable  {
		 int startHour=12;
		 int startMinute=30;
		 int startDay=5;
		 int startMonth=13;
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
		 assertTrue(!appt.getValid());
		 assertEquals(12, appt.getStartHour());
		 assertEquals(30, appt.getStartMinute());
		 assertEquals(5, appt.getStartDay());
		 assertEquals(13, appt.getStartMonth());
		 assertEquals(2017, appt.getStartYear());
		 assertEquals("", appt.getTitle());
		 assertEquals("", appt.getDescription());         		
	 }



}
