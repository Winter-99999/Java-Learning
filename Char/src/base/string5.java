package base;

public class string5 {
    public static void main(String[] args) {
        int arr[]=new int[] {1,2,3,4,5};
        String s=arrToString(arr);
        System.out.println(s);
        String s1="1,2,3,4,5";
        System.out.println(fanZhuan(s1));
        System.out.println(s1);
        System.out.println(reverse(s1));
    }
    public static String arrToString(int []arr){
        if(arr==null){
            return null;
        }
        if(arr.length==0){
            return "[]";
        }
        String s="[";
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                s=s+arr[i]+"]";
            }else{
                s=s+arr[i]+",";
            }
        }
        return s;
    }
    public static String fanZhuan(String s){
        char chs[] = s.toCharArray();
        for (int i = 0; i < chs.length/2; i++) {
            char temp = chs[i];
            chs[i] = chs[chs.length-1-i];
            chs[chs.length-1-i] = temp;
        }
        return new String(chs);
    }
    public static String reverse(String str){
        String result="";
        for (int i = str.length()-1; i >=0; i--) {
            result=result+str.charAt(i);
        }
        return result;
    }
}
