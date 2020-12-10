package com.springboot.auctionservice;



import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.Runner;
import org.junit.runner.notification.Failure;


public abstract class TestRunner extends Runner  {
	   public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(ApplicationTests.class);
	      //Result result2 = JUnitCore.runClasses(HttpRequestTest.class);
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
	      System.out.println("Result=="+result.wasSuccessful());
	   }
	} 

