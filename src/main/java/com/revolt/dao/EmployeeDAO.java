/**
 * 
 */
package com.revolt.dao;
import org.springframework.stereotype.Repository;

import com.revolt.model.Employee;
import com.revolt.model.Employees;

/**
 * @author Admin
 *
 */
@Repository
public class EmployeeDAO {
	private static Employees list = new Employees();
    
    static
    {
        list.getEmployeeList().add(new Employee(1, "Raju", "Saravanakumar", "rajusaravanakumar@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Alex", "Ditmarov", "alexditmarov@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Yokesh", "Mer", "yokeshmer@gmail.com"));
    }
     
    public Employees getAllEmployees()
    {
        return list;
    }
     
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
