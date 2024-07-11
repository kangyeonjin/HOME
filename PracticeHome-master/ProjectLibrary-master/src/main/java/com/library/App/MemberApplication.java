package com.library.App;

import com.library.Service.MemberService;
import com.library.controller.MemberController;
import com.library.dto.MemberDTO;
import com.library.dto.SearchMember;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MemberApplication {
    public static void main(String[] args) {

//        MemberService memberService = new MemberService();
        MemberController memberController = new MemberController();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("============ 핑크퐁 도서관 회원 관리 ===========");
            System.out.println("1. 전체 조회하기 ");
            System.out.println("2. 입력하기 ");
            System.out.println("3. 수정하기 ");
            System.out.println("4. 삭제하기 ");
            System.out.println("9. 검색하기 ");
            System.out.print("메뉴를 선택하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:  memberController.memberTest(); break;
                case 2:  memberController.insertMember(inputMember()); break;
                case 3:  memberController.updateMember(updateMember()); break;
                case 4:  memberController.deleteMember(deleteMember()); break;
                case 5:  searchMember(); break;
//                case 6:  memberController.searchBook(searchBook()); break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }while (true);
    }
    
    private static Map<String, String> inputMember() {

        Scanner sc = new Scanner(System.in);

        System.out.print("등록할 회원코드를 입력하세요 : ");
        String code = sc.nextLine();

        System.out.print("회원이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("회원 전화번호를 입력하세요 : ");
        String phone = sc.nextLine();

        System.out.print("회원 주민번호를 입력하세요 : ");
        String no = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("phone", phone);
        parameter.put("no", no);

        return parameter;
    }

    private static Map<String, String> updateMember() {

        Scanner sc = new Scanner(System.in);

        System.out.print("수정할 회원코드를 입력하세요 : ");
        String code = sc.nextLine();

        System.out.print("수정할 회원이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("수정할 회원 전화번호를 입력하세요 : ");
        String phone = sc.nextLine();

        System.out.print("수정할 회원 주민번호를 입력하세요 : ");
        String no = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name", name);
        parameter.put("phone", phone);
        parameter.put("no", no);

        return parameter;
    }

    private static Map<String, String> deleteMember() {

        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 회원코드를 입력하세요 :");
        String code = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("code", code);

        return parameter;
    }

    private static void searchMember() {
        MemberController memberController = new MemberController();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. 검색하기 ");
            System.out.println("2. 검색하기 ");
            System.out.println("3. 수정하기 ");
            System.out.print("메뉴를 선택하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:  memberController.searchMember(inputSearchMember()); break;
//                case 2:  memberController.insertMember(inputMember()); break;
//                case 3:  memberController.updateMember(updateMember()); break;
//                case 4:  memberController.deleteMember(deleteMember()); break;
//                case 5:  searchMember(); break;
//                case 6:  memberController.searchBook(searchBook()); break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }while (true);
        
    }

    private static SearchMember inputSearchMember() {

        Scanner sc = new Scanner(System.in);

        System.out.print("검색할 회원이름을 입력하세요 : ");
        String name = sc.nextLine();

        return new SearchMember("name", name);
    }


}

