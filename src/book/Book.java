/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author mustafa
 */
public class Book {

    private String title;
    private String author;
    private String publication;
    private String isbn;

    public Book(String title, String author, String publication, String isbn) {
        this.title = title;
        this.author = author;
        this.publication = publication;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void printBookInfo(){
        System.out.printf("Заглавие: %s автор: %s издателство: %s ISBN: %s\n",title,author,publication,isbn);
    }
    
}
