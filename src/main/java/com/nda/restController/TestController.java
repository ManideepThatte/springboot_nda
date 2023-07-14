package com.nda.restController;

import com.nda.entity.Employee;
import com.nda.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController{

    @GetMapping(value = "/welcome")
    public String greeting(){
        return "Welcome to SpringBoot class";
    }
    @GetMapping(value = "/number")
    public int number(){
        return 103450001;
    }

}
