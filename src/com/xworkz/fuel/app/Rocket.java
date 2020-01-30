package com.xworkz.fuel.app;

public class Rocket {
	private Fuel fu;
	private Sattelite sat;
	private String countryName;
	public Rocket(Fuel fu) {
		this.fu=fu;
		System.out.println("created"+fu);
	}
	public void setSat(Sattelite sat) {
		this.sat=sat;
		System.out.println("created"+sat);
		
	}
	public void setCountryName(String countryName) {
		this.countryName=countryName;
		System.out.println("created"+countryName);
		
	}
	public void start() {
		this.fu.fire();
	}
	
	public void launch() {
		this.sat.launch(44);
	}
	@Override
	public String toString() {
		return "Rocket [fu=" + fu + ", sat=" + sat + ", countryName=" + countryName + "]";
	}
	
	

}
