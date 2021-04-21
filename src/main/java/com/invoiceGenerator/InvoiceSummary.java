package com.invoiceGenerator;

public class InvoiceSummary {
	public int noOfRides;
	public double totalFare;
	public double averageFare;

	public InvoiceSummary(int noOfRides, double totalFare,double averageFare) {
		this.noOfRides = noOfRides;
		this.totalFare = totalFare;
		this.averageFare = this.totalFare / this.noOfRides;
	}

}
