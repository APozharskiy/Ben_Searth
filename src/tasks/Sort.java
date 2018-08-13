package tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        String str = "";
        String tmp = "";
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();

        String[] words = str.split(",");
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].compareToIgnoreCase(words[j]) > 0) {
                    tmp = words[i];
                    words[i] = words[j];
                    words[j] = tmp;

                }
            }

        }
        System.out.println(Arrays.toString(words));

    }
}
