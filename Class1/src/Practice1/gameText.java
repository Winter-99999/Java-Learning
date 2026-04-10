package Practice1;

public class gameText {
    public static void main(String[] args){
        Role r1=new Role("小怪兽",100,'男');
        Role r2=new Role("奥特曼",100,'男');
        r1.show();
        r2.show();
        while(true){
       r1.attack(r2);
       if(r2.getBlood()==0){
           System.out.println(r1.getName()+"杀死了"+r2.getName());
           break;
       }
       r2.attack(r1);
       if(r1.getBlood()==0){
           System.out.println(r2.getName()+"杀死了"+r1.getName());
           break;
       }
        }
    }
}
