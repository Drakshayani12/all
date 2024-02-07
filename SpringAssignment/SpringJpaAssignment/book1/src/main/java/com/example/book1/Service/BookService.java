package com.example.book1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.book1.entity.Book;
import com.example.book1.repo.BookRepository;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book addBook(Book book)
    {
        return bookRepository.save(book);
    }

    public Book updateBook(Long id,Book updatedBook) throws Exception
    {
        Book b = bookRepository.findById(id).orElse(new Book());
        if(b.getId() == null)
            throw new Exception();
        return bookRepository.findById(id).map(book -> {
            book.setTitle(updatedBook.getTitle());
            book.setAuthor(updatedBook.getAuthor());
            book.setIsbn(updatedBook.getIsbn());
            book.setQuantity(updatedBook.getQuantity());
            return bookRepository.save(book);
        }).get();
    }

    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }

    public Book getBookById(Long id)
    {
        return bookRepository.findById(id).orElse(new Book());
    }

    public void deleteBook(Long id) throws Exception
    {
        Book b = getBookById(id);
        if(b.getId() == null){
            throw new Exception();
        }
        bookRepository.deleteById(id);
    }

    
}
