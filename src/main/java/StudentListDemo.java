import java.util.ArrayList;

public class StudentListDemo {


    public static void main(String[] args) {
        int passCount = 0;
        int failCount = 0;
        Student s = null;
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("aju", 101, 69.5));
        students.add(new Student("bubu", 102, 18.0));
        students.add(new Student("litun", 103, 76.5));

        for(Student x: students){
            x.displayResult();

            if(x.isPass()){
                passCount++;
            }
            else {
                failCount++;
            }

        }

        System.out.println("Total Passed: " +passCount);
        System.out.println("Total Failed: " +failCount);

        for (Student student : students) {
            if (s != null) {
                if (student.getMarks() > s.getMarks()) {
                    s = student;
                }
            } else {
                s = student;
            }
        }

        System.out.println("Topper: " + s.getName() + ", Marks: " + s.getMarks());

    }
}
