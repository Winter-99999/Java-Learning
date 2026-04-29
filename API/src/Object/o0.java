package Object;

public class o0 {
    public static void main(String[] args) {
        Object obj=new Object();
        System.out.println(obj.toString());  //java.lang.Object@23fc625e
//        toString,equals可以被重写
        Student s1=new Student();
        Student s2=new Student();
        System.out.println(s1.toString());
        System.out.println(s1.equals(s2));
    }
}
