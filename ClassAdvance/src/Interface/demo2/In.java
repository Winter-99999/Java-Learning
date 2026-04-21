package Interface.demo2;

public class In implements  inter, inter2{
    @Override
    public void show() {
        System.out.println("show---");
    }

    //默认方法重写时不写default
    @Override
    public void show1() {
        System.out.println("show1-----");
    }

    @Override
    public void show2() {
        System.out.println("show2-----");
    }
}
