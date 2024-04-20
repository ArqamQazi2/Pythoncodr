import java.util.Scanner;

public class PR26 {
    // static void checkNum(int num) {
    //     if (num < 1) {
    //         throw new ArithmeticException("Number Must be greater than 1");
    //     } else {
    //         System.out.println("Square of " + num + " is " + (num * num));
    //     }
    // }
    // public static void main(String[] args) {
    //     checkNum(-2);
    // }

    // --> WAP to throw "NotMatchException" when password is not equal to "India"
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "India";
        String str;
        System.out.print("Enter String: ");
        str = sc.next();
        try {
            if (s.equals(str)) {

            } else {
                throw new NotMatchException();
            }
        } catch (NotMatchException e) {
            System.out.println(e);
        }
    }
}
// --> WAP to throw "NotMatchException" when password is not equal to "India"
class NotMatchException extends Exception {
    public NotMatchException() {
        System.out.println("String doesn't Match");
    }
}
