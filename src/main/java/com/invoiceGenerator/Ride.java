package com.invoiceGenerator;

/*@Description-Created A Ride Class
 * Its Useful to Calculate for multiple rides.
 * here constructor is created With a Distance and time value.*/
public class Ride {
	public double distance;
	public int time;

//@Description-Parameterize Constructor is created.
	public Ride(double distance, int time) {
		this.distance = distance;
		this.time = time;
	}
}
