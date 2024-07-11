package com.library.controller;


import com.library.Service.BookService;
import com.library.dto.BookDTO;
import com.library.dto.SearchBook;
import com.library.printResult.BookView;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

public class BookController {

    private final BookView bookView;
    private final BookService bookService;

    public BookController() {
        bookView = new BookView();
        bookService = new BookService();
    }

    public void bookSelect() {

        List<BookDTO> book = bookService.bookSelect();

        if (book != null) {
            bookView.printSuccessMessage("selectList");
        } else {
            bookView.printErrorMessage("selectList");
        }
    }

    public void bookInsert(BookDTO bookDTO) {

        String bookCode = bookDTO.getCode();
        String bookName = bookDTO.getName();
        String bookCategory = bookDTO.getCategory();
        String author = bookDTO.getAuthor();

        BookDTO book = new BookDTO();
        book.setCode(bookCode);
        book.setName(bookName);
        book.setCategory(bookCategory);
        book.setAuthor(author);

        if (bookService.bookInsert(book)) {
            bookView.printSuccessMessage("insert");
        } else {
            bookView.printErrorMessage("insert");
        }
    }

    public void bookDelete(Map<String,String> parameter) {
        String bookCode = parameter.get("code");
        if (bookService.bookDelete(bookCode)) {
            bookView.printSuccessMessage("delete");
        } else {
            bookView.printErrorMessage("delete");
        }

    }

    public void bookUpdate(BookDTO bookDTO) {

        String bookCode = bookDTO.getCode();
        String bookName = bookDTO.getName();
        String bookCategory = bookDTO.getCategory();
        String author = bookDTO.getAuthor();

        BookDTO book = new BookDTO();
        book.setCode(bookCode);
        book.setName(bookName);
        book.setCategory(bookCategory);
        book.setAuthor(author);

        if (bookService.bookUpdate(book)) {
            bookView.printSuccessMessage("update");
        } else {
            bookView.printErrorMessage("update");
        }
    }

}
