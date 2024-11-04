package override;

public class Student extends Human {
    // Independent member variable
    Integer studentNumber;
    String major;

    // Constructor override
    public Student(int age, String name, int stNum, String major) {
        // Call parent constructor
        super(age, name);
        this.studentNumber = stNum;
        this.major = major;
    }

    @Override
    public void intro() {
        System.out.println("I am " + name + ", " + age + " years old, " + "student number is " + studentNumber);
        super.intro();
    }

    public void study() {
        System.out.println("공부 합니다");
    }
}
