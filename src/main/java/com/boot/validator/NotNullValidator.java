package com.boot.validator;

import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NotNullValidator implements ConstraintValidator<NotNullValid, String>{
    @Override
    public void initialize(NotNullValid constraintAnnotation) {
    }

    @Override
    public boolean isValid(String string, ConstraintValidatorContext constraintValidatorContext) {
        return StringUtils.isEmpty(string);
    }
}
