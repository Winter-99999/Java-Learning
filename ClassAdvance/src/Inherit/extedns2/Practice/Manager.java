package Inherit.extedns2.Practice;

public class Manager extends  Person{
    int prize;
    public Manager(){
        super();     //可以写可不写
    }
    public Manager(String id, String name, int age, int prize){
        super(id, name, age);
        this.prize=prize;
    }
    @Override
    public void work(){
        System.out.println("管理");
    }

    public int getPrize() {
        return prize;
    }

    public void setPrize(int prize) {
        this.prize = prize;
    }
}
