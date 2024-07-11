package com.library.App;

import com.library.Service.BookService;
import com.library.controller.BookController;
import com.library.dto.BookDTO;
import com.library.dto.SearchBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BookApplication {
    public static void main(String[] args) {

        BookController bookController = new BookController();
        Scanner sc = new Scanner(System.in);
        BookService bookService = new BookService();

        do {
            System.out.println("============ 핑크퐁 도서관 도서 관리 ===========");
            System.out.println("1. 전체 조회하기 ");
            System.out.println("2. 입력하기 ");
            System.out.println("3. 수정하기 ");
            System.out.println("4. 삭제하기 ");
            System.out.println("9. 검색하기 ");
            System.out.println("============ 핑크퐁 도서관 도서 관리 ===========");
            System.out.print("메뉴를 선택하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    bookController.bookSelect();
                    break;
                case 2:
                    bookController.bookInsert(inputBook());
                    break;
                case 3:
                    bookController.bookUpdate(inputUpdate());
                    break;
                case 4:
                    bookController.bookDelete(inputDelete());
                    break;
                case 5:
                    bookService.bookSearch(inputSearch());
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        } while (true);
    }

    private static SearchBook inputSearch() {

        Scanner sc = new Scanner(System.in);
        System.out.println("검색 기준을 입력해주세요(도서이름.도서카테고리)");
        String condition = sc.nextLine();
        System.out.println("검색어를 입력하세요 :");
        String value = sc.nextLine();

        return new SearchBook(condition, value);

    }

    private static BookDTO inputBook() {

        Scanner sc = new Scanner(System.in);

        System.out.print("등록할 도서코드를 입력하세요 : ");
        String code = sc.nextLine();

        System.out.print("도서이름을 입력하세요 : ");
        String name = sc.next();

        System.out.print("도서카테고리를 입력하세요 : ");
        String category = sc.next();
        sc.nextLine();
        System.out.print("도서 저자를 입력하세요 : ");
        String author = sc.nextLine();

        BookDTO book = new BookDTO();
        book.setCode(code);
        book.setName(name);
        book.setCategory(category);
        book.setAuthor(author);

        return book;
    }

    private static BookDTO inputUpdate() {

        Scanner sc = new Scanner(System.in);

        System.out.print("수정할 도서코드를 입력하세요 : ");
        String code = sc.nextLine();

        System.out.print(code +"수정할 도서이름을 입력하세요 : ");
        String name = sc.nextLine();

        System.out.print("수정할 도서카테고리를 입력하세요 : ");
        String category = sc.nextLine();

        System.out.print("수정할 도서 저자를 입력하세요 : ");
        String author = sc.nextLine();

        BookDTO book = new BookDTO();
        book.setCode(code);
        book.setName(name);
        book.setCategory(category);
        book.setAuthor(author);

        return book;
    }

    private static Map<String, String> inputDelete() {

        Scanner sc = new Scanner(System.in);
        System.out.println("삭제할 도서코드를 입력하세요 :");
        String borrowcode = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("borrowcode", borrowcode);
        return parameter;
    }

}