package Interface.demo2;

public interface inter2 {
    public void show();
    public default void show2(){
        System.out.println("show2---");
    }
}
