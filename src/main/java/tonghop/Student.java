package tonghop;


import java.time.LocalDate;

public class Student {
    private String fullName;
    private LocalDate doB;
    private String sex;
    private String phoneNumber;
    private String universityName;
    private String gradeLevel;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getDoB() {
        return doB;
    }

    public void setDoB(LocalDate doB) {
        this.doB = doB;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public Student() {

    }

    public Student(String fullName, LocalDate doB, String sex, String phoneNumber, String universityName, String gradeLevel) {
        this.fullName = fullName;
        this.doB = doB;
        this.sex = sex;
        this.phoneNumber = phoneNumber;
        this.universityName = universityName;
        this.gradeLevel = gradeLevel;
    }

    public void showMyInfor() {
        System.out.println("===== Thông tin sinh viên =====");
        System.out.println("Họ và tên: " + fullName);
        System.out.println("Ngày sinh: " + doB);
        System.out.println("Giới tính: " + sex);
        System.out.println("Số điện thoại: " + phoneNumber);
        System.out.println("Trường: " + universityName);
        System.out.println("Trình độ: " + gradeLevel);
        System.out.println("===============================");
    }
}
