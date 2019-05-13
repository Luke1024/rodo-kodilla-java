package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class Facade {
    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    CompanyDao companyDao;

    public <T> ProcessDTO process(List<T> objects, Operator operator) {
        List<T> searchOutput = new ArrayList<>();

        for (T object : objects) {
            if (object instanceof Employee) {
                processingEmployee((Employee) object, operator);
                System.out.println("processingEmployee");
            }
            if (object instanceof Company) {
                processingCompany((Company) object, operator);
            }
            if (object instanceof String) {
                searchOutput = searchDatabase((String) object, operator);
            }
        }
        return dataOutput(searchOutput);
    }


    private void processingEmployee(Employee employee, Operator operator) {
        if (operator == Operator.ADD) {
            saveEmployee(employee);
            System.out.println("Adding employee");
        }
        if (operator == Operator.DELETE) {
            deleteEmployee(employee);
        }
    }

    private void processingCompany(Company company, Operator operator) {
        if (operator == Operator.ADD) {
            saveCompany(company);
        }
        if (operator == Operator.DELETE) {
            deleteCompany(company);
        }
    }

    private <T> List<T> searchDatabase(String string, Operator operator) {
        List<T> entryList = new ArrayList<>();

        if (operator == Operator.FIND_EMPLOYEE) {
            List<Employee> employeeList = findEmployees(string);
            entryList = (List<T>) employeeList;
        }
        if (operator == Operator.FIND_COMPANY) {
            List<Company> companyList = findCompanies(string);
            entryList = (List<T>) companyList;
        }
        return entryList;
    }


    private void saveEmployee(Employee employee) {
        employeeDao.save(employee);
    }

    private void deleteEmployee(Employee employee) {
        employeeDao.deleteById(employee.getId());
    }


    private void saveCompany(Company company) {
        companyDao.save(company);
    }

    private void deleteCompany(Company company) {
        companyDao.deleteById(company.getId());
    }


    private List<Employee> findEmployees(String string) {
        return employeeDao.findEmployeesByLastname(string);
    }
    private List<Company> findCompanies(String string){
        return companyDao.findACompanyWithTheBeginningOfTheName(string);
    }

    private <T> ProcessDTO dataOutput(List<T> entries){
        List<Employee> employeeList = new ArrayList<>();
        List<Company> companyList = new ArrayList<>();

        for(T entry : entries){
            if(entry instanceof Employee){
                employeeList.add((Employee) entry);
            }
            if(entry instanceof Company){
                companyList.add((Company) entry);
            }
        }
        return new ProcessDTO(employeeList, companyList);
    }
}
