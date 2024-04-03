package org.experis.library;

public class Book {
    // attibutes
    private String title;
    private int numberPage;
    private String author;
    private String editor;

    // constructors

    public Book(String title, int numberPage, String author, String editor) throws IllegalArgumentException{
        if(title == null || title.isEmpty() ){
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if(author == null || author.isEmpty()){
            throw new IllegalArgumentException("Author cannot be null or empty");
        }
        if(editor == null || editor.isEmpty()){
            throw new IllegalArgumentException("Editor cannot be null or empty");
        }
        if(numberPage <= 0 || numberPage > 7000){
            throw new IllegalArgumentException("Number of pages should be between 1 and 7000");
        }
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
        if(title == null || title.isEmpty()){
            throw new IllegalArgumentException("Title cannot be void or empty");
        }
        this.title = title;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        if(numberPage <= 0 || numberPage > 7000){
            throw new IllegalArgumentException("Number of pages should be between 1 and 7000");
        }
        this.numberPage = numberPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if(author == null || author.isEmpty()){
            throw new IllegalArgumentException("Author cannot be void or empty");
        }
        this.author = author;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        if(editor == null || editor.isEmpty()){
            throw new IllegalArgumentException("Editor cannot be void or empty");
        }
        this.editor = editor;
    }


    // methods
    public String getAllInfo() {
        return String.format("Title: %s \nPages: %d \nAuthor: %s\nEditor: %s\n", title, numberPage,author,editor);
    }
}
