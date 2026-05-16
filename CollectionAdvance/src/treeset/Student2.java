package treeset;

public class Student2 implements Comparable<Student2> {
    private String name;
    private int age;
    private int chinese;
    private int math;
    private int english;

    public Student2(String name, int age, int chinese, int math, int english) {
        this.name = name;
        this.age = age;
        this.chinese = chinese;
        this.math = math;
        this.english = english;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chinese=" + chinese +
                ", math=" + math +
                ", english=" + english +
                ", sum=" + (this.chinese + this.math + this.english) +
                '}';
    }

    @Override
    public int compareTo(Student2 o) {
        //先按总分升序排序，总分相同再按语文、数学、英语的分数升序排序，分数相同再按年龄升序排序，年龄相同再按姓名升序排序
        int sum1 = this.chinese + this.math + this.english;
        int sum2 = o.chinese + o.math + o.english;
        int i = sum1 - sum2;
        i = i == 0 ? this.chinese - o.chinese : i;
        i = i == 0 ? this.math - o.math : i;
        i = i == 0 ? this.english - o.english : i;
        i = i == 0 ? this.age - o.age : i;
        i = i == 0 ? this.name.compareTo(o.name) : i;
        return i;
    }
}
