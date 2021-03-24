package com.psl.entity;

public class BloodDonnerFetch {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    public BloodDonnerFetch() {
	
	}
	@Override
	public String toString() {
		return "BloodDonnerFetch [name=" + name + "]";
	}
	public BloodDonnerFetch(String name) {
		this.name=name;
	}
}
