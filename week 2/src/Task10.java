import java.util.ArrayList;

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
        private ArrayList<USB> usbs = new ArrayList<>();
        public void add(USB usb)
        {
            usbs.add(usb);
        }
        public void powerOn()
        {
            for(USB usb : usbs)
            {
                usb.turnOn();
            }
            System.out.println("电脑开机成功");
            System.out.println("------------");
        }
        public void powerOff()
        {
            for(USB usb : usbs)
            {
                usb.turnOff();
            }
            System.out.println("电脑关机成功");
        }

    }
