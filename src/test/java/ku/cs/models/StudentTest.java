package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    private Student s;

    @BeforeEach
    void initial() {
        s = new Student("6710451500", "PP");
    }
    @Test
    @DisplayName("Testing constructor without score")
    void testConstructorWithoutScore() {
        Student newStudent = new Student("6710451150", "Pizza");
        assertEquals("6710451150",newStudent.getId());
        assertEquals("Pizza",newStudent.getName());
        assertEquals(0.0,newStudent.getScore());
    }

    @Test
    @DisplayName("Testing constructor with score")
    void testConstructorWithScore() {
        Student newStudent2 = new Student("6710451150", "Pizza",90.00);
        assertEquals("6710451150",newStudent2.getId());
        assertEquals("Pizza",newStudent2.getName());
        assertEquals(90.0,newStudent2.getScore());
    }

    @Test
    @DisplayName("Testing add score")
    void testAddScore() {
        s.addScore(45.15);
        assertEquals(45.15, s.getScore());
    }

    @Test
    @DisplayName("Testing calculate grade")
    void testCalculateGrade() {
        s.addScore(85);
        assertEquals("A", s.grade());
    }

    @Test
    @DisplayName("Testing change name")
    void testChangeName() {
        s.changeName("x");
        assertEquals("x", s.getName());
    }

    @Test
    @DisplayName("Testing is name contains")
    void testIsNameContains() {
        assertTrue(s.isNameContains("PP"));
        assertFalse(s.isNameContains("x"));
    }

    @Test
    @DisplayName("Testing is id")
    void testIsId() {
        assertTrue(s.isId("6710451500"));
        assertFalse(s.isId("6710451150"));
    }

}