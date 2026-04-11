package base;

public class string0 {
    public static void main(String[] args) {
        //串池里有时，直接用，如果没有，新创建一个
        String s1 = "abc";
        System.out.println(s1);

        //堆区创建，每次都会新创建一个
        String s2 = new String();
        s2 = "vvv";
        System.out.println(s2);

        //堆区创建，每次都会新创建一个
        char cs[] = {'a', 'b', 'c'};
        String s3 = new String(cs);
        System.out.println(s3);

        //堆区创建，每次都会新创建一个
        String s4 = new String("abc");
        System.out.println(s4);

        //堆区创建，每次都会新创建一个
        byte bs[] = {97, 99, 105};
        String s5 = new String(bs);
        System.out.println(s5);
    }
}
