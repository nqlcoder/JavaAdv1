package Inherit;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        Student s1 = new Student();
        s1.Hoten = "Linh";
        s1.NoiSinh = "HN";
        s1.ChuyenNganh = Major.ToanHoc;

        ForeinStudent fs = new ForeinStudent();
        fs.Hoten = "Licha";
        fs.NoiSinh = "Argen";
        fs.ChuyenNganh = Major.ThienVanHoc;
        fs.QuocTich = "Argen";

        students.add(s1);
        students.add(fs);

        for(Student student : students) {
            student.Print();
        }
    }
}
