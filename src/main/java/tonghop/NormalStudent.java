package tonghop;

import java.time.LocalDate;

public class NormalStudent extends Student{
    private int englishScore;
    private double entryTestScore;

    public NormalStudent() {
        super();
    }

    public NormalStudent(String fullName, LocalDate doB, String sex, String phoneNumber, String universityName, String gradeLevel, int englishScore, double entryTestScore) {
        super(fullName, doB, sex, phoneNumber, universityName, gradeLevel);
        this.englishScore = englishScore;
        this.entryTestScore = entryTestScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(int englishScore) {
        this.englishScore = englishScore;
    }

    public double getEntryTestScore() {
        return entryTestScore;
    }

    public void setEntryTestScore(double entryTestScore) {
        this.entryTestScore = entryTestScore;
    }

    @Override
    public void showMyInfor() {
        System.out.printf(
                "%-20s %-12s %-10s %-15s %-15s %-20s %-14d %-15.2f%n",
                getFullName(),
                getDoB(),
                getSex(),
                getPhoneNumber(),
                getUniversityName(),
                getGradeLevel(),
                getEnglishScore(),
                getEntryTestScore()
        );
    }
}
