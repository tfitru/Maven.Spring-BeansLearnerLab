package LearnerBeanLab.Bean.Classrooms;

import LearnerBeanLab.Bean.Learners.Students;
import LearnerBeanLab.Bean.Teachers.Instructors;
import LearnerBeanLab.Bean.Teachers.Teacher;

public class Classroom {

    Instructors instructors;

    Students students;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }


    public void hostLecture(Teacher teacher, double numberOfHours){
        teacher.lecture(students.getPersonList(), numberOfHours);
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructors instructors) {
        this.instructors = instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }
}
