public class Task10 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread a = new Thread(t);
        Thread b = new Thread(t);
        a.setName("线程A");
        b.setName("线程B");
        a.start();
        b.start();
    }
}
class MyThread implements Runnable{
    int i =0;
    @Override
    public void run() {
        while(true)
        {
            synchronized (this){
                notify();
                try{
                    Thread.currentThread();
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(i<=10)
                {
                    System.out.println(Thread.currentThread().getName()+"打印"+":"+i);
                    i++;
                    try{
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
