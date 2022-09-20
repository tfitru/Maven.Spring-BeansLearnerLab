package LearnerBeanLab.Bean;

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
public class InstructorConfigTest {

    @Autowired
    InstructorsConfig instructorsConfig;

    @Test
    public void instructorsConfig_Size_tcUsaInstructors(){
        Instructor bill = new Instructor(1, "Bill");
        Instructor nancy = new Instructor(2, "Nancy");
        Instructor mary = new Instructor(3, "Mary");
        Instructor hank = new Instructor(4, "Hank");
        int size = 4;

        instructorsConfig.tcUsaInstructors().add(bill);
        instructorsConfig.tcUsaInstructors().add(nancy);
        instructorsConfig.tcUsaInstructors().add(mary);
        instructorsConfig.tcUsaInstructors().add(hank);

        Assert.assertEquals(size, instructorsConfig.tcUsaInstructors().size());
    }

    @Test
    public void instructorsConfig_Size_tcUkInstructors(){
        Instructor harold = new Instructor(1, "Harold");
        Instructor hagrid = new Instructor(2, "Hagrid");
        Instructor snape = new Instructor(3, "Snape");
        Instructor margarita = new Instructor(4, "Margarita");
        int size = 4;

        instructorsConfig.tcUkInstructors().add(harold);
        instructorsConfig.tcUkInstructors().add(hagrid);
        instructorsConfig.tcUkInstructors().add(snape);
        instructorsConfig.tcUkInstructors().add(margarita);

        Assert.assertEquals(size, instructorsConfig.tcUkInstructors().size());

    }


    @Test
    public void instructorsConfig_Size_zipcodeInstructors(){
        Instructor kris = new Instructor(1, "Kris");
        Instructor dolio = new Instructor(2, "Dolio");
        Instructor david = new Instructor(3, "David");
        Instructor karen = new Instructor(4, "Karen");
        int size = 4;

        instructorsConfig.zipcodeInstructors().add(kris);
        instructorsConfig.zipcodeInstructors().add(dolio);
        instructorsConfig.zipcodeInstructors().add(david);
        instructorsConfig.zipcodeInstructors().add(karen);

        Assert.assertEquals(size, instructorsConfig.zipcodeInstructors().size());

    }

}
