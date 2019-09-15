package com.jm3190810.spring.mvc.controller.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class BatchCodeConstraintValidator implements ConstraintValidator<BatchCode, String> {

	private String batchCodePrefix;

	public void initialize(BatchCode batchCode) {
		this.batchCodePrefix = batchCode.value();
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {
		boolean result = false;
		if (value != null) {
			result = value.startsWith(batchCodePrefix);
		} else {
			result = true;
		}
		return result;
	}

}
