package Practice1;

public class s17 {
    public static void main(String[] args) {
        String str1="abcd";
        String str2="cdab";
        boolean flag=false;
        for (int i = 0; i < str1.length(); i++) {
            str1=rotate2(str1);
            if(str1.equals(str2)){
                System.out.println("符合条件");
                flag=true;
            }
        }
        if(!flag) {
        System.out.println("不符合条件");
        }
    }
    //循环左移字符串  abcd->bcda
    public static String rotate(String str){
        StringBuilder sb=new StringBuilder();
        char ch=str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        sb.append(ch);
        return sb.toString();
    }
    public static String rotate1(String str){
        char ch=str.charAt(0);
        String result=str.substring(1);
        result=result+ch;
        return result;
    }
    //把字符串变成字符数组，然后把第一个字符放到数组最后，再把字符数组变成字符串
    public  static String rotate2(String str){
        char []chs=str.toCharArray();
        char temp=chs[0];
        for (int i = 1; i < chs.length; i++) {
            chs[i-1]=chs[i];
        }
        chs[chs.length-1]=temp;
        return new String(chs);

    }
}
