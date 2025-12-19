package com.example.employee.EmpService;


import com.example.employee.Repository.EmpRepository;
import com.example.employee.employeemodel.EmployeeModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpRepository EmpRepository;




    public List<EmployeeModel> getallemployees() {
        return EmpRepository.findAll();
    }

    public EmployeeModel addemployee(EmployeeModel employeeModel) {
     return   EmpRepository.save(employeeModel);

    }
}
