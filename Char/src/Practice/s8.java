package Practice;

public class s8 {
    public static void main(String[] args) {
        String phoneNumber="13112349468";
        String start=phoneNumber.substring(0,3);   //获取前3位，索引从0开始，索引为3的元素不在字符串中
        String end=phoneNumber.substring(7);   //获取后4位，
        String mask=start+"****"+end;
        System.out.println(mask);
    }
}
