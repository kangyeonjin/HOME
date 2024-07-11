package home_0528;

public class Remind  {
// - memberNo : int
// - memberName : String
// - height : int
// - weight : int
// - birth : LocalDate

    private int memberNo;
    private String memberName;
    private int height;
    private int weight;

    public Remind(int memberNo, String memberName, int height, int weight) {
        this.memberNo = memberNo;
        this.memberName = memberName;
        this.height = height;
        this.weight = weight;
    }

    public int getMemberNo() {
        return memberNo;
    }

    public void setMemberNo(int memberNo) {
        this.memberNo = memberNo;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Remind{" +
                "memberNo=" + memberNo +
                ", memberName='" + memberName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}


