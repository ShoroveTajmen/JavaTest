public class trial {
    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        int z = 4;
        int s = ((--x)+(y++)+(++x)+(--y)+(z++)+(--z));
        System.out.println(s);
    }
}
