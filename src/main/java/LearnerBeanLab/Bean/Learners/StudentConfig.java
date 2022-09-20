package LearnerBeanLab.Bean.Learners;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {


    @Bean(name="students")
    public Students currentStudents(){
        List<Student> studentsList = new ArrayList<>();
        return new Students(studentsList);
    }

    @Bean(name="previousStudents")
    public Students previousStudents(){
        List<Student> studentsList = new ArrayList<>();
        return new Students(studentsList);
    }

}
