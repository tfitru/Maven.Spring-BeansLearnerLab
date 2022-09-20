package LearnerBeanLab.Bean.Teachers;

import LearnerBeanLab.Bean.Teachers.Instructor;
import LearnerBeanLab.Bean.Teachers.Instructors;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig {

    @Bean(name="tcUsaInstructors()")
    public Instructors tcUsaInstructors(){
        List<Instructor> instructorList = new ArrayList<>();


        return new Instructors(instructorList);
    }

    @Bean(name="tcUkInstructors")
    public Instructors tcUkInstructors(){
        List<Instructor> instructorList = new ArrayList<>();
        return new Instructors(instructorList);
    }

    @Primary
    @Bean(name="zipcodeInstructors")
    public Instructors zipcodeInstructors(){
        List<Instructor> instructorList = new ArrayList<>();
        return new Instructors(instructorList);
    }


}
