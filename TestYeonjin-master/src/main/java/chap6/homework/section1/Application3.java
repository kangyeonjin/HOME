package chap6.homework.section1;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CarRacer carRacer = new CarRacer();

        while (true){
            System.out.println("1.시동걸기");
            System.out.println("2.전진");
            System.out.println("3.정지");
            System.out.println("4.시동끄기");
            System.out.println("5.종료");
            System.out.print("선택 :");

            int num = sc.nextInt();

            switch (num){
                case 1 :
                    carRacer.startUp();
                    break;
                case 2 :
                    carRacer.stepAccelerator();
                    break;
                case 3 :
                    carRacer.setpBreak();
                    break;
                case 4 :
                    carRacer.turnOff();
                    break;
                case 5 :
                    System.out.println("프로그램종료");
                    break;
                default :
                    System.out.println("wrong");
                    break;


            }
            if(num == 5){
                break;
            }

        }


    }

}
