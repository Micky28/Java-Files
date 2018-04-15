package com.mr.vehicleexample;

public class TestCar {
	public static void main(String[] args) {
		Toll t = new Toll();
		Vehicle v = t.nextVehicle();
		System.out.println(v);
	}
}
