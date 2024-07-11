package chap5.section1;

import java.util.Scanner;

public class add {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("이름 : ");
        String name = sc.next();
        System.out.println(name + "님 어서오세요!");

        System.out.println("주소 : ");
        sc.nextLine();
        String addr = sc.nextLine();
        System.out.println("사는곳 : "+addr);

    }
}
