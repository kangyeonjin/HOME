package com.library.printResult;

public class BookView {

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "selectList":
                errorMessage = "도서 목록 조회를 실패했습니다.";
                break;
            case "selectOne":
                errorMessage = "도서 조회를 실패했습니다.";
                break;
            case "insert":
                errorMessage = "신규 도서 등록을 실패했습니다.";
                break;
            case "update":
                errorMessage = "도서 수정을 실패했습니다.";
                break;
            case "delete":
                errorMessage = "도서 삭제를 실패했습니다.";
                break;
        }
        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String sueccessCode) {
        String sueccessMessage = "";
        switch (sueccessCode) {
            case "selectList":
                sueccessMessage = "도서 목록 조회를 성공했습니다.";
            case "insert":
                sueccessMessage = "신규 도서 등록을 성공했습니다.";
                break;
            case "update":
                sueccessMessage = "도서 수정을 성공했습니다.";
                break;
            case "delete":
                sueccessMessage = "도서 삭제를 성공했습니다.";
                break;
        }
        System.out.println(sueccessMessage);
    }

}
