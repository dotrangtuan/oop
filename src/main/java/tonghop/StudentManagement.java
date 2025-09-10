package tonghop;

import java.io.IOException;
import java.util.*;

import static tonghop.inputfile.InputFileStudent.inputGoodStudents;
import static tonghop.inputfile.InputFileStudent.inputNormalStudents;

public class StudentManagement {
    static List<Student> sinhViens = new ArrayList<>();
    static List<NormalStudent> normalStudents = new ArrayList<>();
    public static List<GoodStudent> goodStudents = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        goodStudents = inputGoodStudents();
        normalStudents = inputNormalStudents();
        sinhViens.addAll(goodStudents);
        sinhViens.addAll(normalStudents);
        showInforStudent(sinhViens);
        List<Student> sinhVienTuyenDung = hiring();
        showInforStudent(sinhVienTuyenDung);
        System.out.println("------------------");
        sortAllStudent();
    }

    public static void sortAllStudent() {
        Collections.sort(sinhViens, Comparator.comparing(Student::getFullName).reversed()
                .thenComparing(Student::getPhoneNumber)
        );
    }

    public static List<Student> hiring() {
        int count = 0;
        List<Student> sinhViens = new ArrayList<>();
        do {
            System.out.println("Nhap so luong sinh van can tuyen dung (11 - 15):");
            Scanner sc = new Scanner(System.in);
            count = sc.nextInt();
        } while (count < 11 || count > 15);

        if (goodStudents.size() > count) {
            goodStudents.sort(
                    Comparator.comparingDouble(GoodStudent::getGpa).reversed()
                            .thenComparing(Student::getFullName));
            System.out.println("--------------");

            sinhViens.addAll(goodStudents.subList(0, count));

        } else if (goodStudents.size() == count){
            sinhViens.addAll(goodStudents);

        } else {
            sinhViens.addAll(goodStudents);
            normalStudents.sort(
                    Comparator.comparingDouble(NormalStudent::getEntryTestScore)
                            .thenComparing(NormalStudent::getEnglishScore).reversed()
                            .thenComparing(NormalStudent::getFullName)
            );
            sinhViens.addAll(normalStudents.subList(0, count - goodStudents.size()));
        }

        return sinhViens;
    }


    public static void showInforStudent(List<Student> sinhViens) {
        for (int i = 0; i < sinhViens.size(); i++) {
            if (sinhViens.get(i) instanceof GoodStudent) {
                GoodStudent goodStudent = (GoodStudent) sinhViens.get(i);
                goodStudent.showMyInfor();
            } else if (sinhViens.get(i) instanceof NormalStudent) {
                NormalStudent normalStudent = (NormalStudent) sinhViens.get(i);
                normalStudent.showMyInfor();
            } else {
                Student sinhVien = sinhViens.get(i);
                sinhVien.showMyInfor();
            }
        }
    }
}
