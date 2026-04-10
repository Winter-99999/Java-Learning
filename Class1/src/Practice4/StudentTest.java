package Practice4;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student arr[] = new Student[3];
        Student stu1 = new Student("001", "王", 20);
        Student stu2 = new Student("002", "帐", 25);
        Student stu3 = new Student("003", "李", 23);
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;
        Scanner sc=new Scanner(System.in);

/*      System.out.println("请输入id");
        String id=sc.next();
        System.out.println("请输入name");
        String name=sc.next();
        System.out.println("请输入age");
        int age= sc.nextInt();
        Student stu4 = new Student(id,name,age);
        if(contain(arr,stu4.getId())){
            System.out.println("id已存在");
        }else{
            if(getnumber(arr)==arr.length){
                Student []arr1=new Student[arr.length+1];
                for (int i = 0; i < arr1.length-1; i++) {
                    arr1[i]=arr[i];
                }
                arr1[arr.length]=stu4;
                arr=arr1;
            }else{
                arr[getnumber(arr)]=stu4;
            }
        }*/
        //遍历
       show(arr);
       deletestu(arr, "002");
        System.out.println();
       show(arr);

    }
    // ... existing code ...

    /**
     * 检查学生数组中是否包含指定 ID 的学生
     *
     * @param a 学生数组
     * @param id 要查找的学生 ID
     * @return 如果找到指定 ID 的学生返回 true，否则返回 false
     */
    public static boolean contain(Student[] a, String id) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != null && a[i].getId().equals(id)) {
                return true;
            }
        }
        return false;
    }

// ... existing code ...

    // ... existing code ...

        /**
         * 统计学生数组中非空学生对象的数量
         *
         * @param a 学生数组
         * @return 数组中非空学生对象的数量
         */
        public static int getnumber(Student[] a) {
            int count = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != null)
                    count++;
            }
            return count;
        }

    // ... existing code ...

    // ... existing code ...

        /**
         * 查找指定 ID 的学生在数组中的索引位置
         *
         * @param a 学生数组
         * @param id 要查找的学生 ID
         * @return 如果找到返回该学生在数组中的索引，否则返回 -1
         */
        public static int getindex(Student[] a, String id) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != null && a[i].getId().equals(id)) {
                    return i;
                }
            }
            return -1;
        }

    // ... existing code ...

    // ... existing code ...

        /**
         * 从学生数组中删除指定 ID 的学生
         *
         * @param a 学生数组
         * @param id 要删除的学生 ID
         * @return 如果删除成功返回 true，如果未找到该学生返回 false
         */
        public static boolean deletestu(Student[] a, String id) {
            int index = getindex(a, id);
            if (index == -1) {
                return false;
            }
            a[index] = null;
            return true;
        }

    // ... existing code ...
    public static void show(Student[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null)
                System.out.println(arr[i].getId()+" "+arr[i].getName()+" "+arr[i].getAge());
        }
    }
}