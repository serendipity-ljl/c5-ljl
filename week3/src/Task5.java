import java.util.Scanner;
public class Task5 {
      static  String[] usernames ={"张三","李四","王五"};
      public static void main(String[] args) throws Exception {
          Scanner in = new Scanner(System.in);
          System.out.println("请输入用户名：");
          String username = in.next();
          CheckName(username);
    }
    public static void CheckName(String username) throws Exception {
        for(String name:usernames)
        {
            if(name.equals(username))
            {
                try{
                    throw new Exception("该用户已经被注册！");
                }catch(Exception e){
                    e.printStackTrace();
                }
                return;
            }
        }
        System.out.println("注册成功");
    }
}
