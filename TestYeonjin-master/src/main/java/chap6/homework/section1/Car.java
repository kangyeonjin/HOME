package chap6.homework.section1;

public class Car {
//    자동차 클래스
//     - 속성 : 현재시속, 시동상태
//     - 행위 : 시동을걸어라, 앞으로 가라, 멈춰라, 시동을 꺼라

    private  boolean isOn;
    private int speed;

    //이미 시동 걸려잇음
    public void startUp(){

        if(isOn){
            System.out.println("이미 시동걸림");
        } else{
            this.isOn = true;
            System.out.println("시동검 출발준비됨");
        }
    }
    //시동걸려있으면 시속 10키로 증가하며 앞으로감
    public void go(){
        if(isOn){
            System.out.println("차가 앞으로감");
            this.speed += 10;
            System.out.println("현재시속"+this.speed+"km임");
        }else{
            System.out.println("시동꺼짐");
        }
    }
    //시동이 걸려있고 달리는 상태일떄만 멈춤
    //달리는 중인경우 브레이크밟으면 시속은 0으로 떨어짐
    public void stop(){
        if(isOn){
            if(this.speed >0) {
                this.speed = 0;
                System.out.println("브래이크밞음 멈춤");
            }else{
                System.out.println("이미 멈춰있음");
            }
        }else{
            System.out.println("시동이 꺼져있음");
        }
    }
    //차가 달리는 중이면 시동끌수없음, 시동꺼져있으면 끌수없음
    public void turnOFF(){
        if (isOn) {
            if (speed > 0) {
                System.out.println("달리는 상태에서는 시동을 끌수없음");
            } else {
                this.isOn = false;
                System.out.println("시동끕니다 다시 운행하려면 시동켜주세요");
            }
        }else{
            System.out.println("이미시동이 꺼져있음");
        }
    }


}
