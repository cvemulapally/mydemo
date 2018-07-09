package com.boot.domain;


import com.boot.validator.NotNullValid;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Employee")
public class Employee {

    /*@NotNull(message = "first name cannot be empty")
    @Size(min = 3, message = "first name should be atleast 3 characters long")*/
    @XmlElement(name = "FirstName", required = true)
    @NotNullValid
    private String firstName;

/*
    @NotBlank(message = "middle name cannot be blank")
*/
    @XmlElement(name = "MiddleName", required = true)
    private String middleName;

/*
    @NotNull(message = "last name cannot be empty")
*/
    @XmlElement(name = "LastName", required = true)
    private String lastName;
}
