public class Task2 {
    public static void main(String[] args) {
        int count=0,ge,shi,bai;
        for(int i=100;i<1000;i++)
        {
             bai=i/100;
             ge=i%10;
             shi=(i-100*bai)/10;
             if(ge*ge*ge+shi*shi*shi+bai*bai*bai==i)
             {
                 count++;
             }
        }
        System.out.println("1000以内的水仙花数有"+count+"个");
    }

}
