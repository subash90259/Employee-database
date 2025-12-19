package com.example.employee.employeecontroller;


import com.example.employee.EmpService.EmpService;
import com.example.employee.employeemodel.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/employees")
@RestController
class EmployeeController {
    @Autowired
    EmpService empService;
    @GetMapping("/ID")
   public List<EmployeeModel> getallemployees() {
        return empService.getallemployees ();
    }
    @PostMapping
    public EmployeeModel addemployee(@RequestBody EmployeeModel employeeModel){
        return empService.addemployee(employeeModel);

    }

}
