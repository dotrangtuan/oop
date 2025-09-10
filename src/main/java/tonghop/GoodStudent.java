package tonghop;

import java.time.LocalDate;

public class GoodStudent extends Student{
    private double gpa;
    private String bestRewardName;

    public GoodStudent() {
        super();
    }

    public GoodStudent(String fullName, LocalDate doB, String sex, String phoneNumber, String universityName, String gradeLevel, double gpa, String bestRewardName) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.gpa = gpa;
        this.bestRewardName = bestRewardName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getBestRewardName() {
        return bestRewardName;
    }

    public void setBestRewardName(String bestRewardName) {
        this.bestRewardName = bestRewardName;
    }

    @Override
    public void showMyInfor() {
        System.out.printf(
                "%-20s %-12s %-10s %-12s %-15s %-12s %-6.2f %-15s%n",
                getFullName(),
                getDoB(),
                getSex(),
                getPhoneNumber(),
                getUniversityName(),
                getGradeLevel(),
                getGpa(),
                getBestRewardName()
        );
    }
}
