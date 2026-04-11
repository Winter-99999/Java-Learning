package Practice;

public class s10 {
    public static void main(String[] args) {
        String talk="不要玩了，tmd,傻B,傻B";
        String arr[]={"tmd","傻逼","傻B"};
        for (int i = 0; i < arr.length; i++) {
            String s="";
            for (int j = 0; j < arr[i].length(); j++) {
                s=s+"*";
            }
            talk=talk.replace(arr[i],s);
        }
        System.out.println(talk);

    }
}
