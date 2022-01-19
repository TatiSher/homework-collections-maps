package pro.sky.homeworkcollectionsmaps.service;

import pro.sky.homeworkcollectionsmaps.data.Employee;

import java.util.Collection;

public interface EmployeeService {

    Employee add(String firstName, String lastName);

    Employee remove(String firstName, String lastName);

    Employee find(String firstName, String lastName);

    Collection<Employee> getEmployees();
}
