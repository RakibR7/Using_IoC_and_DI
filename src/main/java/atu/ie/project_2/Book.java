package atu.ie.project_2;

public class Book {

    private String title;
    private String author;

    private String isbn;
    private int publishedYear;

    public Book(String title, String author, String isbn, int publishedYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publishedYear = publishedYear;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getpublishedYear() {
        return publishedYear;
    }

    public void setpublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}
