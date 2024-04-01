package com.KIT.admissions;

public class DayScholar extends Student {
	private int busNumber;
	private float distance;
	
	public DayScholar() {
		super();
	}

	public DayScholar(int studentID, String studentName, String department, String gender, String category,
			double collegeFee,int busNumber,float distance) {
		super(studentID, studentName, department, gender, category, collegeFee);
		// TODO Auto-generated constructor stub
			this.busNumber=busNumber;
			this.distance=distance;
		
	}
	

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	
	@Override
	public double calculateTotalFee() {
		double fee=super.getCollegeFee();
		if (this.distance>30.0 && this.distance<=40.0) {
			return fee+28000;
		}
		if (this.distance>20.0 && this.distance<=30.0) {
			return fee+20000;
		}
		if (this.distance>10.0 && this.distance<=20.0) {
			return fee+12000;
			
		}
		if (this.distance>10.0) {
			return fee+600;
		}
		return 0.0;
	}

	@Override
	public String toString() {
		return "DayScholar [calculateTotalFee()=" + calculateTotalFee() + "]";
	}
	
}
