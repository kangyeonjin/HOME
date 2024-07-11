package com.library.printResult;

import com.library.dto.BorrowDTO;

import java.util.List;

public class BorrowView {

    public void printBorrowList(List<BorrowDTO> borrowList) {

        for (BorrowDTO borrow : borrowList) {
            System.out.println(borrow);
        }
    }

    public void printBorrow(BorrowDTO borrow) {
        System.out.println(borrow);
    }
    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "insert" : successMessage = "신규 대출 등록을 성공했습니다."; break;
            case "update" : successMessage = "신규 대출 수정을 성공했습니다."; break;
            case "delete" : successMessage = "신규 대출 삭제를 성공했습니다."; break;
        }

        System.out.println(successMessage);
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = "";
        switch (errorCode) {
            case "selectList" : errorMessage = "대출 목록 조회를 실패했습니다."; break;
            case "selectOne" : errorMessage = "대출 조회를 실패했습니다.."; break;
            case "insert" : errorMessage = "신규 대출 등록을 실패헀습니다."; break;
            case "update" : errorMessage = "수정을 실패했습니다."; break;
            case "delete" : errorMessage = "삭제를 실패했습니다."; break;
        }
        System.out.println(errorMessage);
    }
}
