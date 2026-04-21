package Inherit.extends1.Practice;

public class shapigou extends Dog{
    String name="沙皮狗";
    @Override
     public void eat(){
    System.out.println("吃狗粮，吃骨头");
  }
    @Override
    public void lookhome(){
        System.out.println(name+"看家");
    }

}
