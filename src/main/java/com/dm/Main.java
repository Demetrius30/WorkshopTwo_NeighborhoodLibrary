package com.dm;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Array of Books
        Book[] book = new Book[5];
        book[0] = new Book(293940, 278-92-95055-02-5, "Who's the Man", false, "Jordan");
        book[1] = new Book(34566, 978-92-95055-02-5, "Diary of a wimpy kid", true, "Jane");
            book [2] = new Book(62747, 978-92-7283755-02-5, "Cage Bird", true, "Bob");
            book [3] = new Book(74839, 838-92-95055-02-5, "Goated", false, "Chris");
            book [4] = new Book(950403, 878-92-95055-02-5, "You the man", true, "Dj");
            book [5] = new Book(483939, 458-92-95055-02-5, "Brooo", false, "Carter");

            int totalNumberOfBooks = book.length;
            if (book.length < totalNumberOfBooks);{

        }





    }
}

class Book {
    // Properties
    private int id;
    private int isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    /// Constructor method
    public Book (int id, int isbn, String title, boolean isCheckedOut, String checkedOutTo){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;

    }


    /// Getters and Setters
        public int getId(){
        return this.id;
        }

        public void setId(){
        this.id = id;
        }

        public int getIsbn(){
        return this.isbn;
        }

        public void setIsbn(){
        this.isbn = isbn;
        }

        public String getTitle(){
        return this.title;
        }

        public void setTitle(){
        this.title = title;
        }

        public boolean getIsCheckedOut(){
        return this.isCheckedOut;
        }

        public void setIsCheckedOut(){
        this.isCheckedOut = isCheckedOut;
        }

        public String getCheckedOutTo(){
        return this.checkedOutTo;
        }

        public void setCheckedOutTo(){
        this.checkedOutTo = checkedOutTo;
        }





}