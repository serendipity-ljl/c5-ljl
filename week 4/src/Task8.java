import java.io.File;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.Reader;

public class Task8 {
    public static void main(String[] args) throws Exception{
        File file = new File("c:"+File.separator+"csatest"+File.separator+"demo.txt");
        int temp = 0;
        FileReader in = new FileReader(file);
        char data[] = new char[1024];
        int len = in.read(data);
        in.close();
        String b = new String(data,0,len);
        for(int i=0;i<b.length()-3;i++)
        {
            if(b.charAt(i)=='2'&&b.charAt(i+1)=='0'&&b.charAt(i+2)=='2'&&b.charAt(i+3)=='1')
            {
                temp++;
            }
        }
        System.out.println(temp);
    }
}
