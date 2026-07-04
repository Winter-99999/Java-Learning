package method;

public class method1 {
    public static void main(String[] args) throws InterruptedException {
        /*常用方法
        String getName() 获取当前线程名称
        void setName(String name) 设置当前线程名称
        细节： 可以在创建线程对象时设置名称 需要在该类的构造方法中调用Thread的构造方法
              如果没有设置名称，默认名称为Thread-X X为当前线程编号 从0开始
        static Thread currentThread()  获取当前线程
        static void sleep(long millis)  使当前线程休眠 单位毫秒 休眠结束后继续执行当前线程
        */
        MethodThread1 t1 = new MethodThread1("线程一");
        MethodThread1 t2 = new MethodThread1("线程二");
        t1.start();
        Thread t = Thread.currentThread();
        System.out.println(t.getName());  //输出当前线程名称 main
    }
}
