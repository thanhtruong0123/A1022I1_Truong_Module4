package com.example.rigisterformproject.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class UserDto implements Validator {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;
    private String email;

    public UserDto() {
    }

    public UserDto(String firstName, String lastName, String phoneNumber, int age, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;

        //firstName
        if (userDto.getFirstName().isEmpty()) {
            errors.rejectValue("firstName", null, "Not Empty");
        } else if (userDto.getFirstName().length() < 5 || userDto.getFirstName().length() > 45) {
            errors.rejectValue("firstName", null, "The name size is 5 - 45");
        }

        //lastName
        if (userDto.getLastName().isEmpty()) {
            errors.rejectValue("lastName", null, "Not Empty");
        } else if (userDto.getLastName().length() < 5 || userDto.getFirstName().length() > 45) {
            errors.rejectValue("lastName", null, "5 - 45");
        }

        //phoneNumber
        if (!userDto.getPhoneNumber().matches("^(0\\d{9,10})$")) {
            errors.rejectValue("phoneNumber", null, "Phone number format is wrong");
        }

        //age
        if (userDto.getAge() < 18) {
            errors.rejectValue("age", null, "Have to be more than 18");
        }

        //email
        if (!userDto.getEmail().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            errors.rejectValue("email", null, "Email format is wrong");
        }
    }
}
