package d;

public class d324
{
    public static void main(String[] args)
    {
        int a=1;
        System.out.println(a++);   //1
        System.out.println(++a);   //3
        System.out.println(a);    //3
        int b=a++;
        System.out.println(b);    //3
        System.out.println(a);    //4
        int c=2;
        boolean re=++a>5&&++c>2;
        System.out.println(re);
        System.out.println(a);
        System.out.println(c);
    }
}
