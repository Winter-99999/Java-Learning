package Practice1;
import java.util.Random;
public class Role {
    private String name;
    private int blood;
    private char gender;
    private String face;
    String []s={"威武","霸气","帅气","英俊"};
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random random=new Random();
        int index=random.nextInt(4);
        this.face =s[ index] ;
    }

    public Role() {
    }
    public Role(String name, int blood, char gender) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }
    public void attack(Role r){
        Random random=new Random();
        int hurt=random.nextInt(20)+1;
        int newBlood=r.getBlood()-hurt;
        newBlood=newBlood<0?0:newBlood;
        r.setBlood(newBlood);
        System.out.println(this.getName()+"攻击了"+r.getName()+",造成了"+hurt+"伤害,"+
                r.getName()+"剩余"+r.getBlood()+"点血");
    }
    public void show(){
        System.out.println("角色信息：");
        System.out.println("姓名："+name+"  血量："+blood+"  性别："+gender+"  脸型："+face);
    }
}
