package LearnerBeanLab.Bean;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class ClassroomConfig {

    @Bean(name="currentcohort")
    @DependsOn({"instructors", "students"})
    public Classroom currentCohort(@Qualifier("students") Students students, @Qualifier("zipcodeInstructors") Instructors instructors){

        return new Classroom(instructors, students);
    }



    @Bean(name="previouscohort")
    public Classroom previousCohort(@Qualifier("previousstudents") Students students, @Qualifier("tcUkInstructors") Instructors instructors){
        return new Classroom(instructors, students);
    }

}
