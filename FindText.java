package geekbrains.lessons.lessonsix;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FindText {

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            String poem = new String(Files.readAllBytes(Paths.get("poem3.txt")));
            System.out.println(poem.contains(userInput));


        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
