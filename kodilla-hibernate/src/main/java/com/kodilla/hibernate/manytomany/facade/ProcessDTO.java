package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;

import java.util.List;

public class ProcessDTO{
    private List<Employee> employee;
    private List<Company> company;

    public ProcessDTO(List<Employee> employee, List<Company> company) {
        this.employee = employee;
        this.company = company;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public List<Company> getCompany() {
        return company;
    }
}