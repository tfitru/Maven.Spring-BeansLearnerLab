package LearnerBeanLab.Bean;

import LearnerBeanLab.Bean.Classrooms.ClassroomConfig;
import LearnerBeanLab.Bean.Learners.Student;
import LearnerBeanLab.Bean.Learners.StudentConfig;
import LearnerBeanLab.Bean.Teachers.Instructor;
import LearnerBeanLab.Bean.Teachers.InstructorsConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClassroomConfigTest {

    @Autowired
    ClassroomConfig classroomConfig;
    @Autowired
    InstructorsConfig instructorsConfig;
    @Autowired
    StudentConfig studentConfig;

    //current students
    Student max = new Student(1, "Max");
    Student mike = new Student(2, "Mike");
    Student rick = new Student(3, "Rick");

    // oldStudents
    Student rice = new Student(1, "Rice");
    Student frank = new Student(2, "frank");
    Student jimmy = new Student(3, "Jimmy");

    // Zipcode Instructors
    Instructor kris = new Instructor(1, "Kris");
    Instructor dolio = new Instructor(2, "Dolio");
    Instructor david = new Instructor(3, "David");
    Instructor karen = new Instructor(4, "Karen");

    // tcUkInstructors
    Instructor harold = new Instructor(1, "Harold");
    Instructor hagrid = new Instructor(2, "Hagrid");
    Instructor snape = new Instructor(3, "Snape");
    Instructor margarita = new Instructor(4, "Margarita");




    @Test
    public void classroomConfigTest_previousCohort(){
        instructorsConfig.tcUkInstructors().add(harold);
        instructorsConfig.tcUkInstructors().add(hagrid);
        instructorsConfig.tcUkInstructors().add(snape);
        instructorsConfig.tcUkInstructors().add(margarita);
        int instructorsList = 4;

        studentConfig.previousStudents().add(rice);
        studentConfig.previousStudents().add(frank);
        studentConfig.previousStudents().add(jimmy);
        int studentPreviousList = 3;

        int sizeInstructors = classroomConfig.previousCohort(studentConfig.previousStudents(),
                instructorsConfig.tcUkInstructors()).getInstructors().size();

        int sizeStudent = classroomConfig.previousCohort(studentConfig.previousStudents(),
                instructorsConfig.tcUkInstructors()).getStudents().size();

        Assert.assertEquals(instructorsList, sizeInstructors);
        Assert.assertEquals(studentPreviousList, sizeStudent);

    }

    @Test
    public void classroomConfigTest_currentCohort(){
        instructorsConfig.zipcodeInstructors().add(kris);
        instructorsConfig.zipcodeInstructors().add(dolio);
        instructorsConfig.zipcodeInstructors().add(david);
        instructorsConfig.zipcodeInstructors().add(karen);
        int instructorsList = 4;

        studentConfig.currentStudents().add(max);
        studentConfig.currentStudents().add(mike);
        studentConfig.currentStudents().add(rick);
        int studentPreviousList = 3;

        int sizeInstructors = classroomConfig.currentCohort(studentConfig.currentStudents(),
                instructorsConfig.zipcodeInstructors()).getInstructors().size();

        int sizeStudent = classroomConfig.currentCohort(studentConfig.currentStudents(),
                instructorsConfig.zipcodeInstructors()).getStudents().size();

        Assert.assertEquals(instructorsList, sizeInstructors);
        Assert.assertEquals(studentPreviousList, sizeStudent);

    }


}
