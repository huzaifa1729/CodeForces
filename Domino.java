import java.util.Scanner;
public class Domino{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int total = n*m;
        if(total%2==0)
        {
            System.out.println(total/2);
        }
        else
        {
            System.out.println((total-1)/2);
        }
        sc.close();
    }
}