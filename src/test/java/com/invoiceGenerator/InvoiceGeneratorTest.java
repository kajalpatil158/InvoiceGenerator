package com.invoiceGenerator;

import org.junit.Test;

import org.junit.Assert;

/*@Description-In InvoiceGeneratorTest check a given Distance And Time The Invoice Generator should Return  
 * The Total Fare Fore Journey.
 * AssertEquals Check Whether Actual And Expected Value Is Equal Or Not
 * If both are equal Test Case Pass.
 * Otherwise Testcase Fail.*/
public class InvoiceGeneratorTest {

	@Test
	public void givenDistanceAndTimeTheInvoiceGenerator_ShouldReturnTheTotalFareForeJourney() {
		InvoiceGenerator invoicegenerator = new InvoiceGenerator();
		double distance = 2.0;
		int time = 5;
		double fare = invoicegenerator.CalculateFare(distance, time);
		Assert.assertEquals(25, fare, 0.0);
	}

//Test Case For Minimum Fare.
	@Test
	public void givenLessDistanceAndTime_ShouldReturnTheTotalFareForeJourney() {
		InvoiceGenerator invoicegenerator = new InvoiceGenerator();
		double distance = 0.1;
		int time = 1;
		double fare = invoicegenerator.CalculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}

	/*
	 * @Description-Checking for given Multiple Ride Should Return The Total Fare
	 * Here that check for number of rides Array is created for that.
	 */
	@Test
	public void givenMultipleRide_ShouldReturnInvoiceSummary() {
		InvoiceGenerator invoicegenerator = new InvoiceGenerator();
		double fare = invoicegenerator.calculateAverageFare(2, 10);
		Assert.assertEquals(5, fare, 0.0);
	}

	@Test
	public void givenUserIdTheInvoiceService_ShouldReturnIvoice() {
		InvoiceGenerator invoicegenerator = new InvoiceGenerator();
		int check = invoicegenerator.RideRepository(5);
		Assert.assertEquals(5, check);
	}
}
