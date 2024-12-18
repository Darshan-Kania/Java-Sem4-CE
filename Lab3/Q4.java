import java.util.Scanner;

/*Darshan Kania*/
class Tester {
    public static String whiteSpaceRemover(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(whiteSpaceRemover(str));
    }
}