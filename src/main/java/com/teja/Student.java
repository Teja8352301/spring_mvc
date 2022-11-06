package com.teja;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.teja.validations.SchoolName;

public class Student {
	
	@NotNull(message="Name Should be Required")
	@Size(min=1, message="Name Should be Required")
	String name;
	
	@NotNull(message="Age Should be Required")
	@Min(value=18,message="Age should be Greater than 18")
	@Max(value=100,message="Age should be Less than 100")
	int age;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="Postal Code Length should be 5 Letters")
	String postalCode;
	
	@SchoolName(value="School",message="Proper School Name Required")
	String schoolName;

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
		
	
}
