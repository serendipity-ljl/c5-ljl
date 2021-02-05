public class Task5 {
    public static void main(String[] args) {
        Monkey M = new Monkey("美猴王");
        M.speak();
        People P = new People("张三");
        P.speak();
        P.think();
    }

    public static class Monkey {
        private String name;
        public Monkey(String s) {
            name=s;
        }

        public void speak()
        {
            System.out.println("咿咿呀呀……");
        }
    }

     public  static class People extends Monkey {
         public People(String s) {
             super(s);
         }
         public void speak()
         {
             System.out.println("小样的，不错嘛！会说话了！");
         }
         public void think()
         {
             System.out.println("别说话！认真思考！");
         }
     }
}
