import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputText = scanner.nextLine();
        scanner.close();

        String[] words = inputText.split(" ");
        int maxLength = 0;
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        StringBuilder formattedTable = new StringBuilder();
        formattedTable.append("+").append("-".repeat(maxLength + 2)).append("+\n");
        for (String word : words) {
            formattedTable.append("|").append(String.format("%-" + (maxLength + 2) + "s", word)).append("|\n");
        }
        formattedTable.append("+").append("-".repeat(maxLength + 2)).append("+");

        System.out.println(formattedTable.toString());
    }
}
