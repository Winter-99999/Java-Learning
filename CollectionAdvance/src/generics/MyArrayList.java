package generics;

import java.util.Arrays;

public class MyArrayList<E> {
    Object obj[]=new Object[5];
    int size=0;
    public boolean add(E e){
        if(size==obj.length){
            return false;
        }
        obj[size]=e;
        size++;
        return true;
    }
    public E get(int index){
        return (E) obj[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(obj);
    }
}
