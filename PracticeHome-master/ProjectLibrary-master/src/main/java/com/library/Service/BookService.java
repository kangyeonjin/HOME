package com.library.Service;

import com.library.Mapper.BookMapper;
import com.library.dto.BookDTO;
import com.library.dto.SearchBook;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.library.common.BookTemplate.getBookSqlSession;

public class BookService {

    private BookMapper mapper;


    public List<BookDTO> bookSelect(){
        SqlSession sqlSession = getBookSqlSession();

        mapper = sqlSession.getMapper(BookMapper.class);

        List<BookDTO> bookList = mapper.bookSelect();

        for (BookDTO menu : bookList) {
            System.out.println(menu);
        }

        sqlSession.close();

        return bookList;
    }

    public boolean bookInsert(BookDTO book) {
        SqlSession sqlSession = getBookSqlSession();

        mapper = sqlSession.getMapper(BookMapper.class);

        int result = mapper.bookInsert(book);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean bookDelete(String parameter) {
        SqlSession sqlSession = getBookSqlSession();

        mapper = sqlSession.getMapper(BookMapper.class);

        int result = mapper.bookDelete(parameter);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean bookUpdate(BookDTO book) {
        SqlSession sqlSession = getBookSqlSession();

        mapper = sqlSession.getMapper(BookMapper.class);

        int result = mapper.bookUpdate(book);

        if(result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }

        sqlSession.close();

        return result > 0 ? true : false;
    }

    public List<BookDTO> bookSearch(SearchBook searchBook) {
        SqlSession sqlSession = getBookSqlSession();
        mapper = sqlSession.getMapper(BookMapper.class);

        List<BookDTO> bookList = mapper.searchBook(searchBook);

        if (bookList != null && bookList.size() > 0) {
            for (BookDTO book : bookList) {
                System.out.println(book);
            }
        } else {
            System.out.println("검색 결과가 존재하지 않습니다.");
        }

        sqlSession.close();
        
        return bookList;
    }
}
