package org.example;

import java.util.Scanner;

/**
 * Main class: receives a number input by keyboard and gives an
 * ouput of the number of 1s it would have if converted to binary
 * */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int edad = sc.nextInt();
        int numvelas = 0;
        String binario = Integer.toBinaryString(edad);

        for (int i = 0; i < binario.length(); i++) {
            if(binario.charAt(i)=='1'){
                numvelas++;
            }
        }
        System.out.println(numvelas);
    }
}