import java.util.Arrays;

/*Darshan Kania*/
class student {
    private int roll_no;
    private String name;
    private int marks[];

    {
        marks = new int[5];
        name = new String();
    }

    public student(final int roll_no, final String name, final int[] marks) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
    }

    public student() {
    }

    public student(final int[] marks) {
        this.marks = marks;
    }

    public double findAverage() {
        double sum = 0;
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }
        return sum / marks.length;
    }

    @Override
    public String toString() {
        return "student{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", marks=" + Arrays.toString(marks) +
                '}';
    }
}

class TestStudent {
    public static void main(String args[]) {
        student std = new student(83, "Maharsh", new int[]{10, 20, 30, 40, 50});
        System.out.println(std.toString());
        System.out.println(std.findAverage());
        student stds[] = new student[]{new student(107, "Darshan", new int[]{30, 36, 30, 30, 34}), new student(121, "Hirav", new int[]{32, 33, 23, 34, 30}), new student(122, "Manthan", new int[]{16, 20, 30, 30, 32})};
        for (student s : stds) {
            System.out.println(s.toString());
            System.out.println(s.findAverage());
        }
    }
}