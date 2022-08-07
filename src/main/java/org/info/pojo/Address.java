package org.info.pojo;

import org.springframework.stereotype.Component;

/**
 * author @Santosh
 */
@Component
public class Address {
	/**
	 * @author - Santosh
	 */

	private Student student;

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Address [student=" + student + "]";
	}

	System.out.println("Hello");
	

}
