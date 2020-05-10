package models;

import org.junit.*;

import static org.junit.Assert.*;

public class UserTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void departmentInstantiatesCorrectly_true() throws Exception {
        User newUser = setUpnewUser();
        assertEquals(true, newUser instanceof User);
    }

    @Test
    public void  getNameReturnsNameCorrectly_String() throws Exception {
        User newUser = setUpnewUser();
        assertEquals("Jackson Gale", newUser.getName());
    }
    @Test
    public void getEmailReturnsEmailCorrectly_String() throws Exception {
        User newUser = setUpnewUser();
        assertEquals("jgale@company.com", newUser.getEmail());
    }
    @Test
    public void  getRoleReturnsRoleCorrectly_String() throws Exception {
        User newUser = setUpnewUser();
        assertEquals("Research Manager", newUser.getRole());
    }
    @Test
    public void  getSectionIdreturnsSEctionIdCorrectly_Int() throws Exception {
        User newUser = setUpnewUser();
        assertEquals(4, newUser.getSectionId());
    }
    @Test
    public void setNameSetsCorrectName() throws Exception {
        User newUser = setUpnewUser();
        newUser.setName("Jackson Gale");
        assertEquals("Jackson Gale", newUser.getName());
    }
    @Test
    public void setEmailSetsCorrectEmail() throws  Exception {
        User newUser = setUpnewUser();
        newUser.setEmail("jgale@company.com");
        assertEquals("jgale@company.com", newUser.getEmail());
    }
    @Test
    public void setRoleSetsCorrectRole() throws Exception {
        User newUser = setUpnewUser();
        newUser.setRole("Research Manager");
        assertEquals("Research Manager", newUser.getRole());
    }
    @Test
    public void setSectionIdSetsCorrectSectionId() throws Exception {
        User newUser = setUpnewUser();
        newUser.setSectionId(4);
        assertEquals(4, newUser.getSectionId());
    }
    @Test
    public void departmentReturnsTrueIfNameAndDetailsAndTotalEmployeesAreSame() throws Exception {
        User newUser = setUpnewUser();
        User otherUser = setUpnewUser();
        assertEquals(true, newUser.equals(otherUser));
    }

    public User setUpnewUser(){
        return new User("Jackson Gale", "jgale@company.com","Research Manager", 4);
    }

}