public class Student {
    private String name;
    private int rollNumber;
    private double marks;

    public Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public String getName(){
        return name;
    }

    public boolean isPass() {
        return marks >= 40;
    }

    public void displayResult() {
        String result = isPass() ? "PASS" : "FAIL";
        System.out.println("Name: " + name +
                ", Roll: " + rollNumber +
                ", Marks: " + marks +
                ", Result: " + result);
    }

    public static void main(String[] args) {
        Student s1 = new Student("aju", 101, 69.5);
        Student s2 = new Student("bubu", 102, 18.0);
        Student s3 = new Student("litun", 103, 76.5);

        s1.displayResult();
        s2.displayResult();
        s3.displayResult();
    }
}
