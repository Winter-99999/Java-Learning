package Regex;

public class Practice {
    public static void main(String[] args) {
        String phoneNumber="12345678901";
        System.out.println(isPhoneNumberValid(phoneNumber));    // false
        System.out.println(isPhoneNumberValid("13345678901"));  // true
        System.out.println("----------------");
        System.out.println(isPhoneNumberValid2("020-2234567"));  // true
        System.out.println(isPhoneNumberValid2("020-22345678")); // true
        System.out.println("----------------");
        System.out.println(isEmailValid("123@qq.com"));  // true
        System.out.println(isEmailValid("1w@qq.com.cn"));  // true
        System.out.println(isEmailValid("www123@qq.com.cn.com"));  // false
        System.out.println("----------------");
        String regex="/^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$/";

    }
    public  static boolean isPhoneNumberValid(String phoneNumber){
        String regex="1[3-9]\\d{9}";
        return phoneNumber.matches(regex);
    }
    public static boolean isPhoneNumberValid2(String phoneNumber){
        String regex="0[2-9]\\d{1,2}-[2-9]\\d{6,7}";
        return phoneNumber.matches(regex);
    }
    public static boolean isEmailValid(String email){
        String regex="\\w+@[\\w&&[^_]]{2,6}(\\.[a-zA-Z]{2,3}){1,2}";   //(){} 括号里面出现次数
        return email.matches(regex);
    }

}
