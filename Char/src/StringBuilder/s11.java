package StringBuilder;
//默认容量为16，扩容为2倍+2，扩容后，如果容量不够，则扩容为实际长度
public class s11 {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abc");
        System.out.println(sb);    //打印的是属性值而不是地址值

        sb.append("ddd");  //任意类型添加
        sb.append(222);
        sb.append(true);
        sb.append(3.14).append('u');   //链式编程
        System.out.println(sb);

        sb.reverse();   //翻转
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb.length());   //长度

        String s=sb.toString();    //转为字符串
        System.out.println(s);
    }
}
