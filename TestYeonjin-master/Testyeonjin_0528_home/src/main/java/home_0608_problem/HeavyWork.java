package home_0608_problem;

public class HeavyWork implements Runnable {
    String name;

    HeavyWork(String name){
        this.name = name;
    }

    @Override
    public void run() {
        work();
    }

    public void work(){

        for(int i=0; i<5; i++){
            try{
                Thread.sleep(100);
            }catch (Exception e){

            }
        }
//        System.out.println("\n", this.name);

    }


}
