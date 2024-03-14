import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] integers = new int[N];
        for (int i = 0; i < N; i++) {
           integers[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            int x = integers[i];
            System.out.print(integers[N - x] + " ");
        }
    }
}
