package LearnerBeanLab.Bean;

import LearnerBeanLab.Bean.Learners.Alumni;
import LearnerBeanLab.Bean.Learners.Student;
import LearnerBeanLab.Bean.Learners.Students;
import LearnerBeanLab.Bean.Teachers.Instructor;
import LearnerBeanLab.Bean.Teachers.Instructors;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AlumniTest {

    @Autowired
    Alumni alumni;

    @Autowired
    Students students;

    @Autowired
    Instructors instructors;

    Student rice = new Student(1, "Rice");
    Student frank = new Student(2, "frank");
    Student jimmy = new Student(3, "Jimmy");

    // Zipcode Instructors
    Instructor kris = new Instructor(1, "Kris");
    Instructor dolio = new Instructor(2, "Dolio");
    Instructor david = new Instructor(3, "David");
    Instructor karen = new Instructor(4, "Karen");

    @Test
    public void alumniTest(){
       students.add(rice);
       students.add(frank);
       students.add(jimmy);

       instructors.add(kris);
       instructors.add(dolio);
       instructors.add(david);
       instructors.add(karen);

       alumni.setInstructors(instructors);
       alumni.setStudents(students);

        alumni.executeBootCamp();


        Assert.assertEquals(900, this.instructors.findById(1).getHoursTaught(), 0.1);
    }


}
