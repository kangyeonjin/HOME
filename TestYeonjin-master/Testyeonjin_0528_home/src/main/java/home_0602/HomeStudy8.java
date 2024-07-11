package home_0602;

public class HomeStudy8 {

    public void forHome() {

        String[] numbers = {"one", "two", "three"};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

    public void forHome2() {

        //5명의 학생이 시험을보았음
        //시험점수가 60점이 넘으면 합격
        //그렇지 않으면 불합격

        //시험성적은 90,25,67,45,80

        int[] marks = {90, 25, 67, 45, 80};
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 60) {
                System.out.println((i + 1) + "번 학생 합격");
            } else {
                System.out.println((i + 1) + "번 학생 불합격");
            }
        }

        //합격자만 메세지 보내기
        int[] marks2 = {90, 25, 67, 45, 80};
        for (int i = 0; i < marks2.length; i++) {
            if (marks[i] < 60) {
                    continue;
            }
            System.out.println((i+1)+"합격입니다");
        }


    }

    //구구단 출력하기
    public void forHome3(){

        for(int i=2; i <10; i++){  //2~9까지 i에 차례로 대입
            for(int j=1; j<10; j++){ //1~9까지 j에 대입
                System.out.print(i*j+" ");
            }
            System.out.println(""); //줄바꿈
        }


    }
}
