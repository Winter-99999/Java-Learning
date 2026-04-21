package Interface.demo2;

public interface inter {
    public void show();

    //默认方法,deault不能省略
    public default void show1() {
        System.out.println("show1---");
    }
}
