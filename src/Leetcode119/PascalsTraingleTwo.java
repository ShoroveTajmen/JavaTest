package Leetcode119;

import java.util.ArrayList;
import java.util.List;

public class PascalsTraingleTwo {
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<=rowIndex; i++){
            List<Integer>current = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    current.add(1);
                }
                else{
                    List<Integer>prevRow = result.get(i-1);
                    int a = prevRow.get(j);
                    int b = prevRow.get(j-1);
                    current.add(a+b);
                }
            }
            result.add(current);
        }
        return result.get(rowIndex);
    }

    public static void main(String[] args) {
        List<Integer>result = getRow(4);

        System.out.println(result);
    }
}
