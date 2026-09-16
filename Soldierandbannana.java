import java.util.Scanner;
public class Soldierandbannana{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();//cost of bannana
        int n = sc.nextInt();//number of dollors
        int w = sc.nextInt();//number of bannanas
        sc.close();
        int total = k*w*(w+1)/2;
        int borrow = total-n;
        System.out.println(Math.max(0,borrow));
    }
}
