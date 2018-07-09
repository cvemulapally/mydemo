package com.boot.controller;

import com.boot.domain.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/validate")
public class EmployeeController {

    @PostMapping("/json")
    public Employee createEmployee_json(@Valid @RequestBody Employee employee){

        return employee;
    }

    @PostMapping(value = "/xml", consumes = "application/xml", produces = "application/xml")
    public Employee createEmployee_xml(@Valid @RequestBody Employee employee){

        return employee;
    }
}
