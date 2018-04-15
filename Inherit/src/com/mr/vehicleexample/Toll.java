package com.mr.vehicleexample;

import java.util.Random;

public class Toll {
	Vehicle nextVehicle() {
		Random r = new Random();
		int n = r.nextInt(3) + 1;
		switch (n) {
		case 1:
			return new Bike();
		case 2:
			return new Car();
		case 3:
			return new Truck();
		default:
			return null;
		}
	}
}
