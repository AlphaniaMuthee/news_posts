package models;

import org.junit.*;
import static org.junit.Assert.*;

public class CommonNewsTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void CommonNewsInstantiatesCorrectly_true () throws Exception {
        CommonNews newCommonNews = setUpnewCommonNews();
        assertEquals(true, newCommonNews instanceof CommonNews);
    }
    @Test
    public void  getNewsReturnsNewsCorrectly_String() throws Exception {
        CommonNews newCommonNews= setUpnewCommonNews();
        assertEquals("Financial Analysis Report", newCommonNews.getNews());
    }
    @Test
    public void  getWriterReturnsWriterCorrectly_String() throws Exception {
        CommonNews newCommonNews= setUpnewCommonNews();
        assertEquals("Thomas Pete", newCommonNews.getWriter());
    }
    @Test
    public void setNewsSetsCorrectNews() throws Exception {
        CommonNews newCommonNews= setUpnewCommonNews();
        newCommonNews.setNews("Financial Analysis Report");
        assertEquals("Financial Analysis Report", newCommonNews.getNews());
    }
    @Test
    public void setWriterSetsCorrectWriter() throws Exception {
        CommonNews newCommonNews= setUpnewCommonNews();
        newCommonNews.setWriter("Thomas Pete");
        assertEquals("Thomas Pete", newCommonNews.getWriter());
    }

    @Test
    public void departmentReturnsTrueIfNameAndDetailsAndTotalEmployeesAreSame() throws Exception {
        CommonNews newCommonNews= setUpnewCommonNews();
        CommonNews otherCommonNews= setUpnewCommonNews();
        assertEquals(true, newCommonNews.equals(otherCommonNews));
    }

    public CommonNews setUpnewCommonNews() {
        return new CommonNews("Financial Analysis Report", "Thomas Pete");
    }
}