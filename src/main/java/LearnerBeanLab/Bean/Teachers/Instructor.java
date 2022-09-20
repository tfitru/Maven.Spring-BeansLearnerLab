package LearnerBeanLab.Bean.Teachers;


import LearnerBeanLab.Bean.Learners.Learner;
import LearnerBeanLab.Bean.Peoples.Person;

import java.util.ArrayList;
import java.util.List;

public class Instructor extends Person implements Teacher {

    private double hoursTaught;
    public Instructor(long id, String name) {
        super(id, name);
        hoursTaught = 0;
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
        hoursTaught += numberOfHours;
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        List<Learner> learnList = new ArrayList<>();
        learners.forEach(learnList::add);
        double numberOfHoursPerLearner = numberOfHours/ learnList.size();
        learners.forEach(learn -> learn.learn(numberOfHoursPerLearner));
        hoursTaught += numberOfHours;
    }

    public double getHoursTaught() {
        return hoursTaught;
    }

}
