package demo;

import java.io.File;

public class demo1 {
    public static void main(String[] args) {
        //E:\idea\projects\code\File\file\a

        //public File(String pathname)
        String str="E:\\idea\\projects\\code\\File\\file\\a";
        File f1=new File(str);
        System.out.println(f1);

        //public File(String parent,String child)
        String parent1="E:\\idea\\projects\\code\\File\\file";
        String child1="a";
        File f2=new File(parent1,child1);
        System.out.println(f2);

        //public File(File parent,String child)
        String parent2="E:\\idea\\projects\\code\\File\\file";
        String child2="a";
        File f3=new File(parent2);
        File f4=new File(f3,child2);
        System.out.println(f4);
    }
}
