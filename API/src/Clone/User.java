package Clone;

import java.util.Arrays;
import java.util.StringJoiner;

public class User implements Cloneable{
    String id;
    String name;
    String password;
    String path;
    int [] data =new int[10];

    public User() {
    }

    public User(String id, String name, String password, String path, int[] a) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.path = path;
        this.data = a;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }
    @Override
    public String toString() {
        return "id:"+id+" name:"+name+" password:"+password+" path:"+path+" a:"+arrayToString(data);
    }
    public String arrayToString(int[]a){
        StringJoiner s=new StringJoiner(",","[","]");
        for(int i=0;i<a.length;i++){
            s.add(String.valueOf(a[i]));
        }
        return s.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //浅拷贝，拷贝对象时，如果对象中包含基本数据类型，则拷贝的是基本数据类型的值，如果对象中包含引用数据类型，则拷贝的是引用数据类型的地址
        //return super.clone();
        //深拷贝，拷贝对象时，如果对象中包含基本数据类型，则拷贝的是基本数据类型的值，如果对象中包含引用数据类型，则拷贝的是引用数据类型的值
        int newData[]=new int[data.length];
        for(int i=0;i<data.length;i++){
            newData[i]=data[i];
        }
        return new User(id,name,password,path,newData);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id.equals(user.id) && name.equals(user.name) && password.equals(user.password) && path.equals(user.path) && Arrays.equals(data, user.data);
    }
}
