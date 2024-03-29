import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        Set<Set<Character>> groups = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Character> charSet = new HashSet<>();
            for (char c : arr[i].toCharArray()) {
                charSet.add(c);
            }
            groups.add(charSet);
        }

        System.out.print(groups.size());
    }
}

//The program must accept N string values containing only lower case alphabets as the input. The program must print the number of groups possible among the N string values as the output. The grouping of the string values based on the alphabets that are used to form the string values.
