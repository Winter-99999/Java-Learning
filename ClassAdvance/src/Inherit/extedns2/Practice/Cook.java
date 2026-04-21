package Inherit.extedns2.Practice;

public class Cook extends  Person{
    public Cook(){
        super();
    }
    public Cook(String id, String name, int age){
        super(id, name, age);
    }
    @Override
    public void work(){
        System.out.println("炒菜");
    }
}
