package com.library.Mapper;


import com.library.dto.BorrowDTO;

import java.util.List;

public interface BorrowMapper {

    List<BorrowDTO> selectAllBorrow();

    int insertBorrow(BorrowDTO borrow);

    int deleteBorrow(String parameter);

    int modifyBorrow(BorrowDTO borrow);

    BorrowDTO selectBorrowByCode(String borrowcode);
}
