
import java.util.ArrayList;
import java.util.Scanner;

public class Student {

    private String name;
    private String number;

    public Student(String studentName, String studentNumber) {
        this.name = studentName;
        this.number = studentNumber;

    }

    public String getName() {
        return this.name;

    }
    public String getStudentNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.number + ")";
    }

}

