package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    private StudentList sL;
    @BeforeEach
    void initial(){
        sL = new StudentList();
        sL.addNewStudent("6710451500","PP",90.0);
        sL.addNewStudent("6710451402","Bell");
        sL.addNewStudent("6710450821","June");
    }

    @Test
    @DisplayName("Testing add new student without score")
    void addNewStudentWithoutScore() {
        assertEquals(3, sL.getStudents().size());
        assertEquals("6710451402", sL.getStudents().get(1).getId());
    }

    @Test
    @DisplayName("Testing add new student with score")
    void addNewStudentWithScore() {
        assertEquals(3, sL.getStudents().size());
        assertEquals(90.0, sL.getStudents().get(0).getScore());
    }

    @Test
    @DisplayName("Testing find student by id")
    void testFindStudentsById(){
        assertEquals("PP",sL.findStudentById("6710451500").getName());
    }

    @Test
    @DisplayName("Testing give score to id")
    void testGiveScoreToId(){
        sL.giveScoreToId("6710451402",85.0);
        assertEquals(85.0,sL.findStudentById("6710451402").getScore());
    }

    @Test
    @DisplayName("Testing view grade of id")
    void testViewGradeOfId(){
        sL.giveScoreToId("6710451500",85.0);
        assertEquals("A",sL.viewGradeOfId("6710451500"));
    }

    @Test
    void testFilterByName() {
        StudentList filtered = sL.filterByName("Be");
        assertEquals(1, filtered.getStudents().size());
        assertEquals("Bell", filtered.getStudents().get(0).getName());
    }
}