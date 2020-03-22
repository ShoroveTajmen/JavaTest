package javatest;

public class test1 {
    public static void main(String[] args) {
        String s1 = "name";
        String s2 = "name";
        String s3 = new String("name");


        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s1);
        System.out.println(s1.equals(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.equalsIgnoreCase(s1));



    }
}
