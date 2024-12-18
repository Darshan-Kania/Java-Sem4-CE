import java.util.Arrays;

/*Darshan Kania*/
class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(final String name, final int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student extends Person {
    private int rollno;
    private double marks[];
    static int count;

    static {
        count = 0;
    }

    {
        count++;
        marks = new double[5];
    }


    public Student() {
        this.marks = null;
    }

    public Student(final int rollno) {
        this.rollno = rollno;
    }

    public Student(final double[] marks, final int rollno) {
        this.marks = marks;
        this.rollno = rollno;
    }

    public Student(final String name, final int age, final int rollno, final double[] marks) {
        super(name, age);
        this.rollno = rollno;
        this.marks = marks;
    }

    public static int getCount() {
        return Student.count;
    }

    public int getRollno() {
        return this.rollno;
    }

    public void setRollno(final int rollno) {
        this.rollno = rollno;
    }

    public double[] getMarks() {
        return this.marks;
    }

    public void setMarks(final double[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Student{" +
                "rollno=" + rollno +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }

    public void displayDetails(Student std[]) {
        Student highest = null;
        double highestTotal = 0;
        for (Student st : std) {
            double sum = 0;
            for (double marks : st.getMarks()) {
                sum += marks;
            }
            if (sum / 5 > highestTotal) {
                highestTotal = sum / 5;
                highest = st;
            }
        }
        System.out.println(highest.toString());
    }
}

class TestStudentClass {
    public static void main(String args[]) {
        Student[] stdDetails = new Student[]{
                new Student("Darshan", 19, 107, new double[]{34, 35, 36, 32, 30}),
                new Student("Hirav", 19, 121, new double[]{30, 32, 34, 35, 32}),
                new Student("Rut", 18, 112, new double[]{36, 32, 31, 30, 30})
        };
        Student st;//It will not increment count as memory not made.
        Student DDUStds = new Student();
        DDUStds.displayDetails(stdDetails);
        System.out.println(Student.getCount());
    }
}