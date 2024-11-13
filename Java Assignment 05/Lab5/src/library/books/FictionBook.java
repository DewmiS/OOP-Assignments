package library.books;

public class FictionBook {
    String title;
    String author;
    String genre;
    public FictionBook(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public void displayInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Genre: " + this.genre);
    }

}
