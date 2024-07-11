package com.library.App;


import com.library.controller.BorrowController;
import com.library.dto.BorrowDTO;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BorrowApplication {
    public static void main(String[] args) {
        BorrowController borrowController = new BorrowController();

        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("====★==== 핑크퐁퐁퐁 Library ====★====");
            System.out.println("1. 대출 정보조회");
            System.out.println("2. 신규 대출 등록");
            System.out.println("3. 대출 단일 조회 ");
            System.out.println("4. 대출 삭제");
            System.out.println("5. 대출 수정");
            System.out.println("6. 프로그램 종료");
            System.out.println("====★==== 핑크퐁퐁퐁 Library ====★====");
            System.out.print("메뉴번호를 입력하세요 : ");
            int no = sc.nextInt();
            switch (no) {
                case 1:
                    borrowController.selectAllBorrow();
                    break;
                case 2:
                    borrowController.insertBorrow(inputBorrowInsert());
                    break;
//                case 3:
//                    borrowController.selectBorrowByCode(inputBorrowCode());
//                    break;
                case 4:
                    borrowController.deleteBorrow(inputBorrowCodeDelete());
                    break;
                case 5:
                    borrowController.moodifyBorrow(inputBorrowUpdate());
                    break;
                case 6:
                    System.out.println("==== 핑크퐁 Library 를 종료합니다. ====");
                    return;
                default:
                    System.out.println("==== '핑크퐁은 그대에게 실망했다.' ====");
            }
        } while (true);

    }

    private static BorrowDTO inputBorrowUpdate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("변경할 대출 코드를 입력하세요 : ");
        String borrowCode = sc.nextLine();
        System.out.print("변경할 대출날을 입력하세요 : ");
        Date borrowDay = Date.valueOf(sc.nextLine());
        System.out.print("변경할 반납일을 입력하세요 : ");
        Date returnDay = Date.valueOf(sc.nextLine());
//        System.out.print("변경할 북코드를 입력하세요 : ");
//        String bookCode = sc.nextLine();
//        System.out.print("변경할 멤버 코드를 입력하세요 : ");
//        String memberCode = sc.nextLine();

        BorrowDTO borrow = new BorrowDTO();
        borrow.setBorrowCode(borrowCode);
        borrow.setBorrowDay(borrowDay);
        borrow.setReturnDay(returnDay);
//        borrow.setBookCode(bookCode);
//        borrow.setMemberCode(memberCode);

        return  borrow;
    }

    private static Map<String, String> inputBorrowCodeDelete() {
        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 도서코드을 적어주세요. : ");
        String borrowcode = sc.nextLine();



        Map<String, String> parameter = new HashMap<>();
        parameter.put("borrowcode", borrowcode);

        return parameter;
    }

    private static BorrowDTO inputBorrowInsert() {
        Scanner sc = new Scanner(System.in);
        System.out.print("등록할 대출코드를 입력하세요 : ");
        String borrowCode = sc.nextLine();
        System.out.print("등록할 대출날을 입력하세요 : ");
        Date borrowDay = Date.valueOf(sc.nextLine());
        System.out.print("반납일을 입력하세요 : ");
        Date returnDay = Date.valueOf(sc.nextLine());
        System.out.print("북코드를 입력하세요 : ");
        String bookCode = sc.nextLine();
        System.out.print("멤버코드를 입력하세요 : ");
        String memberCode = sc.nextLine();


        BorrowDTO borrow = new BorrowDTO();
        borrow.setBorrowCode(borrowCode);
        borrow.setBorrowDay(borrowDay);
        borrow.setReturnDay(returnDay);
        borrow.setBookCode(bookCode);
        borrow.setMemberCode(memberCode);

        return borrow;
    }

}
