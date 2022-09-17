package LearnerBeanLab.Bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class InstructorsConfig {

    @Bean(name="tcUsaInstructors()")
    public Instructors tcUsaInstructors(){
        Instructor bill = new Instructor(1, "Bill");
        Instructor nancy = new Instructor(2, "Nancy");
        Instructor mary = new Instructor(3, "Mary");
        Instructor hank = new Instructor(4, "Hank");

        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(bill);
        instructorList.add(nancy);
        instructorList.add(mary);
        instructorList.add(hank);

        return new Instructors(instructorList);
    }

    @Bean(name="tcUkInstructors")
    public Instructors tcUkInstructors(){
        Instructor harold = new Instructor(1, "Harold");
        Instructor hagrid = new Instructor(2, "Hagrid");
        Instructor snape = new Instructor(3, "Snape");
        Instructor margarita = new Instructor(4, "Margarita");

        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(harold);
        instructorList.add(hagrid);
        instructorList.add(snape);
        instructorList.add(margarita);

        return new Instructors(instructorList);
    }

    @Primary
    @Bean(name="zipcodeInstructors")
    public Instructors zipcodeInstructors(){
        Instructor kris = new Instructor(1, "Kris");
        Instructor dolio = new Instructor(2, "Dolio");
        Instructor david = new Instructor(3, "David");
        Instructor karen = new Instructor(4, "Karen");

        List<Instructor> instructorList = new ArrayList<>();
        instructorList.add(kris);
        instructorList.add(dolio);
        instructorList.add(david);
        instructorList.add(karen);

        return new Instructors(instructorList);
    }


}
