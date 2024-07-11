package home_0608_problem;

import java.util.ArrayList;

public class Sample3 {
    public static void main(String[] args) throws InterruptedException {
        
        long start = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>(); //스레드저장할 리스트 생성
        for(int i=1; i<5; i++){
            HeavyWork w = new HeavyWork("w" + i);
//            threads.add(t);  //스레드 저장
//            t.start();
            w.work();
        }
        for(Thread t : threads){
            t.join(); //저장한 스레드 종료할떄까지 대기
        }

        long end = System.currentTimeMillis();
//        System.out.println("elapsed time : %s ms\n"+ end -start );
    }
    
}
