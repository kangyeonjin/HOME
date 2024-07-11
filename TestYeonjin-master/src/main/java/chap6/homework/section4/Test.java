package chap6.homework.section4;

public class Test {

    private String id;
    private String pwd;
    private String name;
    private java.util.Date enrollDate;

    public void User() {

        System.out.println("User 클래스의 기본 생성자 호출함...");
    }

    public String getInfo() {
        return "User [id=" + this.id + ", pwd=" + this.pwd + ", " +
                "name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
    }

}
