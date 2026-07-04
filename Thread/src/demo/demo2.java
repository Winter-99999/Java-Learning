package demo;

public class demo2 {
    public static void main(String[] args) {
        //多线程第二种实现方式
        //1. 创建一个类实现Runnable接口
        //2. 在该类实现run方法
        //3. 创建一个对象
        //4. 创建一个Thread对象
        MyThread2 mt1 = new MyThread2();
        MyThread2 mt2 = new MyThread2();
        Thread t1 = new Thread(mt1);
        t1.setName("线程1");
        Thread t2 = new Thread(mt2);
        t2.setName("线程2");
        t1.start();
        t2.start();
    }
}
