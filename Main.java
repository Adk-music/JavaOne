package geekbrains.lessons.lessonsix;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {


    public static void main(String[] args) {
        try {
           String poem =  new String(Files.readAllBytes(Paths.get("poem.txt")));
           String poem2 =  new String(Files.readAllBytes(Paths.get("poem2.txt")));

           String poem3 = poem + poem2;
            Path path = Paths.get("poem3.txt");
            Files.write(path, poem3.getBytes(), StandardOpenOption.APPEND);

        } catch (IOException e){
            System.out.println("file not found");
        }



    }
}
