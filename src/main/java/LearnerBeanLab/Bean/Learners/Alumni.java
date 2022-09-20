package LearnerBeanLab.Bean.Learners;

import LearnerBeanLab.Bean.Learners.Students;
import LearnerBeanLab.Bean.Teachers.Instructors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Alumni {

    @Autowired
    @Qualifier("previousStudents")
    private Students students;
    @Autowired
    @Qualifier("zipcodeInstructors")
    private Instructors instructors;


    @PostConstruct
    public void executeBootCamp() {
        double numberOfHours = 1200.0 * this.students.size();
        double numberOfHoursPerTeach = numberOfHours/ this.instructors.findAll().size();
        this.instructors.forEach(instructor -> {instructor.lecture(students, numberOfHoursPerTeach);});
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }
}
