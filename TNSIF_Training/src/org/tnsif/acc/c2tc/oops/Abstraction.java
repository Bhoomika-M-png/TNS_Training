package org.tnsif.acc.c2tc.oops;

public class Abstraction {

	public static void main(String[] args) {
		BhoomiDemo obj=new ShreyaDemo();
		obj.calling();
		obj.AIIntegration();
		obj.HealthMonitoring();
	}
}
abstract class BhoomiDemo{//2024
	void calling() {
		System.out.println("Phone is having calling feature");
	}
	abstract void AIIntegration();
	abstract void SatelliteComm();
	abstract void HealthMonitoring();	
	}
abstract class SriDemo extends BhoomiDemo{ //2025

	@Override
	void AIIntegration() {
		System.out.println("phone is integrated with AI");
		
	}
	
	@Override
	abstract void SatelliteComm();

	
	@Override
	abstract void HealthMonitoring();
	}

	class ShreyaDemo extends SriDemo { //2026

		@Override
		void SatelliteComm() {
			System.out.println("phone is having satellite comm");
			
		}

		@Override
		void HealthMonitoring() {
			System.out.println("phone is having health monitoring");
		}  
		
	}

