package home_0605_method;
//메서드를 빠져나갈때 return
public class Sample5 {
    void sayNick(String nick){
        if("바보".equals(nick)){
            return;
        }
        System.out.println(nick);
    }

}
