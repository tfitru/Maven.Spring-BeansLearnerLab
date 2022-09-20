package LearnerBeanLab.Bean;


import LearnerBeanLab.Bean.Learners.Student;
import LearnerBeanLab.Bean.Learners.StudentConfig;
import LearnerBeanLab.Bean.Learners.Students;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentConfigTest {

    @Autowired
    private StudentConfig studentConfig;


    @Test
    public void studentConfigTest_List_Size_CurrentStudents() {
        Student max = new Student(1, "Max");
        Student mike = new Student(2, "Mike");
        Student rick = new Student(3, "Rick");
        int size = 3;

        studentConfig.currentStudents().add(max);
        studentConfig.currentStudents().add(mike);
        studentConfig.currentStudents().add(rick);

        Students students = studentConfig.currentStudents();

        Assert.assertEquals(size, students.size());
    }


    @Test
    public void studentConfigTest_List_Size_CurrentStudents_TotalStudyTime() {
        Student max = new Student(1, "Max");
        Student mike = new Student(2, "Mike");
        Student rick = new Student(3, "Rick");
        double expectedMax = 100;
        double expectedMike = 50;
        double expectedRick = 200;

        max.learn(100);
        mike.learn(50);
        rick.learn(200);


        studentConfig.previousStudents().add(max);
        studentConfig.previousStudents().add(mike);
        studentConfig.previousStudents().add(rick);


        Assert.assertEquals(expectedMax, max.getTotalStudyTime(), 0.1);
        Assert.assertEquals(expectedMike, mike.getTotalStudyTime(), 0.1);
        Assert.assertEquals(expectedRick, rick.getTotalStudyTime(), 0.1);
    }


    @Test
    public void studentConfigTest_List_Size_PreviousStudents() {
        studentConfig.previousStudents().clear();
        Student rice = new Student(1, "Rice");
        Student frank = new Student(2, "frank");
        Student jimmy = new Student(3, "Jimmy");

        int size = 3;

        studentConfig.previousStudents().add(rice);
        studentConfig.previousStudents().add(frank);
        studentConfig.previousStudents().add(jimmy);

        Students students = studentConfig.previousStudents();

        Assert.assertEquals(size, students.size());

    }

    @Test
    public void studentConfigTest_Iterator_Previous() {
        studentConfig.previousStudents().clear();
        Student rice = new Student(1, "Rice");
        Student frank = new Student(2, "frank");
        Student jimmy = new Student(3, "Jimmy");

        studentConfig.previousStudents().add(rice);
        studentConfig.previousStudents().add(frank);
        studentConfig.previousStudents().add(jimmy);
        Iterator<Student> students = studentConfig.previousStudents().iterator();


        Student student = students.next();

       Assert.assertEquals(student, rice);

    }


    @Test
    public void studentConfigTest_Previous_TotalStudyTime() {
        Student rice = new Student(1, "Rice");
        Student frank = new Student(2, "frank");
        Student jimmy = new Student(3, "Jimmy");
        double expectedRice = 100;
        double expectedFrank = 50;
        double expectedJimmy = 200;

        rice.learn(100);
        frank.learn(50);
        jimmy.learn(200);


        studentConfig.previousStudents().add(rice);
        studentConfig.previousStudents().add(frank);
        studentConfig.previousStudents().add(jimmy);


        Assert.assertEquals(expectedRice, rice.getTotalStudyTime(), 0.1);
        Assert.assertEquals(expectedFrank, frank.getTotalStudyTime(), 0.1);
        Assert.assertEquals(expectedJimmy, jimmy.getTotalStudyTime(), 0.1);

    }


    @Test
    public void studentConfigTest_Iterator_CurrentStudents() {
        studentConfig.currentStudents().clear();
        Student max = new Student(1, "Max");
        Student mike = new Student(2, "Mike");
        Student rick = new Student(3, "Rick");

        studentConfig.currentStudents().add(max);
        studentConfig.currentStudents().add(mike);
        studentConfig.currentStudents().add(rick);
        Iterator<Student> students = studentConfig.currentStudents().iterator();


        Student student = students.next();

        Assert.assertEquals(student, max);

    }

    @Test
    public void studentConfigTest_ForEach_CurrentStudents(){
        Student max = new Student(1, "Max");
        Student mike = new Student(2, "Mike");
        Student rick = new Student(3, "Rick");
        double currentStudentsTotalStudyTIme = 100;

        studentConfig.currentStudents().add(max);
        studentConfig.currentStudents().add(mike);
        studentConfig.currentStudents().add(rick);

        studentConfig.currentStudents().forEach(student -> {student.learn(100);});

        Assert.assertEquals(currentStudentsTotalStudyTIme, max.getTotalStudyTime(), 0.1);

    }

    @Test
    public void studentConfigTest_ForEach_PreviousStudents(){
        Student rice = new Student(1, "Rice");
        Student frank = new Student(2, "frank");
        Student jimmy = new Student(3, "Jimmy");
        double previousStudentsTotalStudyTIme = 100;

        studentConfig.currentStudents().add(rice);
        studentConfig.currentStudents().add(frank);
        studentConfig.currentStudents().add(jimmy);

        studentConfig.currentStudents().forEach(student -> {student.learn(100);});

        Assert.assertEquals(previousStudentsTotalStudyTIme, rice.getTotalStudyTime(), 0.1);
    }
}
