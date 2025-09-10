package tonghop.mapper;

import tonghop.GoodStudent;
import tonghop.NormalStudent;
import tonghop.exception.InvalidDOBException;
import tonghop.exception.InvalidFullNameException;
import tonghop.exception.InvalidPhoneNumberException;
import tonghop.validation.Validation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class StudentMapper {
    public static NormalStudent toNormalStudent(String[] values){
        NormalStudent normalStudent = new NormalStudent();

        try {
            Validation.validateFullName(values[0]);
            Validation.validateDOB(values[1]);
            Validation.validatePhoneNumber(values[3]);
            String fullName = values[0];
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate doB = LocalDate.parse(values[1], formatter);
            String sex = values[2];
            String phoneNumber = values[3];
            String universityName = values[4];
            String gradeLevel = values[5];
            int englishScore = Integer.parseInt(values[6]);
            double entryTestScore = Double.parseDouble(values[7]);
            normalStudent.setFullName(fullName);
            normalStudent.setDoB(doB);
            normalStudent.setPhoneNumber(phoneNumber);
            normalStudent.setSex(sex);
            normalStudent.setUniversityName(universityName);
            normalStudent.setGradeLevel(gradeLevel);
            normalStudent.setEnglishScore(englishScore);
            normalStudent.setEntryTestScore(entryTestScore);

        } catch (InvalidFullNameException | InvalidDOBException | InvalidPhoneNumberException e ) {
            System.out.println(e.getMessage());
        }

        return normalStudent;
    }

    public static GoodStudent toGoodStudent(String[] values) {
        GoodStudent goodStudent = new GoodStudent();
        try {
            Validation.validateFullName(values[0]);
            Validation.validateDOB(values[1]);
            Validation.validatePhoneNumber(values[3]);
            String fullName = values[0];
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate doB = LocalDate.parse(values[1], formatter);
            String phoneNumber = values[3];
            String sex = values[2];
            String universityName = values[4];
            String gradeLevel = values[5];
            double gpa = Double.parseDouble(values[6]);
            String bestRewardName = values[7];

            goodStudent.setFullName(fullName);
            goodStudent.setDoB(doB);
            goodStudent.setPhoneNumber(phoneNumber);
            goodStudent.setSex(sex);
            goodStudent.setUniversityName(universityName);
            goodStudent.setGradeLevel(gradeLevel);
            goodStudent.setGpa(gpa);
            goodStudent.setBestRewardName(bestRewardName);
        } catch (InvalidFullNameException | InvalidDOBException  | InvalidPhoneNumberException e ) {
            System.out.println(e.getMessage());
        }

        return goodStudent;
    }
}
