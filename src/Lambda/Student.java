package Lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student {
   String fullName;
    int age;
   double gpa;
    int height;

       public Student(String fullName, int age, double gpa, int height) {
        this.fullName = fullName;
        this.age = age;
        this.gpa = gpa;
        this.height = height;
    }
public String getFullName(){
           return fullName;
}

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public int getHeight() {
        return height;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

interface BestStudent {
    Student theBest(ArrayList<Student> students);
}

class StudentAwards {
    Student theMostGPA(ArrayList<Student> students) {
        BestStudent best = studentList -> {
            Student maxGpaStudent = studentList.get(0);
            for (Student st : studentList) {
                if (maxGpaStudent.getGpa() < st.getGpa()) {
                    maxGpaStudent = st;
                }
            }
            return maxGpaStudent;
        };
        return best.theBest(students);
    }


    Student theMostAge(ArrayList<Student> students) {
        BestStudent best = studentList -> {
            Student maxStudentAge = studentList.get(0);
            for (Student a : studentList) {
                if (maxStudentAge.getAge() < a.getAge()) {
                    maxStudentAge= a;
                }
            }
            return maxStudentAge;
        };
        return best.theBest(students);
    }

    Student theLongFullName(ArrayList<Student> students) {
        BestStudent best = studentList -> {
            Student maxFullName = studentList.get(0);
            for (Student cc : studentList) {
                if (maxFullName.getFullName().length() < cc.getFullName().length()) {
                    maxFullName = cc;
                }
            }
            return maxFullName;
        };
        return best.theBest(students);
    }

    Student theHighest(ArrayList<Student> students) {
        BestStudent best = studentList -> {
            Student maxHeight = studentList.get(0);
            for (Student h : studentList) {
                if (maxHeight.getHeight() < h.getHeight()) {
                    maxHeight = h;
                }
            }
            return maxHeight;
        };
        return best.theBest(students);
    }
}

