package LearnerBeanLab.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean(name="students")
    public Students currentStudents(){
        Student max = new Student(1, "Max");
        Student mike = new Student(2, "Mike");
        Student rick = new Student(3, "Rick");
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(max);
        studentsList.add(mike);
        studentsList.add(rick);
        return new Students(studentsList);
    }

    @Bean(name="previousStudents")
    public Students previousStudents(){
        Student rice = new Student(1, "Rice");
        Student frank = new Student(2, "frank");
        Student jimmy = new Student(3, "Jimmy");
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(rice);
        studentsList.add(frank);
        studentsList.add(jimmy);
        return new Students(studentsList);
    }

}
