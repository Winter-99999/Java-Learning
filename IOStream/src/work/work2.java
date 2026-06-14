package work;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class work2 {
    public static void main(String[] args) throws IOException {
        //带权重的点名器

        //读取数据并添加到集合中
        ArrayList<Student> students = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("src\\work\\students.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            String[] info = str.split("-");
            Student student = new Student(info[0], info[1], Integer.parseInt(info[2]), Double.parseDouble(info[3]));
            students.add(student);
        }
        br.close();
        //计算权重
        double weightSum = 0;
        for (Student student : students) {
            weightSum += student.getWeight();
        }
        double[] arr = new double[students.size()];
        int index = 0;
        for (Student student : students) {
            arr[index] = student.getWeight() / weightSum;
            index++;
        }
        //计算范围
        double[] range = new double[students.size()];
        range[0] = arr[0];
        for (int i = 1; i < range.length; i++) {
            range[i] = range[i - 1] + arr[i];
        }
        //生成随机数 实现点名 被点到的同学权重减半
        double random = Math.random();  //0-1
        int loc = Arrays.binarySearch(range, random);
        if (loc < 0) {
            loc = -loc - 1;
        }
        Student stu = students.get(loc);
        System.out.println(stu);
        stu.setWeight(stu.getWeight() / 2);
        //写回数据
        BufferedWriter bw = new BufferedWriter(new FileWriter("src\\work\\students.txt"));
        for (Student student : students) {
            bw.write(student.getName() + "-" + student.getSex() + "-" + student.getAge() + "-" + student.getWeight());
            bw.newLine();
        }
        bw.close();
    }
}
