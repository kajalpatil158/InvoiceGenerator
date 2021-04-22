package com.invoiceGenerator;

import java.util.ArrayList;
import java.util.HashMap;

/*@Decription- In fareDetails class there are calculated NORMAL n PREMIUM fare.
 * here Fare is calculated bases on is that normal type or premium type base on that calculation is happen.
 * that is calculated by tacking a parameters kilometer,time,rideType.
 * two methods is created first one is calculateFareNormal and another calculateFarePremium.
 * */
public class fareDetails {

	int total = 0;
	int noOfRides = 0;
	public HashMap<String, ArrayList<Integer>> rides = new HashMap<>();
	public ArrayList<Integer> fareDetails;

	/*
	 * @Description- enum is created for constant. and here enum is created for Type
	 * those are NORMAL or PREMIUM
	 */
	public enum type {
		NORMAL, PREMIUM
	}

	/*
	 * @Description- FareDetail is method created where is, rideType, kilometer,
	 * time is local variables there is check for rideType is that NORMAL Or
	 * PREMIUM.
	 */
	public void FareDetail(String Id, type rideType, int kilometer, int time) {
		if (rideType == type.NORMAL) {
			int f = calculateFareNormal(kilometer, time);
			System.out.println("\nFare: " + f);
			noOfRides++;
			ArrayList<Integer> rideDet = new ArrayList<>();
			if (rides.containsKey(Id)) {
				rideDet = rides.get(Id);
			}
			rideDet.add(f);
			rides.put(Id, rideDet);
			System.out.println(rides);

		} else if (rideType == type.PREMIUM) {

			int f = calculateFarePremium(kilometer, time);
			System.out.println("\nFare: " + f);
			noOfRides++;
			ArrayList<Integer> rideDet = new ArrayList<>();
			if (rides.containsKey(Id)) {
				rideDet = rides.get(Id);
			}
			rideDet.add(f);
			rides.put(Id, rideDet);
			System.out.println(rides);

		}
	}

	public int calculateFareNormal(int kilometer, int time) {
		int total = time + (10 * kilometer);
		int numberOfTimes = total;
		if (numberOfTimes <= 5) {
			total = 5;
		}
		return total;
	}

	public int calculateFarePremium(int km, int time) {
		int total = (2 * time) + (15 * km);
		int numberOfTimes = total;
		if (numberOfTimes <= 20) {
			total = 20;
		}
		return total;
	}

}
