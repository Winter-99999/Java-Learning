package Final;

public class Test4 {
    public static void main(String[] args) {
        //fianl修饰基本数据类型变量，值不能修改
        //final修饰引用数据类型变量，引用不能修改，引用所存储的对象内容可以修改

        final double PI=3.14;

        Object s=new Object(15);
        s.show();
        s.setAge(16);
        s.show();

        final int ARR[]={1,2,3,4,5};
        ARR[0]=10;    //可以修改
        for (int i = 0; i < ARR.length; i++) {
            System.out.println(ARR[i]);
        }
    }
}
class Object{
    private  int age;
    public Object(int age){
        this.age=age;
    }
    public void show(){
        System.out.println("年龄是："+age);
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}
