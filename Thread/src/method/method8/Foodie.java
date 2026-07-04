package method.method8;

public class Foodie extends Thread{
    @Override
    public void run(){
        while(true){
            synchronized (Desk.lock){
                if(Desk.count==0) break;
                //先判断有没有食物，如果没有食物
                if(Desk.foodFlag==0){
                    try {
                        Desk.lock.wait();  //释放锁，进入等待
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    Desk.lock.notifyAll(); //唤醒所有线程
                }else{
                    System.out.println("大胃王正在吃第"+(11-Desk.count)+"个食物");
                    Desk.count--;
                    System.out.println("剩余食物数量为："+Desk.count);
                    Desk.foodFlag=0;
                }
            }
        }
    }
}
