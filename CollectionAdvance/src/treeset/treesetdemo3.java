package treeset;

import java.util.Comparator;
import java.util.TreeSet;

public class treesetdemo3 {
    public static void main(String[] args) {
        //比较器排序 先按照长度进行排序，长度相同再按照内容进行排序
        //Comparator 函数式接口，只有一个抽象方法 compare
        TreeSet <String> tlist= new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int i=o1.length()-o2.length();
                return i==0?o1.compareTo(o2):i;
            }
        });
        tlist.add("ab");
        tlist.add("c");
        tlist.add("ef");
        tlist.add("d");
        System.out.println(tlist); //[c, d, ab, ef]
    }
}
