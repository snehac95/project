package com.xworkz.fuel.app;

public class Sattelite {
	private int lanched;
	private String location;
	
	public Sattelite() {
		System.out.println("created"+this.getClass().getSimpleName());
		
	}
	public void setLanched(int lanched) {
		this.lanched=lanched;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public void launch(int time) {
		System.out.println("invoked"+time);
	}
	@Override
	public String toString() {
		return "Sattelite [lanched=" + lanched + ", location=" + location + "]";
	}
	
}
