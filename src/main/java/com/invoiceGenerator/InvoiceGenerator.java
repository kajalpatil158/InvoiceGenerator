package com.invoiceGenerator;

/*Created Invoice generator Class.
 * There is Uses Two Constants One Is COST_PER_TIME
 * And Another Is MINIMUM_COST_PER_KOLOMETER
 * CalculateFare method calculates a fare for that.
 * Two Local veriable Is uses there that is distance,time.
 * return those value as result
 * */
public class InvoiceGenerator {
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_COST_PER_KOLOMETER = 10;
	int distance;
	int time;
	
	/*
	 * CalculateFare calculate a distance, MINIMUM_COST_PER_KOLOMETER. time,
	 * COST_PER_TIME Result is Result.
	 */

	public double CalculateFare(double distance, int time) {
		return distance * MINIMUM_COST_PER_KOLOMETER + time * COST_PER_TIME;

	}
}
