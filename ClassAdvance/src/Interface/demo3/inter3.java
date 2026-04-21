package Interface.demo3;

public interface inter3 {
    public void show();
    public default void show1(){
        System.out.println("show1---");
        show3();
    }
    public static void show2(){
        System.out.println("show2---");
        show4();
    }
    //私有方法，不能供静态方法使用
    private void show3(){
        System.out.println("show3---");
    }
    //静态私有方法，可供静态方法使用
    private static void show4(){
        System.out.println("show4---");
    }
}
