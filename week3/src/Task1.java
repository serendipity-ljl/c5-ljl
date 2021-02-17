import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numS ={-1,0,1,2,-1,4};
        int target = 0;
        System.out.println(threeSum(numS,target));
    }
    public static List<List<Integer>> threeSum(int[] numS, int target)
    {
        Arrays.sort(numS);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < numS.length ){
            if(( i == 0 || numS[i]!=numS[i-1]) && (numS[i] <= 0)){
                j = i + 1;
                k = numS.length - 1;
                while( j < k){
                    if( numS[i]==0 &&numS[j]==0 && numS[k]==0){
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(0);
                        tmp.add(0);
                        tmp.add(0);
                        res.add(tmp);
                        break;
                    }
                    int s = numS[i] + numS[j] + numS[k];
                    if(s == 0){
                        List<Integer> tmp = new ArrayList<Integer>();
                        tmp.add(numS[i]);
                        tmp.add(numS[j]);
                        tmp.add(numS[k]);
                        res.add(tmp);
                        j += 1;
                        while( (numS[j] == numS[j-1]) && ((j+1) < (numS.length-1))){
                            j += 1;
                        }
                        k -= 1;
                        while(numS[k] == numS[k+1]){
                            k -= 1;
                        }
                    }else if(s > 0){
                        k -= 1;
                        while( numS[k] == numS[k + 1]){
                            k -= 1;
                        }
                    }else{
                        j += 1;
                        while(numS[j] ==numS[j-1] && (j+1 < numS.length-1)){
                            j +=1;
                        }
                    }
                }
            }
            i += 1;

        }
        return res;
    }
}