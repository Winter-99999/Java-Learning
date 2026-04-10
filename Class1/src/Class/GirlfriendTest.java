package Class;

public class GirlfriendTest {
    public static void main(String[] args) {
        Girlfriend gf=new Girlfriend();
        gf.SetName("小花");
        gf.SetAge(19);
        gf.SetGender("女");
        gf.show();
        Girlfriend gf1=gf;
        gf1.SetName("小花1");
        gf1.show();
        gf.show();
    }
}
