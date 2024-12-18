import java.util.*;
import java.io.*;

/*Darshan Kania*/
class NumberClass {
    private int number;

    public  NumberClass(int num) {
        number = num;
    }

    public Boolean isPrimeNumber() {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class Main {
    public static void main(String args[]) {
        int numCheck;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number:- ");
        numCheck = sc.nextInt();
        NumberClass Obj = new NumberClass(numCheck);
        System.out.println(Obj.isPrimeNumber());
    }
}