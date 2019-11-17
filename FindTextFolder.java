package geekbrains.lessons.lessonsix;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class FindTextFolder {

    public static void main(String[] args) {
        File folder = new File( "/Users/darakutyrina/Documents/JAVA 1/LessonSix");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        for (File fileEntry : folder.listFiles()) {
            if (!fileEntry.isDirectory()) {
                try {
                    String poem = new String(Files.readAllBytes(Paths.get(fileEntry.getPath())));
                    System.out.println(poem.contains(userInput));
                } catch (IOException e){
                    System.out.println(e.getMessage());
                }

                System.out.println(fileEntry.getName());
            }
        }
    }

}
