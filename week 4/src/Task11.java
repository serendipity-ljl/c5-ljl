public class Task11 {
    public static void main(String[] args) throws Exception{
        Message msg = new Message();
        new Thread(new Producer(msg)).start();
        new Thread(new Consumer(msg)).start();
    }
}
class Message{
    private String title;
    private String content;
    private boolean flag = true;
    //flag =true,表示可以生产，不能取走
    //flag = false，表示可以取走，不能生产
    public synchronized void set(String title,String content)
    {
        if(this.flag==false)
        {
            try{
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.title=title;
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.content = content;
        this.flag = false;
        super.notify();
    }
    public synchronized void get()
    {
        if(this.flag==true)
        {
            try{
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.title+"-->"+this.content);
        this.flag = true;
        super.notify();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
class Producer implements  Runnable{
    private Message msg = null;
    public Producer(Message msg)
    {
        this.msg = msg;
    }
    @Override
    public void run() {
        for(int x = 0;x<50;x++)
        {
            if(x%2==0)
            {
                this.msg.set("李兴华","JAVA讲师");
            }
            else
            {
                this.msg.set("mldn","www.mldnjava.com");
            }
        }
    }

}
class Consumer implements Runnable{
    private  Message msg = null;
    public Consumer(Message msg)
    {
        this.msg = msg;
    }
    @Override
    public void run() {
        for(int x =0;x<50;x++)
        {
            this.msg.get();
        }
    }
}