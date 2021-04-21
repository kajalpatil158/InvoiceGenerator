package com.invoiceGenerator;

/*Created Invoice generator Class.
 * There is Uses Two Constants One Is COST_PER_TIME
 * And Another Is MINIMUM_COST_PER_KOLOMETER
 * CalculateFare method calculates a fare for that.
 * Two Local variable Is uses there that is distance,time.
 * return those value as result
 * */
public class InvoiceGenerator {
	private static final int COST_PER_TIME = 1;
	private static final double MINIMUM_COST_PER_KOLOMETER = 10;
	private static final double MINIMUM_FARE = 5;
	int distance;
	int time;

	/*
	 * CalculateFare calculate a distance, MINIMUM_COST_PER_KOLOMETER. time,
	 * COST_PER_TIME Result is Result.
	 * Here Calculated total fare. 
	 * and check in Condition If MINIMUM_FARE is greter than total fare then return MINIMUM_FARE
	 * else return total_Fare.
	 */

	public double CalculateFare(double distance, int time) {
		double total_Fare = distance * MINIMUM_COST_PER_KOLOMETER + time * COST_PER_TIME;
		if (total_Fare < MINIMUM_FARE)
			return MINIMUM_FARE;
		return total_Fare;
	}
}
