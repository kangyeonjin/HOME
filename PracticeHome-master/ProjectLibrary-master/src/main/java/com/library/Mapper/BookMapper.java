package com.library.Mapper;

import com.library.dto.BookDTO;
import com.library.dto.SearchBook;

import java.util.List;
import java.util.Map;

public interface BookMapper {

    List<BookDTO> bookSelect();

    int bookInsert(BookDTO book);

    int bookUpdate(BookDTO book);

    int bookDelete(String parameter);

    List<BookDTO> searchBook(SearchBook searchBook);
}
