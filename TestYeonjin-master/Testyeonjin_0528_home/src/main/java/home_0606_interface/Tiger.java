package home_0606_interface;

public class Tiger extends Predator implements Barkable {
 public String getFood(){
     return "banana";
 }
 public void bark(){
     System.out.println("어흥");
 }
}
