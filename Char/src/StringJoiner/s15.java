package StringJoiner;
import java.util.StringJoiner;
public class s15 {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner("，","【","】");
        sj.add("aa").add("bb");
        System.out.println(sj);
        System.out.println(sj.length());  //总长度
        String s=sj.toString();
        System.out.println(s);

    }
}
