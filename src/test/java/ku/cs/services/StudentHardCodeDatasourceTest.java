package ku.cs.services;

import ku.cs.models.StudentList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class StudentHardCodeDatasourceTest {
    private StudentHardCodeDatasource dS;
    private StudentList sL;
    @BeforeEach
    void initial(){
        dS = new StudentHardCodeDatasource();
        sL = dS.readData();
    }
    @Test
    @DisplayName("Testing Read data from hardcode")
    void testReadData(){
        assertEquals(4,sL.getStudents().size());
        assertEquals("First",sL.getStudents().get(0).getName());
        assertEquals("6710400002",sL.getStudents().get(1).getId());
        assertEquals(0.0,sL.getStudents().get(2).getScore());
        assertEquals("Fourth",sL.getStudents().get(3).getName());
    }

}