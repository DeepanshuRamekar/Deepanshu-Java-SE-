package com.company;

class Library {
    String [] books;
    int no_of_books;

    public Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }
    public void addBook(String book){
        this.books[no_of_books]= book;
        no_of_books++;
    }
    public void showAvailablebooks(){
        System.out.println("Available books are:");
        for (String element: this.books){
            if (element == null){
                continue;
            }
            System.out.println(element);
        }
    }
    public void issueBook(String book){
        for (int i=0;i<this.books.length;i++){
            if (this.books[i] == book){
                System.out.println(" the Book Has been Issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println(" this Book Does Not exist");
    }
    public void returnBook(String book){
        addBook(book);
    }
}
public class CHW_51_CH10_Exercise4 {
    public static void main(String[] args) {
        // You have to implement a library using Java Class "Library"
        // Methods: addBook, issueBook, returnBook, showAvailableBooks
        // Properties: Array to store the available books,
        // Array to store the issued books
        Library centralLibrary = new Library();
        centralLibrary.addBook("Focus What matters");
        centralLibrary.addBook("Deepanshu Ramekar");
        centralLibrary.addBook("Dicipline");
        centralLibrary.addBook("hello World");
        centralLibrary.showAvailablebooks();
        centralLibrary.issueBook("Dicipline");
        centralLibrary.showAvailablebooks();
        centralLibrary.returnBook("Dicipline");
        centralLibrary.showAvailablebooks();
    }
}
