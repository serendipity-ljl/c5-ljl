public class Task2 {
    public static void main(String[] args) {
        Solute a =new Solute();
        String[] strs={"flower","flow","flight"};
        a.str(strs);
    }

    public static class Solute {
        public String str(String[] strs)      //找出最大公共前缀
        {
            if(strs==null||strs.length==0)
            {
                System.out.println("");
                return null;
            }
            String max = strs[0];
            for(int i=1;i<strs.length;i++)
            {
                int index = -1;
                for(int j=0;j<strs[i].length()&&j<max.length();j++)
                {
                    if(strs[i].charAt(j)!=max.charAt(j))
                    {
                        break;
                    }
                    index=j;
                }
                if(index==-1)
                {
                    return "";
                }
                else
                {
                    max=max.substring(0,index+1);
                }
            }
            System.out.println(max);
            return max;
        }
    }
}
