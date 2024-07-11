package com.library.Service;

import com.library.Mapper.BorrowMapper;

import com.library.dto.BorrowDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.library.common.BorrowTemplate.getSqlSession;



public class BorrowService {
    private BorrowMapper borrowMapper;

    public List<BorrowDTO> selectAllBorrow() {
        SqlSession sqlSession = getSqlSession();
        borrowMapper = sqlSession.getMapper(BorrowMapper.class);

        List<BorrowDTO> borrowList = borrowMapper.selectAllBorrow();


        sqlSession.close();

        return borrowList;
    }



    public boolean insertBorrow(BorrowDTO borrow) {
        SqlSession sqlSession = getSqlSession();

        borrowMapper = sqlSession.getMapper(BorrowMapper.class);

        int result = borrowMapper.insertBorrow(borrow);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean modifyBorrow(BorrowDTO borrow) {
        SqlSession sqlSession = getSqlSession();

        borrowMapper = sqlSession.getMapper(BorrowMapper.class);

        int result = borrowMapper.modifyBorrow(borrow);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }

    public boolean deleteBorrow(String parameter) {
        SqlSession sqlSession = getSqlSession();

        borrowMapper = sqlSession.getMapper(BorrowMapper.class);

        int result = borrowMapper.deleteBorrow(parameter);

        if (result > 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false;
    }


    public BorrowDTO selectBorrowByCode(String borrowcode) {

        SqlSession sqlSession = getSqlSession();

        borrowMapper = sqlSession.getMapper(BorrowMapper.class);

        BorrowDTO borrow = borrowMapper.selectBorrowByCode(borrowcode);

        sqlSession.close();

        return borrow;
    }
}
