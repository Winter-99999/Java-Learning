package practice.practice3;

public class Thread3 extends Thread{
    static int number = 100;
    static Object lock=new Object();
    @Override
    public void run(){
        while(true){
            synchronized (lock){
                if (number ==0) {
                    break;
                }
                if(number %2==1){
                    System.out.println(getName()+" " + number);
                }
                number--;
            }
        }
    }
}
