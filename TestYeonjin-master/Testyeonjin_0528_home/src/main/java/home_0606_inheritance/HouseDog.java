package home_0606_inheritance;

public class HouseDog extends Dog{
    HouseDog(String name){
        this.setName(name);
    }
    HouseDog(int type){
        if(type ==1){
            this.setName("yorkshire");
        } else if (type ==2) {
            this.setName("bulldog");
        }
    }

    void sleep(){
        System.out.println(this.name+"in house"); //오버라이딩
    }
    void sleep(int hour){
        System.out.println(this.name+hour); //오버로딩,입력값이다르면 동일이름 사용가능
    }


}
