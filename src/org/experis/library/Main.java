package org.experis.library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many books you want to add?");
        int numberBooks = Integer.parseInt(scan.nextLine());


        scan.close();
    }
}
