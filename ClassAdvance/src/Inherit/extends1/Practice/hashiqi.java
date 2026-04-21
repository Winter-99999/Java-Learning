package Inherit.extends1.Practice;

public class hashiqi extends  Dog{
    String name="哈士奇";
    public void destoryhome(){
        System.out.println(name+"拆家");
    }
    @Override
    public void lookhome(){
        System.out.println(name+"看家");
    }
}
