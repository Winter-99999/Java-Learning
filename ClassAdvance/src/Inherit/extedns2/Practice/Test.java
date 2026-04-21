package Inherit.extedns2.Practice;

public class Test {
    public static void main(String[] args) {
        Cook cook=new Cook("1", "wang", 13);
        cook.work();
        Manager manager=new Manager();
        manager.work();
        System.out.println(manager.getPrize());
    }
}
