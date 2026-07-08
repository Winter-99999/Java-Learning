package demo;

public class Test {
    public static void main(String[] args) {
        //创建代理对象
        Acter acter = new Acter("wang",20);
        Act proxy = ProxyUtil.createProxy(acter);
        //调用方法
        String end = proxy.sing("7 years");
        System.out.println(end);
    }
}
