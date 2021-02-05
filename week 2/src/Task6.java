public class Task6 {
    public static void main(String[] args) {
        Car C = new Car(4,1150,3);
        C.True(3);
        Truck T = new Truck(6,15000,7000,1);
        T.True(1);
        T.Other(7000);
    }
    public static class Vehicle {
        private int wheels;
        private int weight;
        public Vehicle()
        {
            this.weight=weight;
            this.wheels=wheels;
        }
        public void Wheel(int wheels)
        {
            System.out.print("车轮的个数是："+wheels+" ");
        }
        public void Weight(int weight)
        {
            System.out.println("车重："+weight);
        }
    }

    public static class Car extends Vehicle{
        private int loader;

        public Car(int wheels,int weight,int loader) {
            super.Wheel(4);
            super.Weight(1150);
            this.loader = loader;
        }
        public void True(int loader)
        {
            if(loader>5)
                System.out.println("这是一辆小车，能载6人，实载"+loader+"人,"+"你超员了！！！");
            else
                System.out.println("这是一辆小车，能载6人，实载"+loader+"人");
        }
    }

    public static class Truck extends Vehicle{
        private int payload;
        private int loader;
        public Truck(int wheels,int weight,int payload,int loader)
        {
            super.Wheel(6);
            super.Weight(15000);
            this.payload=payload;
            this.loader=loader;
        }
        public void True(int loader)
        {
            if(loader>3)
                System.out.println("这是一辆卡车，能载3人，实载"+loader+"人,"+"你超员了！！！");
            else
                System.out.println("这是一辆卡车，能载3人，实载"+loader+"人");
        }
        public void Other(int payload)
        {
            if(payload>5000)
                System.out.println("这是一辆卡车，核载5000kg，你已装载"+payload+"kg,"+"你超载了！！！");
            else
                System.out.println("这是一辆卡车，核载5000kg，你已装载"+payload+"kg");
        }
    }
}
