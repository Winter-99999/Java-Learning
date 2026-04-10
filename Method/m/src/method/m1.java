package method;

public class m1
{
    public static void main(String[] args){
        System.out.println("a"+1);
        System.out.println('a'+1);
        System.out.println("abc"+'e');
    }
        public static void sum(int a,int b){
        System.out.println(a+b);
        }
        //参数不同：个数不同，参数类型不同，顺序不同  方法名相同  在同一个类中 重载
    public static void sum(double a,double b){
        System.out.println(a+b);
    }
}
