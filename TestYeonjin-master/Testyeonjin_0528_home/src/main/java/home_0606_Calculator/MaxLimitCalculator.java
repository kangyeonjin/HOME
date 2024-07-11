package home_0606_Calculator;
//100보다 작아야햠
public class MaxLimitCalculator extends Calculator{

    void add(int val){
        this.value += 100;

        if(this.value < 100){
            this.value =100;
        }
    }

}
