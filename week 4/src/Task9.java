import java.io.*;

public class Task9 {
    public static void main(String[] args) throws Exception {
        File infile = new File("c:"+File.separator+"csatest"+File.separator+"demo.txt");
        File outfile = new File("c:"+File.separator+"csatest2"+File.separator+"demo2.txt");
        if(!outfile.getParentFile().exists())
        {
            outfile.getParentFile().mkdirs();
        }
        InputStream input = new FileInputStream(infile);
        OutputStream output = new FileOutputStream(outfile);
        int temp =0;
        byte data[] = new byte[1024];
        while((temp = input.read(data))!=-1)
        {
            output.write(data,0,temp);
        }
        input.close();
        output.close();
    }
}
