import java.util.HashMap;
import java.util.Scanner;

public class StudentMapDemo {
    public static void main(String[] args) {
        HashMap<Integer , Student> studentMap = new HashMap<>();
        studentMap.put(101, new Student("aju", 101, 69.5));
        studentMap.put(102, new Student("bubu", 102, 18.0));
        studentMap.put(103, new Student("litun", 103, 76.5));
        for (Student s : studentMap.values()) {
            s.displayResult();
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        if (studentMap.containsKey(roll)) {
            //Student stu = studentMap.get(roll);
            studentMap.get(roll).displayResult();
        } else {
            System.out.println("Student not found!");
        }
Student top =null;
        for (Student s : studentMap.values()) {
            if(top!=null){
                if(top.getMarks() < s.getMarks()){
                    top = s;
                }
            }
            else{
                top = s;
            }
        }

        System.out.println("Topper is -> "+top.getName());
sc.close();

    }
}
