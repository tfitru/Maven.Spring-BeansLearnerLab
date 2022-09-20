package LearnerBeanLab.Bean.Classrooms;


import LearnerBeanLab.Bean.Classrooms.Classroom;
import LearnerBeanLab.Bean.Learners.Students;
import LearnerBeanLab.Bean.Teachers.Instructors;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean(name="currentStudents")
    @DependsOn({"zipcodeInstructors", "students"})
    public Classroom currentCohort(@Qualifier("students") Students students, @Qualifier("zipcodeInstructors") Instructors instructors){
        return new Classroom(instructors, students);
    }



    @Bean(name="oldStudent")
    public Classroom previousCohort(@Qualifier("previousStudents") Students students, @Qualifier("tcUkInstructors") Instructors instructors){
        return new Classroom(instructors, students);
    }

}
