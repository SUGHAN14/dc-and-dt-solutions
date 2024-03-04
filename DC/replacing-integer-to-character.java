import java.util.*;

public class Hello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a = 10;

        String alpha = "";
        String beta = "";

        // Reading characters into alpha
        for (int i = 0; i < a; i++) {
            alpha += sc.next().charAt(0);
        }

        String string = String.valueOf(N);

        // Replacing digits in N with characters from alpha
        for (int i = 0; i < string.length(); i++) {
            int digit = Character.getNumericValue(string.charAt(i));
            if (digit >= 1 && digit <= a) {
                beta += alpha.charAt(digit - 1);
            } else {
                System.out.println("Invalid digit in N: " + digit);
                return;
            }
        }

        System.out.println(beta);
    }
}
