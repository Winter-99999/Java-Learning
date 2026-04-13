import java.util.ArrayList;
import java.util.Scanner;

public class studentSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Student> students=new ArrayList<>();
        while (true){
            System.out.println("----------欢迎来到学生管理系统");
            System.out.println("1。添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入您的选择");
            String choice=sc.next();
            switch(choice){
                case "1"-> addStudent(students);
                case "2"-> deleteStudent(students);
                case "3"-> updateStudent(students);
                case "4"-> queryStudent(students);
                case "5"-> {
                    System.out.println("退出");
                    System.exit(0);   //停止虚拟机运行
                }
                default -> System.out.println("输入错误，请重新输入");
            }
        }

    }
    public  static void addStudent(ArrayList<Student> students){
        Scanner sc=new Scanner(System.in);
        String id;
        System.out.println("请输入id");
        id=sc.next();
        /*loop :while(true){
            System.out.println("请输入id");
            id=sc.next();
            if(students.size()==0) break;
            for (int i = 0; i < students.size(); i++) {
                if(students.get(i).getId().equals(id)){
                    System.out.println("该id已存在，请重新输入");
                }else{
                    break loop;
                }
            }
        }*/
        while(contains(students,id)){
            System.out.println("该id已存在，请重新输入");
            id=sc.next();
        }
        System.out.println("请输入姓名");
        String name=sc.next();
        System.out.println("请输入年龄");
        int age=sc.nextInt();
        System.out.println("请输入地址");
        String address=sc.next();
        students.add(new Student(id,name,age,address));
        System.out.println("添加成功");
    }
    public  static void deleteStudent(ArrayList<Student> students){
        System.out.println("请输入要删除的学生id");
        Scanner sc=new Scanner(System.in);
        String id=sc.next();
        if(getIndex(students,id)==-1){
            System.out.println("该id不存在，删除失败");
        }else{
            students.remove(getIndex(students,id));
        }
        //students.removeIf(s -> s.getId().equals(id));
    }
    public  static void updateStudent(ArrayList<Student> students){
        Scanner sc=new Scanner(System.in);
        String id;
        System.out.println("请输入要修改的学生id");
        id=sc.next();
        int index=getIndex(students,id);
        if(index==-1){
            System.out.println("该id不存在，修改失败");
        }else{
            Student stu=students.get(index);
            System.out.println("请输入要修改的姓名");
            String name=sc.next();
            stu.setName(name);
            System.out.println("请输入要修改的年龄");
            int age=sc.nextInt();
            stu.setAge(age);
            System.out.println("请输入要修改的地址");
            String address=sc.next();
            stu.setAddress(address);
            System.out.println("修改成功");
        }
    }
    public  static void queryStudent(ArrayList<Student> students){
        if(students.size()==0){
            System.out.println("当前无学生信息，请重新选择");
        }else{
            for (int i = 0; i < students.size(); i++) {
                Student stu=students.get(i);
                System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getAddress());
            }
        }
    }
    //判断id是否存在
    public static boolean contains(ArrayList<Student> students,String id){
        for (int i = 0; i < students.size(); i++) {
            Student stu=students.get(i);
            if(stu.getId().equals(id)){
                return true;    //存在返回true
            }
        }
        return false;  //不存在返回false
       // return getIndex(students,id)==-1?false:true;
    }
    //通过id获取索引
    public static int getIndex(ArrayList<Student> students,String id){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

}


