package edu.osu.cs362;

import java.util.Calendar;
import java.util.Random;

import org.junit.Test;


import static org.junit.Assert.*;



/**
 * Random Test Generator  for Appt class.
 */

public class ApptRandomTest {
   private static final long TestTimeout = 2 * 60 * 500 * 1; /* Timeout at 30 seconds */
   private static final int NUM_TESTS=100;

   /**
    * Return a randomly selected method to be tests !.
    */
   public static String RandomSelectMethod(Random random){
      String[] methodArray = new String[] {"isValid","setDescription"};// The list of the of methods to be tested in the Appt class

      int n = random.nextInt(methodArray.length);// get a random number between 0 (inclusive) and  methodArray.length (exclusive)

      return methodArray[n] ; // return the method name 
   }

   /**
    * Generate Random Tests that tests Appt Class.
    */
   @Test
   public void radnomtest()  throws Throwable  {

      long startTime = Calendar.getInstance().getTimeInMillis();
      long elapsed = Calendar.getInstance().getTimeInMillis() - startTime;


      System.out.println("Start testing...");


      for (int iteration = 0; elapsed < TestTimeout; iteration++) {
         long randomseed =10;//System.currentTimeMillis();
         //			System.out.println(" Seed:"+randomseed );
         Random random = new Random(randomseed);

         int startHour=13;
         int startMinute=30;
         int startDay=10;
         int startMonth=4;
         int startYear=2017;
         String title="Birthday Party";
         String description=ValuesGenerator.getString(random);
         //Construct a new Appointment object with the initial data	 
         Appt appt = new Appt(startHour,
               startMinute ,
               startDay ,
               startMonth ,
               startYear ,
               title,
               description);
         if ((iteration % 50) == 0){
            appt.setDescription(null);
         }
         for (int i = 0; i < NUM_TESTS; i++) {
            String methodName = ApptRandomTest.RandomSelectMethod(random);
            if (methodName.equals("isValid")){
               int hour=(int) ValuesGenerator.getRandomIntBetween(random, 0, 23);
               appt.setStartHour(hour);						   
               int minute=(int) ValuesGenerator.getRandomIntBetween(random, 0, 59);
               appt.setStartMinute(minute);						   
               int day=(int) ValuesGenerator.getRandomIntBetween(random, 1, 31);
               appt.setStartDay(day);						   
               int month=(int) ValuesGenerator.getRandomIntBetween(random, 1, 12);
               appt.setStartMonth(month);
               //change to invalid hours
               hour=(int) ValuesGenerator.getRandomIntBetween(random, -10, -1);
               appt.setStartHour(hour);
               hour=(int) ValuesGenerator.getRandomIntBetween(random, 0, 23);
               appt.setStartHour(hour);
               hour=(int) ValuesGenerator.getRandomIntBetween(random, 24, 30);
               appt.setStartHour(hour);
               hour=(int) ValuesGenerator.getRandomIntBetween(random, 0, 23);
               appt.setStartHour(hour);
               //change to invalid minutes
               minute=(int) ValuesGenerator.getRandomIntBetween(random, -20, -1);
               appt.setStartMinute(minute);
               minute=(int) ValuesGenerator.getRandomIntBetween(random, 0, 59);
               appt.setStartMinute(minute);
               minute=(int) ValuesGenerator.getRandomIntBetween(random, 60, 70);
               appt.setStartMinute(minute);
               minute=(int) ValuesGenerator.getRandomIntBetween(random, 0, 59);
               appt.setStartMinute(minute);
               //change to invalid days
               day=(int) ValuesGenerator.getRandomIntBetween(random, -10, 0);
               appt.setStartDay(day);
               day=(int) ValuesGenerator.getRandomIntBetween(random, 1, 31);
               appt.setStartDay(day);
               day=(int) ValuesGenerator.getRandomIntBetween(random, 32, 40);
               appt.setStartDay(day);
               day=(int) ValuesGenerator.getRandomIntBetween(random, 1, 31);
               appt.setStartDay(day);
               //change to invalid months
               month=(int) ValuesGenerator.getRandomIntBetween(random, -10, 0);
               appt.setStartMonth(month);						   
               month=(int) ValuesGenerator.getRandomIntBetween(random, 1, 12);
               appt.setStartMonth(month);
               month=(int) ValuesGenerator.getRandomIntBetween(random, 12, 20);
               appt.setStartMonth(month);
               month=(int) ValuesGenerator.getRandomIntBetween(random, 1, 12);
               appt.setStartMonth(month);
            }

         }

         elapsed = (Calendar.getInstance().getTimeInMillis() - startTime);
         if((iteration%10000)==0 && iteration!=0 )
            System.out.println("elapsed time: "+ elapsed + " of "+TestTimeout);

      }


      System.out.println("Done testing...");
   }



}
