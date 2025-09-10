package tonghop.inputfile;

import tonghop.GoodStudent;
import tonghop.NormalStudent;
import tonghop.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static tonghop.StudentManagement.goodStudents;
import static tonghop.mapper.StudentMapper.toGoodStudent;
import static tonghop.mapper.StudentMapper.toNormalStudent;

public class InputFileStudent {
    public static List<GoodStudent> inputGoodStudents() throws IOException {
        String csvFile = "goodStudent.csv";
        String line;
        String csvSplitBy = ",";
        BufferedReader br = null;
        List<GoodStudent> students = new ArrayList<>();

        try  {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(csvSplitBy);
                GoodStudent goodStudent = toGoodStudent(values);
                students.add(goodStudent);
            }
        } catch (IOException e) {
            System.out.println("Input files have unknow errors!");
        } finally {
            br.close();
        }

        return students;
    }

    public static List<NormalStudent> inputNormalStudents() throws IOException {
        String csvFile = "normalStudent.csv";
        String line;
        String csvSplitBy = ",";
        BufferedReader br = null;
        List<NormalStudent> students = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(csvSplitBy);
                NormalStudent normalStudent = toNormalStudent(values);
                students.add(normalStudent);
            }
        } catch (IOException e) {
            System.out.println("Input files have unknow errors!");
        } finally {
            br.close();
        }

        return students;
    }
}
