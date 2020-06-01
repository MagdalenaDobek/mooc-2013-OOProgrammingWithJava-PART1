
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);

        while(true) {
            System.out.print("name: ");
            String userName = reader.nextLine();

            if (userName.isEmpty()) {
                break;
            } else {
                System.out.print("studentnumber: ");
                String userNum = reader.nextLine();

                list.add( new Student(userName, userNum) );
            }
        }
        System.out.println("");
        for (Student student : list) {
            System.out.println(student);
        }
        System.out.println("");
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.print("Result: ");

        for (Student student : list) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }

        }
    }
}
