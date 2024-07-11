package com.library.controller;

import com.library.Service.BorrowService;
import com.library.dto.BorrowDTO;
import com.library.printResult.BorrowView;

import java.sql.Date;
import java.util.List;
import java.util.Map;


public class BorrowController {
    private final BorrowView borrowView;
    private final BorrowService borrowService;

    // 생성자 주입
    public BorrowController() {
        borrowView = new BorrowView();
        borrowService = new BorrowService();


    }

    // 전체조회
    public void selectAllBorrow() {
        List<BorrowDTO> borrowList = borrowService.selectAllBorrow();

        if (borrowList != null) {
            borrowView.printBorrowList(borrowList);
        } else {
            borrowView.printErrorMessage("selectList");
        }


    }

    // 북코드로 단건조회
    public void selectBorrowByCode(Map<String, String> parameter) {

        String borrowcode = parameter.get("borrowcode");

        BorrowDTO borrow = borrowService.selectBorrowByCode(borrowcode);

        if (borrow != null) {
            borrowView.printBorrow(borrow);

        } else {
            borrowView.printErrorMessage("selectOne");
        }

    }

    // 신규 대출 등록
    public void insertBorrow(BorrowDTO parameter) {


        String borrowCode = parameter.getBorrowCode();
        Date borrowDay = parameter.getBorrowDay();
        Date returnDay = parameter.getReturnDay();
        String bookCode = parameter.getBookCode();
        String memberCode = parameter.getMemberCode();

        BorrowDTO borrow = new BorrowDTO();
        borrow.setBorrowCode(borrowCode);
        borrow.setBorrowDay(borrowDay);
        borrow.setReturnDay(returnDay);
        borrow.setBookCode(bookCode);
        borrow.setMemberCode(memberCode);
        if (borrowService.insertBorrow(borrow)) {
            borrowView.printSuccessMessage("insert");

        } else {
            borrowView.printErrorMessage("insert");
        }

    }
    // 메뉴 수정

    public void moodifyBorrow(BorrowDTO parameter) {

        String borrowCode = parameter.getBorrowCode();
        String borrowDay = String.valueOf(parameter.getBorrowDay());
        String returnDay = String.valueOf(parameter.getReturnDay());
//        String bookCode = parameter.getBookCode();
//        String memberCode = parameter.getBookCode();

        BorrowDTO borrow = new BorrowDTO();
        borrow.setBorrowCode(borrowCode);
        borrow.setBorrowDay(Date.valueOf(borrowDay));
        borrow.setReturnDay(Date.valueOf(returnDay));
//        borrow.setBookCode(bookCode);
//        borrow.setMemberCode(memberCode);

        if (borrowService.modifyBorrow(borrow)) {
            borrowView.printSuccessMessage("update");
        } else {
            borrowView.printErrorMessage("update");
        }
    }

    // 대출 삭제
    public void deleteBorrow(Map<String, String> parameter) {
        String borrowCode = parameter.get("borrowcode");

        if (borrowService.deleteBorrow(borrowCode)) {
            borrowView.printSuccessMessage("delete");
        } else {
            borrowView.printErrorMessage("delete");
        }


    }
}

