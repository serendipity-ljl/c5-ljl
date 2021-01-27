public class Task6 {
    static class Account {
        public String name;
        public float remain;
        Account(String name,float remain){
            this.name=name;
            this.remain=remain;
        }
        void check()
        {
            System.out.println("name:"+name);
            System.out.println("the remain is "+remain);
        }
    }
}
