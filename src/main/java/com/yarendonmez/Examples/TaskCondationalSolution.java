package com.yarendonmez.Examples;

import java.io.*;

public class TaskCondationalSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim()); // Kullanıcıdan sayı al
        bufferedReader.close();

        // Eğer N tek sayıysa
        if (N % 2 != 0) {
            System.out.println("Weird");
        }
        // Eğer N çift sayıysa ve 2 ile 5 arasında ise
        else if (N >= 2 && N <= 5) {
            System.out.println("Not Weird");
        }
        // Eğer N çift sayıysa ve 6 ile 20 arasında ise
        else if (N >= 6 && N <= 20) {
            System.out.println("Weird");
        }
        // Eğer N çift sayıysa ve 20'den büyükse
        else if (N > 20) {
            System.out.println("Not Weird");
        }
    }
}
