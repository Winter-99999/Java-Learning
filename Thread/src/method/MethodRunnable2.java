package method;

public class MethodRunnable2 implements Runnable{
    int ticket=0;
    @Override
    public void run() {
        while(true){
            if (extracted()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
        }
    }

    private synchronized boolean extracted() {
        if (ticket==50) {
            return true;
        }else{

            System.out.println(Thread.currentThread().getName() + "正在卖票---->" + ++ticket);
        }

        return false;
    }
}
