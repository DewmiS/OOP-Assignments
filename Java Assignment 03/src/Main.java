public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Seena Maragatham", "Sujatha Thilaka", "9789553023975");
        Book book2 = new Book("Nuramakadya Bauthika Nuladanayakshanamaala", "Seynamasasekaka", "9789553548721");
        Book book3 = new Book("Island of a Thousand Mirrors", "Nayomi Munaweera", "9781616953623");
        // Create an instance of the Library class to manage the library system
        Library library = new Library();
        // Add the created books to the library's collection
        library.addLibraryItem(book1);
        library.addLibraryItem(book2);
        library.addLibraryItem(book3);
        // Display information about the library
        library.displayLibraryInfo();
        // List all available library items
        library.listAvailableItems();
        // Check out a book
        library.checkoutLibraryItems("Island of a Thousand Mirrors");
        // List available items in the library again
        library.listAvailableItems();
    }
}
