package com.xworkz.fuel.app;

public class Fuel {
	private String type;
	public Fuel(String type) {
		this.type=type;
		System.out.println("created"+type);
}
	public void fire() {
		System.out.println("invoked");
	}
	@Override
	public String toString() {
		return "Fuel [type=" + type + "]";
	}
	
}
