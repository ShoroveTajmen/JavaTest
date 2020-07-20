package Hackerrankkk;
import java.io.*;
import java.util.*;

import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String[]a = s.split("[\\s,!._@'?+]");
        StringBuffer sb = new StringBuffer();
        int counter = 0;
        for(int i=0; i<a.length; i++){
            if(a[i].isEmpty()){
                continue;
            }
            counter++;
            sb.append(a[i]);
            sb.append("\n");
        }
        System.out.println(counter);
        System.out.println(sb.toString());
    }
}
