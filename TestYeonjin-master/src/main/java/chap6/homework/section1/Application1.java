package chap6.homework.section1;

public class Application1 {
    public static void main(String[] args) {

        String id = "userd1";
        String password = "pass1";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[]{"축구", "볼링", "테니스"};

        for(int i=0; i <hobby.length; i++){
            System.out.print(hobby[i]+" ");
        }



        Member member = new Member();
        System.out.println(member.id);
        System.out.println(member.pwd);

        for(int i =0; i < member.hobby.length; i++){
            System.out.println(member.hobby[i]);
        }
        System.out.println();

    }

}
