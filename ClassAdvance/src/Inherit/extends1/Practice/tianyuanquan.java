package Inherit.extends1.Practice;

public class tianyuanquan extends  Dog {
    String name="田园犬";
    @Override
    public void eat(){
        System.out.println("吃剩饭");
    }
    @Override
    public void lookhome(){
        System.out.println(name+"看家");
    }
}
