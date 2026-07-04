package demo;

public class demo1 {
    public static void main(String[] args) {
        //多线程第一种实现方式
        //1. 创建一个类继承Thread类
        //2. 在该类重写run方法
        //3. 创建一个对象
        MyThread1 myThread1 = new MyThread1();
        myThread1.setName("线程1");
        MyThread1 myThread2 = new MyThread1();
        myThread2.setName("线程2");
        //调用start方法启动线程
        myThread1.start();
        myThread2.start();
    }
}
