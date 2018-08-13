package tasks;


import java.util.Scanner;

public class Grep {
    public static void main(String[] args) {
        String str = "";
        String word = "";
        String che = "";
        Scanner scanner = new Scanner(System.in);
        str = scanner.nextLine();
        word = scanner.nextLine();
        che = scanner.nextLine();

        String[] lines = str.split(",");
        for (int i = 0; i < lines.length; i++) {
            String[] words = lines[i].split(" ");
            for (int i1 = 0; i1 < words.length; i1++) {
                if (words[i1].equals(word)) {
                    System.out.println(i);
                    System.out.println(i1);
                    System.out.println(lines[i]);
                    System.out.println(words[i1]);

                }
                if (words[i1].contains(che)){
                    System.out.println(i);
                    System.out.println(i1);
                    System.out.println(lines[i]);
                    System.out.println(words[i1]);
                }
            }

        }


    }
}
