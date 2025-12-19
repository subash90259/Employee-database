package com.example.employee.Repository;
import com.example.employee.employeemodel.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<EmployeeModel,Integer> {
}
