package org.experis.library;

public class Book {
    // attibutes
    private String title;
    private int numberPage;
    private String author;
    private String editor;

    // constructors

    public Book(String title, int numberPage, String author, String editor) {
        this.title = title;
        this.numberPage = numberPage;
        this.author = author;
        this.editor = editor;
    }

    // getter and setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }


    // methods
}
