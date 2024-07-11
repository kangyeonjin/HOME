package home_0606_interface;

public abstract class Predator extends Animal{
    abstract String getFood();

   void printFood(){
      System.out.println(getFood());
   }
   static int LEG_COUNT =4;  //추상클래스의 상수는 static선언이 필요함
   static int speed(){
      return  LEG_COUNT*30;
   }
   interface Barkable{
      void bark();
   }
}
