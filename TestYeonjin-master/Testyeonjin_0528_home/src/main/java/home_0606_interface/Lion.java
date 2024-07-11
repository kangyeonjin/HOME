package home_0606_interface;

public class Lion extends Predator implements  Barkable {

    public String getFood(){
        return "apple";
    }
    public void bark(){
        System.out.println("으르렁");
    }
}
