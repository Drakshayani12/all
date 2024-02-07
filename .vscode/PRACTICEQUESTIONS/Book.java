package PRACTICEQUESTIONS;

import java.util.Scanner;

class LibraryBook
{
    private String bookTitle;
    private String author;
    private int numPages;
    private boolean borrowed;
   
    public LibraryBook(String bookTitle, String author,int numPages,boolean borrowed){
        this.bookTitle = bookTitle;
        this.author = author;
        this.numPages = numPages;
        this.borrowed = borrowed;
    }

    public void BookInfo(){
        System.out.println(bookTitle);
        System.out.println(author);
        System.out.println(numPages);
        System.out.println(borrowed);
    }
    public String getBookTitle(){
        return bookTitle;
    }

    public String getAuthor(){
        return author;
    }
    public int getNumPages(){
        return numPages;
    }
    public boolean getBorrowed(){
        return borrowed;
    }
    
 public void borrowBook() {
    borrowed = true;
    System.out.println("Book borrowed successfully.");
 }
 public void returnBook(){
    borrowed = false;
    System.out.println("Book returned successfully");
 }
}
class LibraryMember {
    private String memberName;
    private int booksBorrowed;
    private int maxBooksAllowed;

    public int getBookBorrowed()
    {
        return booksBorrowed;
    }
    public int getMaxBooksAllowed(){
        return maxBooksAllowed;
    }
    public void displayMemberInfo(){
        System.out.println(memberName);
    }
    public void borrowBook(LibraryBook book){
        if(book < maxBooksAllowed && book.isBorrowed())
        {book.borrowBook();();
            booksBorrowed++;
            System.out.println("Book borrowed successfully.");
        }
        public void  returnBook(LibraryBook book){
            if(book.isBorrowed())
            {
                book.returnBook();
                booksBorrowed--;
            }
        }
    }
    public isBorrowed()
    {
        return borrowed;
    }
}
public class Book {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LibraryBook l = new LibraryBook();
        LibraryMember m = new LibraryMember();

    }
}
