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
            String title = null;
            int pages = 0;
            String author = null;
            String editor = null;
            try {
                System.out.print("Insert title: ");
                title = scan.nextLine();

                System.out.print("Insert number of pages: ");
                pages = Integer.parseInt(scan.nextLine());

                System.out.print("Insert author: ");
                author = scan.nextLine();

                System.out.print("Insert editor: ");
                editor = scan.nextLine();
                books[i] = new Book(title,pages,author,editor);
            } catch (IllegalArgumentException e) {
                System.out.println("Error" + e.getMessage());
            }


        }

        for(Book book : books){
            System.out.println(book.getAllInfo());
        }


        scan.close();
    }
}
