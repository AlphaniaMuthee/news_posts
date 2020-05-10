package models;

import org.junit.*;
import static org.junit.Assert.*;

public class DepartmentsTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void departmentInstantiatesCorrectly_true() throws Exception {
        Departments newDepartments = setUpnewDepartments();
        assertEquals(true, newDepartments instanceof  Departments);
    }

    @Test
    public void  getNameReturnsNameCorrectly_String() throws Exception {
        Departments newDepartments = setUpnewDepartments();
        assertEquals("Human Resource Management", newDepartments.getName());
    }
    @Test
    public void getDetailsReturnsDetailsCorrectly_String() throws Exception {
        Departments newDepartments = setUpnewDepartments();
        assertEquals("In charge of hiring new staff", newDepartments.getDetails());
    }
    @Test
    public void  getTotalEmployeesReturnsTotalEmployeesCorrectly_int() throws Exception {
        Departments newDepartments = setUpnewDepartments();
        assertEquals(7, newDepartments.getTotalEmployees());
    }
    @Test
    public void setNameSetsCorrectName() throws Exception {
        Departments newDepartments = setUpnewDepartments();
        newDepartments.setName("Research & Development");
        assertEquals("Research & Development", newDepartments.getName());
    }
    @Test
    public void setDetailsSetsCorrectDetails() throws  Exception {
        Departments newDepartments = setUpnewDepartments();
        newDepartments.setDetails("Conducts reasearch on business trends and advices organization accordingly");
        assertEquals("Conducts reasearch on business trends and advices organization accordingly", newDepartments.getDetails());
    }
    @Test
    public void setTotalEmployeesSetsCorrectTotalEmployees() throws Exception {
        Departments newDepartments = setUpnewDepartments();
        newDepartments.setTotalEmployees(4);
        assertEquals(4, newDepartments.getTotalEmployees());
    }
    @Test
    public void departmentReturnsTrueIfNameAndDetailsAndTotalEmployeesAreSame() throws Exception {
        Departments newDepartment = setUpnewDepartments();
        Departments otherDepartments = setUpnewDepartments();
        assertEquals(true, newDepartment.equals(otherDepartments));
    }

    public Departments setUpnewDepartments(){
        return new Departments("Human Resource Management", "In charge of hiring new staff",7);
    }
}