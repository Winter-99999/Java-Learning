package Inherit.extends1;

public class Test0 {
    public  static  void main(String[] args) {
        Zi zi=new Zi();
        zi.show();
    }
}
    class Fu{
        String name="fu";
        String hobby="喝茶";
    }
    class Zi extends Fu{
        public Zi() {
        }

        String name="zi";
        int age=12;
        public void show(){
            //打印zi
            System.out.println(name);
            System.out.println(this.name);
            //打印fu
            System.out.println(super.name);
            //打印喝茶
            System.out.println(hobby);
            System.out.println(this.hobby);
            System.out.println(super.hobby);
            //打印12
            System.out.println(age);
            System.out.println(this.age);
        }
    }

