package Practice1;

public class s20 {
    public static void main(String[] args) {
        String s1="12";
        String s2="34";
        //计算乘积
        //转为字符数组
        char chs1[]=s1.toCharArray();
        char chs2[]=s2.toCharArray();
        int []a1=new int[chs1.length];
        int []a2=new int[chs2.length];
        //转为整型数组
        for (int i = 0; i < chs1.length; i++) {
            a1[i]=chs1[i]-'0';
        }
        for (int i = 0; i < chs2.length; i++) {
            a2[i]=chs2[i]-'0';
        }
        //转为整型数字
        int number1=arrToInt(a1);
        int number2=arrToInt(a2);
        int result=number1*number2;
        String s=intToArr(result);
        System.out.println(s);
    }
    public static int arrToInt(int[] arr){
        int number=0;
        for (int i = 0; i < arr.length; i++) {  //从头开始转换
            number+=arr[i];
            if(i!=arr.length-1){
                number*=10;
            }
        }
        return number;
    }
    public static String intToArr(int number){
        String s="";
        while(number!=0){
            int number1=number%10;
            s=number1+s;    //从尾开始转换
            number/=10;
        }
        return s;
    }
}
