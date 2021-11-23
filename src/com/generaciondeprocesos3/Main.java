package com.generaciondeprocesos3;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("¿Qué ruta tiene el fichero?");
        String direccionFichero = sc.nextLine();


        ProcessBuilder processBuilder = new ProcessBuilder("powershell.exe", "/c", "cat", "C:\\Users\\Kevin\\Desktop\\data.txt", "/c", " || wc");

        try {
            processBuilder.start();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
