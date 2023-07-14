package com.nda.restController;

import com.nda.entity.Employee;
import com.nda.service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class
EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/employees")
    @Operation(description = "this api for to get all employees")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200" ,description = "everything OKAY")
    })
    public List<Employee> getAll(){
    return employeeService.getAll();
    }

    @GetMapping(value = "/employee/{id}")
    public Employee getById(@PathVariable int id)throws Exception{
        return employeeService.getByID(id);
    }

    @PostMapping(value = "/employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping(value = "/delete/{id}")
    public String delete(@PathVariable int id) throws Exception{
        return employeeService.deleteEmployee(id);
    }

    @PutMapping(value = "/updateEmployee/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee employee) throws Exception{
        return employeeService.updateEmployee(id,employee);
    }

    @PatchMapping(value = "/update")
    public ResponseEntity<Employee> update(@RequestParam int id, @RequestParam String salary){
        return employeeService.update(id,salary);
    }

    @GetMapping(value="/employee")
    public ResponseEntity<Employee> getByEmail(@RequestParam String email){
            return employeeService.findByEmail(email);
    }
    
}
