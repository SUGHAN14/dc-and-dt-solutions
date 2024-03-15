import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int maxLength = 0;
        int currentLength = 0;
        for (int i = 0; i < n; i++) {
            if (isPerfectCube(arr[i])) {
                currentLength++;
                maxLength = Math.max(maxLength, currentLength);
            } else {
                currentLength = 0;
            }
        }
        
        System.out.println(maxLength);
    }
    
    public static boolean isPerfectCube(int num) {
        int cubeRoot = (int) Math.cbrt(num);
        return cubeRoot * cubeRoot * cubeRoot == num;
    }
}
