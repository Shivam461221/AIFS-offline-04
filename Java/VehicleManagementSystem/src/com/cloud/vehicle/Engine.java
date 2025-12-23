package com.cloud.vehicle;

public class Engine {
	
	String type;
	int horsePower;
	
	public Engine(String type, int horsePower) {
		super();
		this.type = type;
		this.horsePower = horsePower;
	}
	
	void showEngineDetails() {
		System.out.println("Engine details ");
		System.out.println("Engine type: "+ type);
		System.out.println("Engine power: "+horsePower);
	}

}
