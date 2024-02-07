package com.example.book1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.book1.Service.BookService;
import com.example.book1.entity.Book;
@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAllBooks()
    {
        return bookService.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id)
    {
        Book book = bookService.getBookById(id);
        if (book.getId() == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            return new ResponseEntity<>(book,HttpStatus.OK);
        }
    }

    @PostMapping("/books")
    public ResponseEntity<Book> createBook(@RequestBody Book book)
    {
        if(book.getAuthor() == null || book.getTitle() == null)
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else {
            bookService.addBook(book);
            return new ResponseEntity<Book>(book,HttpStatus.OK);
        }
    }

    @PutMapping("/books/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id,@RequestBody Book book)
    {
        if(book.getAuthor() == null || book.getTitle() == null)
        {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }else {
            try {
                return new ResponseEntity<>(bookService.updateBook(id, book),HttpStatus.OK);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
            }
        }
    }

    @DeleteMapping("/books/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable Long id) 
    {
        try {
            bookService.deleteBook(id);
            return new ResponseEntity<>("Book deleted.",HttpStatus.OK);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            return new ResponseEntity<>("Not Found",HttpStatus.NOT_FOUND);
        }
    }

}
