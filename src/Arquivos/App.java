package Arquivos;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App {
    public static void main(String[] args) {
        String linha = "Texto a ser inserido";

        Path p = Paths.get("dados.txt");
        try {
            Files.write(p, linha.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
