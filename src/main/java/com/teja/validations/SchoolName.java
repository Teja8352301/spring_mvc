package com.teja.validations;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = SchoolNameValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface SchoolName {
	// define default course code
		public String value() default "School";
		
		// define default error message
		public String message() default "School Name must be proper";
		
		// define default groups
		public Class<?>[] groups() default {};
		
		// define default payloads
		public Class<? extends Payload>[] payload() default {};
}
