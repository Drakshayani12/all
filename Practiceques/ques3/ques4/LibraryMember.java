package Practiceques.ques3.ques4;

public class LibraryMember {
    private String memberName;
    private int booksBorrowed;
    final protected int maxBooksAllowed;

    public LibraryMember(){
        this.maxBooksAllowed = 5;
    }
    public LibraryMember(String memberName,int maxBooksAllowed)
    {
        this.memberName = memberName;
        this.maxBooksAllowed = maxBooksAllowed;
    }
    public void displayMemberInfo(){
        System.out.println("Member Information: ");
        System.out.println("Member Name: "+memberName);
        System.out.println("Books Borrowed: "+booksBorrowed);

    }
    public void borrowBook(LibraryBook book)
    {
      if( maxBooksAllowed > booksBorrowed)
      {
        booksBorrowed++;
        book.borrowBook();
      }
    }
    public void returnBook(LibraryBook book)
    {
        book.returnBook();
        booksBorrowed--;
    }
}
