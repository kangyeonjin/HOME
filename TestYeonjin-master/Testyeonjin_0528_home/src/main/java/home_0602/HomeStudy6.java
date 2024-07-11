package home_0602;

import java.util.ArrayList;

public class HomeStudy6 {

    public void ifHome(){

        //만약 3000원 이상 돈이 있으면 택시타고
        //아니면 걸어가라

        int m = 2000; //갖고 있는돈

        if(3000 <= m){
            System.out.println("택시타기");
        }else{
            System.out.println("걸어가기");
        }

    }
    public void ifHome2(){

        //주머니에 돈이 있으면 택시타고
        //없으면 걸어가라

        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("cellphone");
        pocket.add("money");

        if(pocket.contains("money")){
            System.out.println("택시");
        }else{
            System.out.println("걸어가기");
        }

    }
    public void ifHome3(){

        //지갑에 돈이 있으면 택시타고
        //지갑에 돈없지만 카드있으면 택시타고
        //돈도없고 카드도 없으면 걸어가라

        boolean hasCard = true;
        ArrayList<String> pocket = new ArrayList<String>();
        pocket.add("paper");
        pocket.add("cellphone");

        if(pocket.contains("money")){
            System.out.println("택시");
        }else if(hasCard){
            System.out.println("택시");
        }else {
            System.out.println("걸어가라");
        }





    }


}
