package com.example.spring_start.domain.validator;

import com.example.spring_start.domain.User;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PasswordsMatchValidator implements ConstraintValidator<PasswordMatch, User> {

    @Override
    public void initialize(PasswordMatch passwordsMatch){
    }

    public boolean isValid(User user, ConstraintValidatorContext context) {
        return user.getPassword().equals(user.getConfirmPassword());
    }

}
