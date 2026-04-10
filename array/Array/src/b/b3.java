package b;

public class b3 {
    public static void main(String[] args) {
        int []c={1,2,3,4,5,6,7,8,9};
        for (int i = 0; i < c.length/2; i++) {
            c[i]=c[i]+c[c.length-1-i];
            c[c.length-1-i]=c[i]-c[c.length-1-i];
            c[i]=c[i]-c[c.length-1-i];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
