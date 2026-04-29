package Math;

import java.util.ArrayList;
//计算水仙花数
public class Practice1 {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if(flower(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean flower(int n){
        int m=n;
        ArrayList<Integer> list = new ArrayList<>();
        while(n>0){
            list.add(n%10);
            n=n/10;
        }
        int num=0;
        for(int i=0;i<list.size();i++){
            num+=Math.pow(list.get(i),3);
        }
        return num==m;
    }
}

