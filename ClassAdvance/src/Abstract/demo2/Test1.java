package Abstract.demo2;

public class Test1 {
    public static void main(String[] args) {
        Animal a = new Dog("旺财",5);
        a.eat();
        a.drink();
        System.out.println(a.getName());
        Sheep s=new Sheep("小花",2);
        s.eat();
        s.drink();
    }
}
