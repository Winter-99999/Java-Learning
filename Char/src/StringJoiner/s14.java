package StringJoiner;

import java.util.StringJoiner;

public class s14 {
    public static void main(String[] args) {
        StringJoiner sj=new StringJoiner("---");   //只能添加字符串，且没有无参构造方法
        sj.add("aa").add("bb");
        System.out.println(sj);
    }
}
