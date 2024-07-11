package chap6.homework.section1;

public class CarRacer {
//    카레이서 클래스
//     - 속성 : 자동차
//     - 행위 : 시동을걸어라, 엑셀레이터를 밟아라, 브레이크를 밟아라, 시동을 꺼라

    private final Car car = new Car();

    public void startUp(){
        car.startUp();
    }
    public void stepAccelerator(){
        car.go();
    }
    public void setpBreak(){
        car.stop();
    }
    public void turnOff(){
        car.turnOFF();
    }


}
