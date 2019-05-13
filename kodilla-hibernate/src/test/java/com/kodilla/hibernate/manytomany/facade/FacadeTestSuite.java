package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static java.util.Arrays.asList;

public class FacadeTestSuite {
    private Facade facade;
    @Test
    public void testFindEmployeesWithPartOfTheName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        facade.process(asList(johnSmith, stephanieClarckson, lindaKovalsky), Operator.ADD);
        //When
        ProcessDTO processDTO1 = facade.process(asList("Smith"),Operator.FIND_EMPLOYEE);
        ProcessDTO processDTO2 = facade.process(asList("Clarckson"), Operator.FIND_EMPLOYEE);
        ProcessDTO processDTO3 = facade.process(asList("Kovalsky"), Operator.FIND_EMPLOYEE);

        //Then
        assertEquals(processDTO1.getEmployee().get(0),johnSmith);
        assertEquals(processDTO2.getEmployee().get(0),stephanieClarckson);
        assertEquals(processDTO3.getEmployee().get(0),lindaKovalsky);

        //CleanUp
        facade.process(asList(processDTO1.getCompany(), processDTO2.getCompany(), processDTO3.getCompany()), Operator.DELETE);
    }

    @Test
    public void testFindCompaniesWithPartOfTheName() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        facade.process(asList(softwareMachine, dataMaesters, greyMatter), Operator.ADD);
        //When
        ProcessDTO processDTO1 = facade.process(asList("Software Machine"), Operator.FIND_COMPANY);
        ProcessDTO processDTO2 = facade.process(asList("Data Maesters"), Operator.FIND_COMPANY);
        ProcessDTO processDTO3 = facade.process(asList("Grey Matter"), Operator.FIND_COMPANY);

        //Then
        assertEquals(processDTO1.getCompany().get(0), softwareMachine);
        assertEquals(processDTO2.getCompany().get(0), dataMaesters);
        assertEquals(processDTO3.getCompany().get(0), greyMatter);

        //CleanUp
        facade.process(asList(processDTO1.getCompany(), processDTO2.getCompany(), processDTO3.getCompany()), Operator.DELETE);
    }
}
