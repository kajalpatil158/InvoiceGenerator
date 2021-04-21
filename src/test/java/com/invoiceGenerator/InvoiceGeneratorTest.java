package com.invoiceGenerator;

import org.junit.Test;

import org.junit.Assert;

/*In InvoiceGeneratorTest check a given Distance And Time The Invoice Generator should Return  
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
}
