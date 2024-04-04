package org.experis.library;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean flagArraySize = false;
        int numberBooks = 0;
        Book[] books = new Book[0];

        // ripeto con il do while se non passa il try catch
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


        for (int i = 0; i < books.length;) {
            int pages = 0;
            System.out.print("Insert title: ");
            String title =  scan.nextLine();
            // Controllo per il parseint
            try {
                System.out.print("Insert number of pages: ");
                pages = Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.out.print("Insert author: ");
            String author = scan.nextLine();

            System.out.print("Insert editor: ");
            String editor = scan.nextLine();
            // Se non puo generare il libro non mi incrementa la mia i
            try {
                books[i] = new Book(title,pages,author,editor);
                i++;
            } catch (Exception e) {
                System.out.println("Error" + e.getMessage());
            }
        }

        scan.close();

        // Formattazione  compatta per generare un nuovo file e stampare la stringa con il getAllInfo
        try(FileWriter fileWriter = new FileWriter(new File("./resources/data.txt"))) {
            for(Book book : books){
                fileWriter.write(book.getAllInfo());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try(Scanner fileReader = new Scanner(new File("./resources/data.txt"))){
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
