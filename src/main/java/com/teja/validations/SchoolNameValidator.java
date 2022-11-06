package com.teja.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SchoolNameValidator implements ConstraintValidator<SchoolName,String> {
	
	private String schoolNameSuffix;
	
	@Override
	public void initialize(SchoolName theSchoolName) {
		System.out.println();
		schoolNameSuffix = theSchoolName.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext validatorContext) {
		boolean result;
		if (theCode != null) {
			result = theCode.endsWith(schoolNameSuffix);
		}
		else {
			result = true;
		}
		return result;
	}
}
