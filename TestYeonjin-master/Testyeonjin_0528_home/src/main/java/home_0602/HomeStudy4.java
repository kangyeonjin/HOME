package home_0602;

import javax.swing.plaf.PanelUI;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class HomeStudy4 {

    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE

    };

    public void home(){

//        System.out.println(CoffeeType.AMERICANO);
//        System.out.println(CoffeeType.ICE_AMERICANO);
//        System.out.println(CoffeeType.CAFE_LATTE);

        for(CoffeeType type : CoffeeType.values()){
            System.out.println(type);
        }

    }

}
