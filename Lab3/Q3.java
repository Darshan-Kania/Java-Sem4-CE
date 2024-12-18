import java.util.Scanner;

/*Darshan Kania*/
class Q3 {
    public static String shortFullName(String str[]) {
        String ans = new String();
        for (int i = 0; i < str.length - 1; i++) {
            ans += str[i].charAt(0)+".";
        }
        ans += str[str.length - 1];
        return ans;
    }

    public static void main(String args[]) {
        String name[] = new String[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.next();
        }
        System.out.println(shortFullName(name));
    }
}