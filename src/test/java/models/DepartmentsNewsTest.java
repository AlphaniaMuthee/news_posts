package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DepartmentsNewsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void DepartmentsNewsInstantiatesCorrectly_true () throws Exception {
        DepartmentsNews newDepartmentsNews = setUpnewDepartmentsNews();
        assertEquals(true, newDepartmentsNews instanceof DepartmentsNews);
    }
    @Test
    public void  getNewsReturnsNewsCorrectly_String() throws Exception {
        DepartmentsNews newDepartmentsNews= setUpnewDepartmentsNews();
        assertEquals("New Market Trends", newDepartmentsNews.getNews());
    }
    @Test
    public void  getWriterReturnsWriterCorrectly_String() throws Exception {
        DepartmentsNews newDepartmentsNews= setUpnewDepartmentsNews();
        assertEquals("Kate Jay", newDepartmentsNews.getWriter());
    }
    @Test
    public void  getSectionIdReturnsSectionIdCorrectly_int() throws Exception {
        DepartmentsNews newDepartmentsNews= setUpnewDepartmentsNews();
        assertEquals(001, newDepartmentsNews.getSectionId());
    }
    @Test
    public void setNewsSetsCorrectNews() throws Exception {
        DepartmentsNews newDepartmentsNews= setUpnewDepartmentsNews();
        newDepartmentsNews.setNews("New Market Trends");
        assertEquals("New Market Trends", newDepartmentsNews.getNews());
    }
    @Test
    public void setWriterSetsCorrectWriter() throws Exception {
        DepartmentsNews newDepartmentsNews= setUpnewDepartmentsNews();
        newDepartmentsNews.setWriter("Kate Jay");
        assertEquals("Kate Jay", newDepartmentsNews.getWriter());
    }
    @Test
    public void setSectionIdSetsCorrectSectionId() throws Exception {
        DepartmentsNews newDepartmentsNews= setUpnewDepartmentsNews();
        newDepartmentsNews.setSectionId(001);
        assertEquals(001, newDepartmentsNews.getSectionId());
    }

    @Test
    public void departmentReturnsTrueIfNameAndDetailsAndTotalEmployeesAreSame() throws Exception {
        DepartmentsNews newDepartmentsNews= setUpnewDepartmentsNews();
        DepartmentsNews otherDepartmentsNews= setUpnewDepartmentsNews();
        assertEquals(true, newDepartmentsNews.equals(otherDepartmentsNews));
    }

    public DepartmentsNews setUpnewDepartmentsNews() {
        return new DepartmentsNews("New Market Trends", "Kate Jay", 001);
    }
}
