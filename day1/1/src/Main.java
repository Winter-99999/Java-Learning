//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
        // 查看 IntelliJ IDEA 建议如何修正。
        System.out.println("Hello and welcome!");
        System.out.println(1.1+1.21);
        System.out.println(1.1*1.21);
        System.out.println(1.1/1.21);
        System.out.println("--------");
        double a=1.1;
        int b=(int)a;
        System.out.println(b);
        //byte,short,char进行运算时会自动转换成int
        byte c=1;
        short d=2;
        char e='3';
        System.out.println(c+d+e);
    }
}