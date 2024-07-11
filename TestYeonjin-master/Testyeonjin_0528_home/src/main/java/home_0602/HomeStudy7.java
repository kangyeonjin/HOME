package home_0602;

import java.sql.SQLOutput;

public class HomeStudy7 {
    public void switchHome() {

        int month = 8;  //month가 8로되어있으므로 8이 출력될것
        String monthString = "";
        switch (month) {
            case 1:
                monthString = "january";
                break;
            case 2:
                monthString = "february";
                break;
            case 8:
                monthString = "August";
                break;
            default:
                monthString = "Invalid month";
                break;

        }
        System.out.println(monthString);


    }
    public void whileHome(){

        int treeHit =0;
        while(treeHit <10){
            treeHit++;   //treeHit +=1;이랑 같음
            System.out.println(treeHit+"번 수행함");

            if(treeHit ==10){
                System.out.println("끝");
            }

        }

    }
    public void whileHome2(){
        //무한루프
        while (true){  //조건문자체가 true임,항상 참이됨
            System.out.println("계속 나온다~~!!");
            System.out.println("컨트롤 c!!!!");
        }

    }
    public void whileHome3(){

        int coffee = 10;
        int money = 300;

        while (money > 0 && coffee > 0){
            System.out.println("커피를 줍니다");
            coffee--;
            money -= 30;  //한잔에 30원차감
            System.out.println("남은커피는"+ coffee);
            System.out.println("남은 돈은"+money);
        }if(coffee == 0){
            System.out.println("커피가 없습니다");

        }

    }
    public void whileHome4(){

        int a = 0;
        while (a<10){
            a++;
            if(a%2 ==0){   //2로나누었을때 0인 짝수인 경우
                continue;  //조건문 맨처음으로 돌아감
            }
            System.out.println(a); //홀수만 출력됨
        }

    }

}
