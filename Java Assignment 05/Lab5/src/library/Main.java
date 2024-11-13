package library;

import library.books.FictionBook;
import library.utils.BookUtils;

public class Main {
    public static void main(String[] args) {
        FictionBook book = new FictionBook("Harry Potter", "JK Rowling", "Fiction");
        BookUtils.printBookDetails(book);
    }
}
