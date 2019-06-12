package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

import static java.util.Arrays.asList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FacadeTestSuite {
    private Facade facade;
    @Test
    public void testFindEmployeesWithPartOfTheName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        facade.sendRequest(asList(johnSmith, stephanieClarckson, lindaKovalsky), Request.ADD);
        //When
        ProcessDTO processDTO1 = facade.sendRequest(asList("Smith"), Request.FIND_EMPLOYEE);
        ProcessDTO processDTO2 = facade.sendRequest(asList("Clarckson"), Request.FIND_EMPLOYEE);
        ProcessDTO processDTO3 = facade.sendRequest(asList("Kovalsky"), Request.FIND_EMPLOYEE);

        //Then
        assertEquals(processDTO1.getEmployee().get(0),johnSmith);
        assertEquals(processDTO2.getEmployee().get(0),stephanieClarckson);
        assertEquals(processDTO3.getEmployee().get(0),lindaKovalsky);

        //CleanUp
        facade.sendRequest(asList(processDTO1.getCompany(), processDTO2.getCompany(), processDTO3.getCompany()), Request.DELETE);
    }

    @Test
    public void testFindCompaniesWithPartOfTheName() {
        //Given
        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        facade.sendRequest(asList(softwareMachine, dataMaesters, greyMatter), Request.ADD);
        //When
        ProcessDTO processDTO1 = facade.sendRequest(asList("Software Machine"), Request.FIND_COMPANY);
        ProcessDTO processDTO2 = facade.sendRequest(asList("Data Maesters"), Request.FIND_COMPANY);
        ProcessDTO processDTO3 = facade.sendRequest(asList("Grey Matter"), Request.FIND_COMPANY);

        //Then
        assertEquals(processDTO1.getCompany().get(0), softwareMachine);
        assertEquals(processDTO2.getCompany().get(0), dataMaesters);
        assertEquals(processDTO3.getCompany().get(0), greyMatter);

        //CleanUp
        facade.sendRequest(asList(processDTO1.getCompany(), processDTO2.getCompany(), processDTO3.getCompany()), Request.DELETE);
    }
}
