import java.util.Scanner;

/*Darshan Kania*/
class Q2 {
    public static boolean isPalindrome(String str) {
        String dummy = new String();
        dummy = str.toLowerCase();
        int end = dummy.length() - 1;
        int start = 0;
        while (start < end) {
            if (dummy.charAt(start) != dummy.charAt(end))
                return false;
            else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean result=isPalindrome(str);
        if (result) {
            System.out.printf("%s is a palindrome.",str);
        } else {
            System.out.printf("%s is not a palindrome.",str);
        }
    }
}