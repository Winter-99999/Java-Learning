package Math;
//质数
public class Practice {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if(iszhishu(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean iszhishu(int a){
        if(a<2){
            return  false;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}

