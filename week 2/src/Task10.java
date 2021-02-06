public class Task10 {
    public static void main(String[] args) {
        Computer com= new Computer();
        com.add(new Mouse());
        com.add(new Keyboard());
        com.add(new Microphone());
        com.powerOn();
        com.powerOff();
    }

}
    interface USB {
        void turnOn();
        void turnOff();
    }

     class Mouse implements USB{

        @Override
        public void turnOn() {
            System.out.println("鼠标启动了");
        }

        @Override
        public void turnOff() {
            System.out.println("鼠标关闭了");
        }
    }

    class Keyboard implements USB{
        @Override
        public void turnOn() {
            System.out.println("键盘启动了");
        }

        @Override
        public void turnOff() {
            System.out.println("键盘关闭了");
        }
    }

    class Microphone implements USB{
        @Override
        public void turnOn() {
            System.out.println("麦克风启动了");
        }

        @Override
        public void turnOff() {
            System.out.println("麦克风关闭了");
        }
    }

    class Computer {
        private USB[] arr= new USB[4];
        public void add(USB usb)
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==null)
                {
                    arr[i]=usb;

                }
            }
        }
        public void powerOn()
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]!=null)
                    arr[i].turnOn();
            }
            System.out.println("电脑开机成功");
            System.out.println("------------");
        }
        public void powerOff()
        {
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]!=null)
                    arr[i].turnOff();
            }
            System.out.println("电脑关机成功");
        }

    }
