package LearnerBeanLab.Bean;

public class Student extends Person implements Learner{

    private double totalStudyTime;

    public Student(long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(double numberOfHours) {
        for(int i=0; i<=numberOfHours; i++){
            totalStudyTime++;
        }
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

    public void setTotalStudyTime(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }
}
