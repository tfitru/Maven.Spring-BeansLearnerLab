package LearnerBeanLab.Bean;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Instructor extends Person implements Teacher {

    private int iterableSize;

    public Instructor(long id, String name) {
        super(id, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    @Override
    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {

        if(learners instanceof Collection){
            iterableSize = (((Collection<? extends Learner>) learners).size());
        }

        double numberOfHoursPerLearner = numberOfHours/iterableSize/2;
        learners.forEach(learner -> learner.learn(numberOfHoursPerLearner));

    }



}
