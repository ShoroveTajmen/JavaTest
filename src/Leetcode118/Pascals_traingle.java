package Leetcode118;

import java.util.ArrayList;
import java.util.List;

public class Pascals_traingle {
    public static List<List<Integer>> generate(int numRows) {
        if(numRows==0)return new ArrayList<>();
        List<List<Integer>>result = new ArrayList<>();
        List<Integer>begin = new ArrayList<>();
        begin.add(1);
        result.add(begin);

        for(int i=1;i<numRows;i++){
            List<Integer>prevarr =result.get(i-1);
            List<Integer>currentarr = new ArrayList<>();
            for(int j=0; j<i+1; j++){
                Integer prevOne = j-1>=0?prevarr.get(j-1):0;
                Integer prevTwo = j<prevarr.size()?prevarr.get(j):0;
                currentarr.add(prevOne+prevTwo);
            }
            result.add(currentarr);
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>>result = generate(5);
        for(List<Integer>row:result) {
            System.out.println(row);
        }
       // System.out.println(result);

    }
}
