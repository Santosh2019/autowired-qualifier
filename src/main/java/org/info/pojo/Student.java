package org.info.pojo;

import org.springframework.stereotype.Component;

/** author @Santosh
*/

@Component
public class Student {
	/**
	@author - Santosh
	*/
	
	private String studName;
	private int studId;
	private Address address;

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
}



