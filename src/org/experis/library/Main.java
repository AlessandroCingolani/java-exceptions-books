package org.experis.library;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean flagArraySize = false;
        int numberBooks = 0;
        Book[] books = new Book[0];

        do {
            try {
                System.out.println("How many books you want to add?");
                numberBooks = Integer.parseInt(scan.nextLine());
                try {
                    books = new Book[numberBooks];
                    flagArraySize = true;
                } catch (NegativeArraySizeException e) {
                    System.out.println("The input can't be negative value");
                }
            } catch (NumberFormatException e) {
                System.out.println("The input is not a number");
            }
        }while (!flagArraySize);


        for (int i = 0; i < books.length; i++) {
            System.out.print("Insert title: ");
            String title = scan.nextLine();
            System.out.print("Insert number of pages: ");
            int pages = Integer.parseInt(scan.nextLine());
            System.out.print("Insert author: ");
            String author = scan.nextLine();
            System.out.print("Insert editor: ");
            String editor = scan.nextLine();

            books[i] = new Book(title,pages,author,editor);
        }

        System.out.println(Arrays.toString(books));


        scan.close();
    }
}
