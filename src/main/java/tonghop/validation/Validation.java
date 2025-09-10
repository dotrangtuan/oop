package tonghop.validation;

import tonghop.exception.InvalidDOBException;
import tonghop.exception.InvalidFullNameException;
import tonghop.exception.InvalidPhoneNumberException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Validation {
    public static String regexPhoneNumber = "^(090|098|091|031|035|038)\\d{7}$";
    public static String regexFullName = "^.{10,50}$";
    public static String patternDate = "dd/MM/yyyy";

    public static void validateFullName(String fullName) throws InvalidFullNameException {
        if (!fullName.matches(regexFullName)) {
            throw new InvalidFullNameException("Họ tên phải từ 10 đến 50 ký tự!");
        }
    }

    public static void validatePhoneNumber(String phoneNumber) throws InvalidPhoneNumberException {
        if (!phoneNumber.matches(regexPhoneNumber)) {
            throw new InvalidPhoneNumberException("So dien thoai khong hop le");
        }
    }

    public static void validateDOB(String dob) throws InvalidDOBException {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(patternDate);
            LocalDate doB = LocalDate.parse(dob, formatter);
        } catch (DateTimeParseException e) {
            throw new InvalidDOBException("Ngay khong dung dinh dang");
        }
    }



}
