package com.xworkz.fuel.app;

public class Labour {
	private String name;
	private int expereance;
	private ThreadImpl  threadImpl;
	
	public Labour(String name) {
		this.name=name;
		System.out.println("created"+name);
	}
	
		public void setExpereance(int expereance) {
			this.expereance=expereance;
		System.out.println("created"+expereance);
	}
		public void setThreadImpl(ThreadImpl threadImpl) {
			this.threadImpl=threadImpl;
			System.out.println("created"+threadImpl);
		}
		public void work() {
			this.threadImpl.start();
			this.threadImpl.run();
		}

}
