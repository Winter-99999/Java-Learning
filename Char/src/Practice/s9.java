package Practice;

public class s9 {
    public static void main(String[] args) {
        String id="324595200803166789";
        //获取出生年月日
        String year=id.substring(6,10);
        String month=id.substring(10,12);
        String day=id.substring(12,14);
        System.out.println("出生日期："+year+"-"+month+"-"+day);
        //获取性别
        char sex=id.charAt(16);
        if(sex%2==1){
            System.out.println("性别：男");
        }else{
            System.out.println("性别：女");
        }

    }
}
