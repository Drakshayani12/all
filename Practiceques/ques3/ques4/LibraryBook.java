package Practiceques.ques3.ques4;

public class LibraryBook {
    private String bookTitle;
    private String author;
    private int numPages;
    private boolean borrowed;

    public LibraryBook (String bookTitle,String author,int numPages)
    {
        this.author = author;
        this.bookTitle = bookTitle;
        this.numPages = numPages;
        this.borrowed = false;
    }
    public LibraryBook(){

    }
    public void displayBookInfo(){
        System.out.println("Book Information:");
        System.out.println("Book Title:"+bookTitle);
        System.out.println("Author name:"+author);
        System.out.println("No of pages:"+numPages);
        System.out.print("Borrowed: "); 
        if(borrowed)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }

    public void borrowBook(){
        this.borrowed = true;
    }
    public void returnBook(){
        this.borrowed = false;
    }

}
