package com.boot.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = { NotNullValidator.class })
public @interface NotNullValid {
    String message() default "Must Suppply firstName";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    int min() default Integer.MIN_VALUE;

    int max() default Integer.MAX_VALUE;
}
