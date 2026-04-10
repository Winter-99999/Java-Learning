package method;

public class m0 {
    public static void main(String[] args) {
        g();
        System.out.println(add(1,2));

    }

    public static void g(){
        System.out.println("g");
        return;         //return后面不能有值
    }
    public static int add(int a,int b){
        return a+b;
    }
}
